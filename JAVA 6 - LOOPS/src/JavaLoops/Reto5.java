package JavaLoops;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Username: ");
        String user = scanner.nextLine();
        System.out.print("Password: ");
        String pass = scanner.nextLine();

        System.out.println("\nWelcome, " + user + "!");

        double balance = 1000.00;
        int option;

        do {
            System.out.println("\n===== MAIN MENU =====");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw money");
            System.out.println("4. Check latest movements");
            System.out.println("5. Convert currencies");
            System.out.println("0. Exit");
            System.out.println("Select an option");
            option = scanner.nextInt();

            switch (option) {

                case 1:
                    System.out.printf("Available balance: $%.2f%n", balance);
                    break;

                case 2:
                    System.out.print("Amount to deposit: $");
                    double deposit = scanner.nextDouble();
                    if (deposit <= 0) {
                        System.out.println("The amount must be greater than 0.");
                    } else {
                        balance += deposit;
                        System.out.printf("Deposit successful, new balance: $%.2f%n", balance);
                    }
                    break;

                case 3:
                    System.out.print("Amount to withdraw: $");
                    double withdraw = scanner.nextDouble();
                    if (withdraw <= 0) {
                        System.out.println("The amount must be greater than 0.");
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient funds");
                        System.out.printf("Your available balance is: $%.2f%n", balance);
                    } else {
                        balance -= withdraw;
                        System.out.printf("Successful withdrawal, new balance: $%.2f%n", balance);
                    }
                    break;

                case 4:
                    System.out.println("Checking last movements...");
                    break;

                case 5:
                    System.out.println("\n---Convert currencies---");
                    System.out.println("1. MXN -> USD");
                    System.out.println("2. USD -> MXN");
                    System.out.println("3. MXN -> EUR");
                    System.out.println("4. EUR -> MXN");
                    System.out.println("5. USD -> EUR");
                    System.out.println("6. EUR -> USD");
                    System.out.println("Choose the currencies: ");
                    int currencies = scanner.nextInt();

                    System.out.print("Amount to convert: ");
                    double amountToConvert = scanner.nextDouble();
                    double convertResult;

                    switch (currencies) {
                        case 1: convertResult = amountToConvert / 17.15;
                            System.out.printf("%.2f MXN = %.2f USD%n", amountToConvert, convertResult);
                            break;

                        case 2: convertResult = amountToConvert * 17.15;
                            System.out.printf("%.2f USD = %.2f MXN%n", amountToConvert, convertResult);
                            break;

                        case 3: convertResult = amountToConvert / 18.50;
                            System.out.printf("%.2f MXN = %.2f EUR%n", amountToConvert, convertResult);
                            break;

                        case 4: convertResult = amountToConvert * 18.50;
                            System.out.printf("%.2f EUR = %.2f MXN%n", amountToConvert, convertResult);
                            break;

                        case 5: convertResult = amountToConvert / 1.08;
                            System.out.printf("%.2f USD = %.2f EUR%n", amountToConvert, convertResult);
                            break;

                        case 6: convertResult = amountToConvert * 1.08;
                            System.out.printf("%.2f EUR = %.2f USD%n", amountToConvert, convertResult);
                            break;

                        default:
                            System.out.println("No valid currencies. Please, try again.");
                    }
            }
        } while (option != 0);

        scanner.close();
    }
}
