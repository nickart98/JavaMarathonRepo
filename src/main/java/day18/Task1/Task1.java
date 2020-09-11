package day18.Task1;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println("Сумма элементов массива: " + numbersSum(numbers, numbers.length - 1));
    }

    public static int numbersSum(int[] numbers, int i) {
        return (i == 0) ? numbers[i] : (numbers[i] + numbersSum(numbers, --i));
    }
}
