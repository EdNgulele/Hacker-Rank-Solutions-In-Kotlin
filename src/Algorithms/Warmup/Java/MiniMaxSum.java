package Algorithms.Warmup.Java;

import java.util.Scanner;

public class MiniMaxSum {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Long[] arr = new Long[5];

        String[] arrItems = scan.nextLine().split(" ");

        for (int i = 0; i < arrItems.length; i++) {
            Long item = Long.parseLong(arrItems[i]);
            arr[i] = item;
        }

        miniMaxSum(arr);

    }

    static void miniMaxSum(Long[] arr) {

        Long sum = 0L;
        Long[] minMaxValues = new Long[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j];

            }
            minMaxValues[i] = sum - (arr[i]);
            sum = 0L;
        }


        swap(minMaxValues);

        System.out.println(minMaxValues[0] + " " + minMaxValues[minMaxValues.length - 1]);

    }


    public static void swap(Long[] numArray) {

        int n = numArray.length;
        Long temp = 0L;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (numArray[j - 1] > numArray[j]) {
                    temp = numArray[j - 1];
                    numArray[j - 1] = numArray[j];
                    numArray[j] = temp;
                }

            }
        }


    }
}
