package day8.Task1;

public class Task1 {
    public static void main(String[] args) {
        long start1 = System.currentTimeMillis();
        for (int i = 1; i < 20001; i++) {
            String range = "";
            range += i + " ";
            System.out.print(range);
        }
        long finish1 = System.currentTimeMillis();
        long start2 = System.currentTimeMillis();
        for (int i = 1; i < 20001; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(i + " ");
            System.out.print(sb.toString());
        }
        long finish2 = System.currentTimeMillis();
        System.out.printf("\nВремя, затраченное на создание строки с использованием метода конкатенации: %d", finish1 - start1);
        System.out.printf("\nВремя, затраченное на создание строки с использованием StringBuilder: %d\n", finish2 - start2);
    }
}
