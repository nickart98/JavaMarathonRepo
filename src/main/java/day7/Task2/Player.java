package day7.Task2;


import java.util.Random;

public class Player {
    private static int stamina, countPlayers;
    public final static int MAX_STAMINA = 100, MIN_STAMINA = 0;
    static int i;
    private static int[] players = new int[6];


    public static void counter() {
        Random rd = new Random();
        for (int i = 0; i < players.length; i++) {
            stamina = rd.nextInt(10) + 90;
            countPlayers++;
        }
        System.out.println("В игру вошло " + countPlayers + " игроков");
    }

    public static void run() {
        while (stamina > MIN_STAMINA) {
            stamina--;
        }
        System.out.println("Из игры выбыл 1 игрок");
        countPlayers--;
    }

    public static void info() {
        switch (countPlayers) {
            case 2:
            case 3:
            case 4:
                System.out.println("Команды неполные, есть еще " + (6 - countPlayers) + " свободных места");
                break;
            case 1:
            case 0:
                System.out.println("Команды неполные, есть еще " + (6 - countPlayers) + " свободных мест");
                break;
            case 5:
                System.out.println("Команды неполные, есть еще " + (6 - countPlayers) + " свободное место");
                break;
            default:
                System.out.println("Команды полные");
                break;
        }
    }
}