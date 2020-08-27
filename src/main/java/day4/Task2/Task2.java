package day4.Task2;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] a = new int[100];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int count = 0;
        int sum = 0;
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(10001);
            if (a[i] > max) max = a[i];
            if (a[i] < min) min = a[i];
            if (a[i] % 10 == 0 || a[i] == 0){
                count ++;
                sum += a[i];
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + count);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sum);
    }
}
