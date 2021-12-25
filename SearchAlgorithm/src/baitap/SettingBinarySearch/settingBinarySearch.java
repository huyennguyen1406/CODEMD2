package baitap.SettingBinarySearch;

import java.util.Scanner;

public class settingBinarySearch {
    public static int binarySearch(int[] list, int left, int right, int value) {
        int middle = (left + right) / 2;
        if (left < right) {
            if (list[middle] > value) {
                right = middle - 1;
                return binarySearch(list, left, right, value);
            } else if(list[middle] < value){
                left = middle + 1;
                return binarySearch(list, left, right, value);
            } else {
                return middle;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of list: ");
        int size = scanner.nextInt();
        int[] list = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the " + (i + 1) + " number: ");
            list[i] = scanner.nextInt();
        }
        int temp;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i] < list[j]) {
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        int left = 0;
        int right = list.length - 1;
        System.out.println("Enter the number you to find: ");
        int findNum = scanner.nextInt();
        System.out.println(binarySearch(list, left, right, findNum));
    }
}
