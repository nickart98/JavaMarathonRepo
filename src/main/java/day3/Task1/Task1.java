package day3.Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city;
        do {
            System.out.println("Введите город: ");
            city = scanner.nextLine();
            switch (city) {
                case "Москва":
                case "Ростов":
                case "Владивосток":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Турин":
                case "Милан":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кельн":
                    System.out.println("Германия");
                    break;
                case "Stop":
                    System.out.println("Bye-bye!");
                    break;
                default:
                    System.out.println("Неизвестная страна");
                    break;
            }
        }
        while (!city.equals("Stop"));
    }
}