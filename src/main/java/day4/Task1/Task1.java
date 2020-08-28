package day4.Task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите число элементов массива: ");
        int lengthOfArray = sc.nextInt();
        int moreThanEight = 0;
        int equalsOne = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;
        int sum = 0;
        int [] a = new int[lengthOfArray];
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(11);
            if (a[i] > 8) moreThanEight ++;
            if (a[i] == 1)equalsOne ++;
            if (a[i] % 2 == 0) evenNumbers ++;
            else oddNumbers ++;
            sum += a[i];
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Длина массива: " + lengthOfArray);
        System.out.println("Количество чисел больше 8: " + moreThanEight);
        System.out.println("Количество чисел равных 1: " + equalsOne);
        System.out.println("Количество четных чисел: " + evenNumbers);
        System.out.println("Количество нечетных чисел: " + oddNumbers);
        System.out.println("Сумма всех элементов массива:  " + sum);
    }
}
