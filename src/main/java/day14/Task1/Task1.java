package day14.Task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("Test");
        try {
            Scanner sc = new Scanner(file);
            String line = sc.nextLine();
            String[] numbers = line.split(" ");
            if (numbers.length != 10) throw new IllegalArgumentException();
            int sum = 0;
            for (String number : numbers) sum += Integer.parseInt(number);
            System.out.println("Сумма: " + sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}
