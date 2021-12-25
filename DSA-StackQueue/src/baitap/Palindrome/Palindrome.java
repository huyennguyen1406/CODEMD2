package baitap.Palindrome;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string: ");
        String string = scanner.nextLine();

        Stack<Character> stack = new Stack<>();
        Queue<Character> stringQueue = null;
        char[] ch = string.toLowerCase().toCharArray();
        for (int i = 0; i < ch.length; i++) {
            stack.push((ch[i]));
        }

        boolean check = true;
        for (int i = 0; i < ch.length; i++) {
            if (!stack.pop().equals(ch[i])) {
                check = false;
                break;
            }
        }
        System.out.println(check);
    }
}
