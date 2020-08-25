package day2.Task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите переменную x: ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = 0;
        if (x >= 5) {
            y = (x * x - 10) / (x + 7);
        }
        if (x < 5 && x > -3) {
            y = (x + 3) * (x * x - 2);
        }
        if (x <= -3)
            y = 420;
        System.out.println("y = " + y);
    }
}
