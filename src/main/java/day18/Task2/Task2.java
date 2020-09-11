package day18.Task2;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Количество цифр 7: " + count7(717771237));
    }

    public static int count7(int n) {
        if (n == 0) return 0;
        return n % 10 == 7 ? 1 + count7(n / 10) : count7(n / 10);
    }
}
