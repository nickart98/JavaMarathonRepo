package day3.Task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите числа: ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            if (b == 0) {
                System.out.println("Деление на 0");
                i -=1;
            }
            if (b != 0)
            System.out.println("a / b = " + a/b);
        }
    }
}
