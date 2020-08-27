package day4.Task3;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][]a = new int[12][8];
        int maxSum = 0;
        int index = 0;
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rand.nextInt(51);
                sum += a[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                index = i;
            }
        }
        System.out.println(index);
    }
}
