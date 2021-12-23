package thuchanh;

public class Demo {
    public static void main(String[] args) {
        Demo.recursivePrint(1);
    }

    public static void recursivePrint(int num) {
        System.out.println("Number: " + num);

        if (num == 0)
            return;
        else
            recursivePrint(++num);
    }
}
