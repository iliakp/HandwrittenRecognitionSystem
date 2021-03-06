package ge.edu.tsu.hrs.control_panel.server.processor.neuralnetwork;

import ge.edu.tsu.hrs.control_panel.model.network.CharSequence;
import ge.edu.tsu.hrs.control_panel.model.network.TrainingDataInfo;
import ge.edu.tsu.hrs.control_panel.model.sysparam.Parameter;
import ge.edu.tsu.hrs.control_panel.server.caching.CachedProductionNetwork;
import ge.edu.tsu.hrs.control_panel.server.dao.networkinfo.NetworkInfoDAO;
import ge.edu.tsu.hrs.control_panel.server.dao.networkinfo.NetworkInfoDAOImpl;
import ge.edu.tsu.hrs.control_panel.server.dao.trainingdatainfo.TrainingDataInfoDAO;
import ge.edu.tsu.hrs.control_panel.server.dao.trainingdatainfo.TrainingDataInfoDAOImpl;
import ge.edu.tsu.hrs.control_panel.server.processor.systemparameter.SystemParameterProcessor;
import ge.edu.tsu.hrs.neural_network.neural.network.NeuralNetwork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ProductionNetworkProcessor {

    private final SystemParameterProcessor systemParameterProcessor = new SystemParameterProcessor();

    private final TrainingDataInfoDAO trainingDataInfoDAO = new TrainingDataInfoDAOImpl();

    private static final NetworkInfoDAO networkInfoDAO = new NetworkInfoDAOImpl();

    private final Parameter productionTrainingDataInfoPath = new Parameter("productionTrainingDataInfoPath", "network_workspace/production.tdi");

    private final Parameter productionCharSequencePath = new Parameter("productionCharSequencePath", "network_workspace/production.chs");

    public void updateProductionNetwork(int networkId, int networkExtraId) {
        try {
            NeuralNetwork neuralNetwork = NeuralNetworkHelper.loadNeuralNetwork(networkId, networkExtraId, true, false);
            NeuralNetworkHelper.saveNeuralNetwork(networkId, neuralNetwork, false, true);
            TrainingDataInfo trainingDataInfo = trainingDataInfoDAO.getTrainingDataInfo(networkId);
            serializeTrainingDataInfo(trainingDataInfo, systemParameterProcessor.getStringParameterValue(productionTrainingDataInfoPath));
            CharSequence charSequence = networkInfoDAO.getCharSequenceById(networkId);
            serializeCharSequence(charSequence, systemParameterProcessor.getStringParameterValue(productionCharSequencePath));
            CachedProductionNetwork.loadData();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("can't update production network");
        }
    }

    public NeuralNetwork getProductionNeuralNetwork() {
        return NeuralNetworkHelper.loadNeuralNetwork(-1, 0, false, true);
    }

    public TrainingDataInfo getProductionTrainingDataInfo() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(systemParameterProcessor.getStringParameterValue(productionTrainingDataInfoPath)))) {
            return (TrainingDataInfo) in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public CharSequence getProductionCharSequence() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(systemParameterProcessor.getStringParameterValue(productionCharSequencePath)))){
            return (CharSequence) in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    private void serializeTrainingDataInfo(TrainingDataInfo trainingDataInfo, String path) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path));
        out.writeObject(trainingDataInfo);
        out.close();
    }

    private void serializeCharSequence(CharSequence charSequence, String path) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path));
        out.writeObject(charSequence);
        out.close();
    }
}
