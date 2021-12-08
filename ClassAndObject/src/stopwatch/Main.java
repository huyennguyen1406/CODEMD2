package stopwatch;

import javafx.scene.paint.Stop;

public class Main {
    public static void main(String[] args) {
        StopWatch dongHoBamGio = new StopWatch();
        dongHoBamGio.getStartTime();
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 1000; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        dongHoBamGio.getEndTime();
        System.out.println(dongHoBamGio.stopWatch());
    }
}
