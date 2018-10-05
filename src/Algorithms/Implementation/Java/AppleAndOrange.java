package Algorithms.Implementation.Java;

public class AppleAndOrange {

    public static void main(String[] args) {
        int[] apples = {-2, 2, 1};
        int[] oranges = {5, -6};

        int s = 7;
        int t = 11;

        int a = 5; //Larry's position
        int b = 15; //Bob's position

        int m = apples.length;
        int n = oranges.length;

        countApplesAndOranges(s, t, a, b, apples, oranges);


    }

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        int landing;
        int bobPoints = 0;
        int larryPoints = 0;

        for (int i = 0; i < apples.length; i++) {
            landing = a + apples[i];
            if (landing >= s && landing <= t) 
                bobPoints++;
        }

        for (int i = 0; i < oranges.length; i++) {
            landing = b + oranges[i];

            if (landing >= s && landing <= t) 
                larryPoints++;
        }

        System.out.println(bobPoints );
        System.out.println( larryPoints);

    }
}
