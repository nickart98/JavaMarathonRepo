package day2.Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число этажей: ");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        if (k >= 1 && k <= 4)
            System.out.println("Малоэтажный дом");
        if (k >= 5 && k <= 8)
            System.out.println("Среднеэтажный дом");
        if (k >= 9)
            System.out.println("Многоэтажный дом");
        if (k<=0)
            System.out.println("Введите корректное значение");
    }
}
