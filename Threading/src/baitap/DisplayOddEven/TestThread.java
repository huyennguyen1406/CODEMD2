package baitap.DisplayOddEven;

public class TestThread {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();
        Thread even = new Thread(evenThread);
        Thread odd = new Thread(oddThread);
        even.start();
        odd.start();
    }
}
