package day7.Task2;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player(91);
        Player player2 = new Player(91);
        Player player3 = new Player(93);
        Player player4 = new Player(94);
        Player player5 = new Player(95);
        Player player6 = new Player(96);
        Player.info();
        Player.counter(player1, player2, player3, player4, player5, player6);
        Player.info();
        Player.run(player1, player2, player3, player4, player5, player6);
        Player.info();
    }
}
