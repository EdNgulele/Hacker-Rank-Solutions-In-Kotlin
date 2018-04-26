package Algorithms.Warmup.Java;

import java.util.Scanner;

public class Staircase {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());


        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {

                if (n - i - 2 < j) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
        s.close();

    }
}
