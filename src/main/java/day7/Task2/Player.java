package day7.Task2;

public class Player {
    private static int countPlayers;
    private int stamina;
    public final static int MAX_STAMINA = 100, MIN_STAMINA = 0;


    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6)
        countPlayers++;
        else
            countPlayers = 6;
    }


    public void run() {
        if (stamina > MIN_STAMINA) {
            stamina--;
        }
        if (stamina == MIN_STAMINA || stamina == 1)
            System.out.println("Из игры выбыл 1 игрок");
        countPlayers--;
        System.out.println(countPlayers);
    }

    public static void info() {
        System.out.println(countPlayers);
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
                System.out.println("Обе команды укомплектованы");
                break;
        }
    }
}