package ge.edu.tsu.hcrs.control_panel.server.testdata;

public class TestDataCreator1 {

//    private static NormalizedDataDAO normalizedDataDAO = new NormalizedDataDAOImpl();
//
//    private static ImageCutter imageCutter = new ImageCutter();
//
//    private static ImageTransformer imageTransformer = new ImageTransformer();
//
//    private static String path1 = "D:\\Bachelor Project\\handwriting_recognition\\images\\created_images\\geo";
//
//    private static String path2 = "D:\\Bachelor Project\\handwriting_recognition\\images\\created_images\\geo_1";
//
//    private static String path3 = "D:\\Bachelor Project\\handwriting_recognition\\images\\created_images\\test_geo";
//
//    public static void main(String[] args) {
//        saveNormalizedDatas(path1, 29, 23, "made_by_javafx_canvas_1");
//        saveNormalizedDatas(path2, 29, 23, "made_by_javafx_canvas_2");
//        saveNormalizedDatas(path3, 29, 23, "made_by_javafx_canvas_3");
//    }
//
//    private static void saveNormalizedDatas(String path, int height, int width, String generation) {
//        List<NormalizedData> normalizedDataList = new ArrayList<>();
//        File folder = new File(path);
//        for (File file : folder.listFiles()) {
//            if (file.isFile()) {
//                try {
//                    BufferedImage image = ImageIO.read(file);
//                    NormalizedData normalizedData = new NormalizedData(width, height, imageTransformer.getFloatArrayFromImage(
//                            imageCutter.cutCornerUnusedParts(image, -1), width, height, -1), file.getName().charAt(0), generation);
//                    normalizedDataList.add(normalizedData);
//                } catch (IOException ex) {
//                    System.out.println(ex.getMessage());
//                }
//            }
//        }
//        for (NormalizedData normalizedData : normalizedDataList) {
//            normalizedDataDAO.addNormalizedData(normalizedData);
//        }
//    }
}
