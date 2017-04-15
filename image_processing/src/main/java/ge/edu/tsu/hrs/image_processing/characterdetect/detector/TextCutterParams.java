package ge.edu.tsu.hrs.image_processing.characterdetect.detector;

public class TextCutterParams {

    private int checkedRGBMaxValue = -2;

    private int checkNeighborRGBMaxValue = -5777216;

    private boolean useJoiningFunctional = true;

    private int percentageOfSameForJoining = 35;

    public int getCheckedRGBMaxValue() {
        return checkedRGBMaxValue;
    }

    public void setCheckedRGBMaxValue(int checkedRGBMaxValue) {
        this.checkedRGBMaxValue = checkedRGBMaxValue;
    }

    public int getCheckNeighborRGBMaxValue() {
        return checkNeighborRGBMaxValue;
    }

    public void setCheckNeighborRGBMaxValue(int checkNeighborRGBMaxValue) {
        this.checkNeighborRGBMaxValue = checkNeighborRGBMaxValue;
    }

    public boolean isUseJoiningFunctional() {
        return useJoiningFunctional;
    }

    public void setUseJoiningFunctional(boolean useJoiningFunctional) {
        this.useJoiningFunctional = useJoiningFunctional;
    }

    public int getPercentageOfSameForJoining() {
        return percentageOfSameForJoining;
    }

    public void setPercentageOfSameForJoining(int percentageOfSameForJoining) {
        this.percentageOfSameForJoining = percentageOfSameForJoining;
    }
}
