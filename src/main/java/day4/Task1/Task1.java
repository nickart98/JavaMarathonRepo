package day4.Task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите число элементов массива: ");
        int x = sc.nextInt();
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int sum = 0;
        int [] a = new int[x];
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(11);
            if (a[i] > 8) b ++;
            if (a[i] == 1)c ++;
            if (a[i] % 2 == 0) d ++;
            else e ++;
            sum += a[i];
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Длина массива: " + x);
        System.out.println("Количество чисел больше 8: " + b);
        System.out.println("Количество чисел равных 1: " + c);
        System.out.println("Количество четных чисел: " + d);
        System.out.println("Количество нечетных чисел: " + e);
        System.out.println("Сумма всех элементов массива:  " + sum);
    }
}
