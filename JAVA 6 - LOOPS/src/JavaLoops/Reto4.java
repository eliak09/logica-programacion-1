package JavaLoops;

import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Age: ");
        int age = scanner.nextInt();

        System.out.println("Monthly income: $");
        double income = scanner.nextDouble();

        double bonus;

        if (age >70) {
            bonus = 500;
        } else if (age >= 50) {
            bonus = 400;
        } else if (age >=30) {
            bonus = 250;
        } else {
            bonus = 100;
        }

        if (income >= 300) {
            bonus = bonus * 1.10;
        } else {
            bonus = bonus * 1.05;
        }

        System.out.printf("Your monthly bonus is: $%.2f%n", bonus);

        scanner.close();
    }
}
