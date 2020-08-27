package day4.Task4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int maxSum = 0;
        int index = 0;
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(10);
        }
        for (int i = 2; i < 10; i++) {
            int sum = a[i - 2] + a[i - 1] + a[i];
            if (sum > maxSum) {
                maxSum = sum;
                 index = i - 2;
            }
        }
        System.out.println(index + "\n" + maxSum);
    }
}
