package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Player p1 = new Player(generateStamina(random));
        Player p2 = new Player(generateStamina(random));
        Player p3 = new Player(generateStamina(random));
        Player p4 = new Player(generateStamina(random));
        Player p5 = new Player(generateStamina(random));
        Player p6 = new Player(generateStamina(random));
        Player.info();
        Player p7 = new Player(generateStamina(random));
        Player p8 = new Player(generateStamina(random));
        Player.info();

        while (p1.getStamina() > 0) {
            p1.run();
        }
        Player.info();
    }

    private static int generateStamina(Random random) {
        return random.nextInt(11) + 90;
    }
}
