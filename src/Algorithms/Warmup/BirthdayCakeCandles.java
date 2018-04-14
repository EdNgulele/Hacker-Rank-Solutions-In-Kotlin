package Algorithms.Warmup;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        int[] num = {3, 2, 1, 3};
        System.out.println();

        System.out.println("Candles: " + birthdayCakeCandles(num.length, num));
    }

    static int birthdayCakeCandles(int n, int[] ar) {
        int tallestCandle = 0;
        int count = 0;
        for (int height : ar)
            if (height > tallestCandle) {
                tallestCandle = height;
                count = 1;
            } else if (height == tallestCandle)
                count++;
        return count;
    }
}



