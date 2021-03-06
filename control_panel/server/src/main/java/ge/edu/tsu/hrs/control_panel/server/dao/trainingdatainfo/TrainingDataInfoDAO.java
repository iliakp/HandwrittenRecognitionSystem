package ge.edu.tsu.hrs.control_panel.server.dao.trainingdatainfo;

import ge.edu.tsu.hrs.control_panel.model.network.TrainingDataInfo;

public interface TrainingDataInfoDAO {

	void addTrainingDataInfo(TrainingDataInfo trainingDataInfo);

	TrainingDataInfo getTrainingDataInfo(Integer id);

	void deleteTrainingDataInfo(int id);
}
