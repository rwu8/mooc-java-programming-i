
import java.util.ArrayList;
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int limit = 100;
        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/" + limit);
            System.out.println("Second: " + secondContainer + "/" + limit);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String command = input.split(" ")[0];
            int amount = Integer.valueOf(input.split(" ")[1]);

            if (command.equals("add")) {
                if (amount < 0) {
                    continue;
                } else if (firstContainer < limit) {
                    if (firstContainer + amount > limit) {
                        firstContainer = limit;
                    } else {
                        firstContainer += amount;
                    }
                } else {
                    if (secondContainer + amount > limit) {
                        secondContainer = limit;
                    } else {
                        secondContainer += amount;
                    }
                }
            } else if (command.equals("move")) {
                if (amount < 0) {
                    continue;
                } else if (firstContainer >= amount && secondContainer + amount < limit) {
                    firstContainer -= amount;
                    secondContainer += amount;
                } else if (firstContainer >= amount && secondContainer + amount > limit) {
                    firstContainer -= amount;
                    secondContainer = limit;
                } else if (firstContainer < amount) {
                    secondContainer += firstContainer;
                    firstContainer = 0;
                    System.out.println(firstContainer + " and " + secondContainer);
                }
            } else if (command.equals("remove")) {
                if (amount < 0 || firstContainer == 0 && secondContainer == 0) {
                    continue;
                } else if (secondContainer > 0) {
                    if (amount > secondContainer) {
                        secondContainer = 0;
                    } else {
                        secondContainer -= amount;
                    }
                }
            }

        }
    }

}
