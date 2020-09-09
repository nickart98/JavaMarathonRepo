package day16.Task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1 {
    public static void customFormat(String pattern, double n){
        DecimalFormat myFormat = new DecimalFormat(pattern);
        System.out.print(n + "--->" +  myFormat.format(n));
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Test1");
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        int sum = 0;
        for (String number : numbers) sum += Double.parseDouble(number);
        double average = (double)sum/ (numbers.length - 1);
        customFormat("###.###\n",average);
    }
}
