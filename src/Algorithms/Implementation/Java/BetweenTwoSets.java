package Algorithms.Implementation.Java;


/**
 * 1 - Find the LCM (lowest common multiple) of the integers of the Array a
 * 2 - Find the GCD (greatest common divisor) of the integers of the Array b
 * 3 - Count how many multiples of LCM that evenly divides the GCD.
 */

public class BetweenTwoSets {

    public static void main(String[] args) {


    }

    static int getTotalX(int[] a, int[] b) {
       

    }

    static int findLmc(int[] a) {
        int result = 1;

        for (int i = 0; i < a.length; i++) {
            result = result * a[i] / findGcd(result, a[i]);
        }

        return result;
    }

    static int findGcd(int c, int d) {
        if (d == 0) {
            return c;
        } else {
            return findGcd(d, c % d);
        }
    }
}
