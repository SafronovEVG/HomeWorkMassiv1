package org.example;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        char[] massive3 = {'d', 's', 's'};
        double[] massive2 = {1.4345, 5.23432, 1.234325};
        System.out.println(Arrays.toString(massive3));
        System.out.println(Arrays.toString(massive2));
        for (int i = 0; i < massive3.length / 2; i++) {
            int x = massive3[i];
            massive3[i] = massive3[massive3.length - 1 - i];
            massive3[massive3.length - 1 - i] = (char) x;

        }
        System.out.println(Arrays.toString(massive3));
        for (int i = 0; i < massive2.length/2; i++) {
            double x =  massive2[i];
            massive2[i] = massive2[massive2.length - 1 - i];
            massive2[massive2.length-1-i]=x;
        }
        System.out.println(Arrays.toString(massive2));


    }
}
