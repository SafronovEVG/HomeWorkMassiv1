package org.example;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] massive = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 2 != 0) {
                int x = massive[i];
                x = x + 1;
                massive[i] = x;
            }
        }
        System.out.println(Arrays.toString(massive));
    }
}
