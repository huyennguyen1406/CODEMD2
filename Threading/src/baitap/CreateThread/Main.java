package baitap.CreateThread;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        NumberGenerator numberGenerator1 = new NumberGenerator();
        Thread thread1 = new Thread(numberGenerator);
        Thread thread2 = new Thread(numberGenerator1);
        thread1.start();
        thread2.start();
        int max = Thread.MAX_PRIORITY;
        int min = Thread.MIN_PRIORITY;
        thread1.setPriority(max);
        thread2.setPriority(min);
    }
}
