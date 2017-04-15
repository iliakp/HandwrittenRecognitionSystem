package ge.edu.tsu.hrs.image_processing.characterdetect.util;

import ge.edu.tsu.hrs.image_processing.characterdetect.model.TextAdapter;
import ge.edu.tsu.hrs.image_processing.characterdetect.model.TextRow;

import java.util.Map;

public class TextAdapterUtil {

    public static int countCharactersFromTextAdapter(TextAdapter textAdapter) {
        int count = 0;
        for (TextRow textRow : textAdapter.getRows()) {
            count += textRow.getContours().size();
        }
        return count;
    }

    public static boolean isSpace(TextAdapter textAdapter, int distance, int delta) {
        if (textAdapter.getPossibleDistance() == -1) {
            textAdapter.setPossibleDistance(getMostFrequentDistance(textAdapter));
        }
        return textAdapter.getPossibleDistance() + delta < distance;
    }

    private static int getMostFrequentDistance(TextAdapter textAdapter) {
        int ans = -1;
        int max = -1;
        Map<Integer, Integer> distanceBetweenContours = textAdapter.getDistanceBetweenContours();
        for (Integer distance : distanceBetweenContours.keySet()) {
            if (distanceBetweenContours.get(distance) >= max) {
                max = distanceBetweenContours.get(distance);
                ans = distance;
            }
        }
        return ans;
    }
}
