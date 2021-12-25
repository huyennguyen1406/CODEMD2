package baitap.ReverseWord;

import java.util.Scanner;
import java.util.Stack;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi muốn đảo ngược: ");
        String mWord = sc.nextLine();
        String newWord = revereString(mWord);
        System.out.println(newWord);
    }

    private static String revereString(String mWord) {

        Stack<String> wStack = new Stack<>();
        char[] ch = mWord.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            wStack.push(String.valueOf(ch[i]));
        }
        String newWord = "";
        while (wStack.size() != 0){
            newWord += wStack.pop();
        }
        return newWord;
    }
}
