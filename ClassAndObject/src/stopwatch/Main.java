package stopwatch;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100000];
        for (int i = 0; i < args.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }
        stopWatch stopwatch = new stopWatch();

        stopwatch.start();
        selectionSort(array);
//        for (int i = 0; i < array.length; i++) {
//                System.out.print(array[i] + " ");
//        }
        stopwatch.stop();

        System.out.println("Time: " + stopwatch.getElapsedTime());
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int tempt = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tempt;
                }
            }
        }
    }
}
