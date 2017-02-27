package ge.edu.tsu.hcrs.image_processing.opencv.parameter.morphological;

import org.bytedeco.javacpp.opencv_core;
import org.bytedeco.javacpp.opencv_imgproc;

public class ErosionParams {

    // 0 - 1 - 2
    private int erosion_elem = 0;

    private int erosion_size = 1;

    private opencv_core.Mat element;

    public ErosionParams() {
        int erosion_type = 0;
        switch (erosion_elem) {
            case 0 :
                erosion_type = opencv_imgproc.MORPH_RECT;
                break;
            case 1 :
                erosion_type = opencv_imgproc.MORPH_CROSS;
                break;
            case 2 :
                erosion_type = opencv_imgproc.MORPH_ELLIPSE;
        }
        element = opencv_imgproc.getStructuringElement(erosion_type, new opencv_core.Size(2 * erosion_size + 1, 2 * erosion_size + 1), new opencv_core.Point(erosion_size, erosion_size));
    }

    public int getErosion_elem() {
        return erosion_elem;
    }

    public void setErosion_elem(int erosion_elem) {
        this.erosion_elem = erosion_elem;
    }

    public int getErosion_size() {
        return erosion_size;
    }

    public void setErosion_size(int erosion_size) {
        this.erosion_size = erosion_size;
    }

    public opencv_core.Mat getElement() {
        return element;
    }

    public void setElement(opencv_core.Mat element) {
        this.element = element;
    }
}
