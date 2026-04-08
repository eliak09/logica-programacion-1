package JavaLoops;

import java.util.Scanner;
import java.util.Random;

public class Reto1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number of players");
        int players = scanner.nextInt();

        if (players < 1) {
            System.out.println("¡At least you should play!");
        } else {
            Random rand = new Random();
            int winner = rand.nextInt(players) + 1;
            System.out.println("The lucky number is: " + winner);
        }

        scanner.close();
    }
}
