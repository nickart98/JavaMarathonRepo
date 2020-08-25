package day2.Task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Задайте границы диапазона: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int i = a + 1;
        while (i < b) {
            if (i % 5 == 0 && i % 10 != 0)
                System.out.println(i + " ");
            i++;
        }

    }
}
