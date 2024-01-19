package software.ulpgc.kata3;

public class Main {
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.histogramDisplay().show(histogram());
        mainFrame.setVisible(true);
    }
    private static Histogram histogram(){
        return new Histogram() {
            @Override
            public int bins() {
                return 5;
            }

            @Override
            public double[] values() {
                return new double[] {1,2,1,3,4,3,2,1,5,4,3,7,8,5,4,7,1};
            }
        };
    }
}
