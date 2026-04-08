package JavaLoops;

import java.util.Random;
import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(10) + 1;
        int trying;

        System.out.println("¡Guess the lucky number between 1 and 10!");

        while (true) {
            System.out.println("Try it now: ");
            trying  = scanner.nextInt();

            if (trying < number) {
                System.out.println("Try it with a bigger one.");
            } else if (trying > number) {
                System.out.println("Try it with a lower one.");
            } else {
                System.out.println("Lucky number! :DDD");
                break;
            }
        }

        scanner.close();
    }
}
