package day2.Task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Задайте границы диапазона: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt() + 1;
        int b = scanner.nextInt();
        while (a < b) {
            if (a % 5 == 0 && a % 10 != 0)
                System.out.println(a + " ");
            a++;
        }

    }
}
