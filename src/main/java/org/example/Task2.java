package org.example;

public class Task2 {
    public static void main(String[] args) {
        int[] massive = new int[3];
        massive[0] = 1;
        massive[1] = 2;
        massive[2] = 3;
        for (int i = 0; i < massive.length; i++) {
            if (i == massive.length - 1) {
                System.out.println(massive[i]);
            } else
                System.out.print(massive[i] + ",");
        }
        char[] massive3 = {'d', 's', 's'};
        for (int i = 0; i < massive3.length; i++) {
            if (i == massive.length - 1) {
                System.out.println(massive3[i]);

            }else System.out.print(massive3[i]+",");

        }

        double[] massive2 = {1.4345, 5.23432, 1.234325};
        for (int i = 0; i < massive2.length; i++) {
            if (i == massive2.length - 1) {
                System.out.println(massive2[i]);
            }else System.out.print(massive2[i]+",");
        }
    }
}
