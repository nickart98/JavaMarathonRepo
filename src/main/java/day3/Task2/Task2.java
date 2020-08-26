package day3.Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b;
        do {
            System.out.println("Введите числа: ");
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            System.out.println("a / b = " + a/b);
        }
        while (b != 0);
    }
}
