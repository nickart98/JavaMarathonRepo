package day3.Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Введите числа: ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            if (b == 0)
                break;
            System.out.println("a / b = " + a/b);
        }
    }
}
