package day7.Task2;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rd = new Random();
        Player player1 = new Player(rd.nextInt(10) + 90);
        Player player2 = new Player(rd.nextInt(10) + 90);
        Player player3 = new Player(rd.nextInt(10) + 90);
        Player player4 = new Player(rd.nextInt(10) + 90);
        Player player5 = new Player(rd.nextInt(10) + 90);
        Player player6 = new Player(rd.nextInt(10) + 90);
        Player.info();
        Player.run();
        Player.info();

    }
}