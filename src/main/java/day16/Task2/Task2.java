package day16.Task2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            int[] numbers = new int[1000];
            List<Double> avgnumbers = new ArrayList<>();
            double sumAvg = 0;
            int sum = 0;

            PrintWriter pwAll = new PrintWriter("files/1kRandomNumbers.txt");
            PrintWriter pwAvg = new PrintWriter("files/AverageNumbers.txt");
            Random rd = new Random();

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = rd.nextInt(100);
                pwAll.print(numbers[i] + " ");
            }

            for (int j = 0; j < numbers.length; j++) {
                sum += numbers[j];
                if (j != 0 && ((j + 1) % 20 == 0)) {
                    avgnumbers.add((double) sum / 20);
                    sum = 0;
                }
            }

            for (Double avgnumber : avgnumbers) {
                sumAvg += avgnumber;
            }
            System.out.println((int) sumAvg);
            pwAvg.print(avgnumbers);
            pwAll.close();
            pwAvg.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}