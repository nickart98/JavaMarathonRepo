package day7.Task2;


public class Player {
    private static int stamina, countPlayers;
    public final static int MAX_STAMINA = 100, MIN_STAMINA = 0;
    static int i;
    private static int[] players = new int[6];

    public Player(int stamina) {
        this.stamina = stamina;
    }


    public static void counter(Player player1, Player player2, Player player3, Player player4, Player player5, Player player6) {
        players[0] = player1.stamina;
        players[1] = player2.stamina;
        players[2] = player3.stamina;
        players[3] = player4.stamina;
        players[4] = player5.stamina;
        players[5] = player6.stamina;
        for (int i = 0; i < players.length; i++) {
            countPlayers++;
        }
        System.out.println("В игру вошло " + countPlayers + " игроков");
    }

    public static void run(Player player1, Player player2, Player player3, Player player4, Player player5, Player player6) {
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