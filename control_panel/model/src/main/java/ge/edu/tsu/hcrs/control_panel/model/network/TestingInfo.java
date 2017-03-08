package ge.edu.tsu.hcrs.control_panel.model.network;

import ge.edu.tsu.hcrs.control_panel.model.network.normalizeddata.GroupedNormalizedData;

import java.io.Serializable;
import java.util.List;

public class TestingInfo implements Serializable {

    private int networkId;

    private List<GroupedNormalizedData> groupedNormalizedDatum;

    private int numberOfTest;

    private float squaredError;

    private float percentageOfCorrects;

    private float diffBetweenAnsAndBest;

    private float normalizedGeneralError;

    public int getNetworkId() {
        return networkId;
    }

    public void setNetworkId(int networkId) {
        this.networkId = networkId;
    }

    public List<GroupedNormalizedData> getGroupedNormalizedDatum() {
        return groupedNormalizedDatum;
    }

    public void setGroupedNormalizedDatum(List<GroupedNormalizedData> groupedNormalizedDatum) {
        this.groupedNormalizedDatum = groupedNormalizedDatum;
    }

    public int getNumberOfTest() {
        return numberOfTest;
    }

    public void setNumberOfTest(int numberOfTest) {
        this.numberOfTest = numberOfTest;
    }

    public float getSquaredError() {
        return squaredError;
    }

    public void setSquaredError(float squaredError) {
        this.squaredError = squaredError;
    }

    public float getPercentageOfCorrects() {
        return percentageOfCorrects;
    }

    public void setPercentageOfCorrects(float percentageOfCorrects) {
        this.percentageOfCorrects = percentageOfCorrects;
    }

    public float getDiffBetweenAnsAndBest() {
        return diffBetweenAnsAndBest;
    }

    public void setDiffBetweenAnsAndBest(float diffBetweenAnsAndBest) {
        this.diffBetweenAnsAndBest = diffBetweenAnsAndBest;
    }

    public float getNormalizedGeneralError() {
        return normalizedGeneralError;
    }

    public void setNormalizedGeneralError(float normalizedGeneralError) {
        this.normalizedGeneralError = normalizedGeneralError;
    }
}
