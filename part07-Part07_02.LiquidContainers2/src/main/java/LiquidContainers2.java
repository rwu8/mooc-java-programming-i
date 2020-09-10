
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String command = input.split(" ")[0];
            int amount = Integer.valueOf(input.split(" ")[1]);

            if (command.equals("add")) {
                if (firstContainer.contains() < 100) {
                    firstContainer.add(amount);
                } else {
                    secondContainer.add(amount);
                }
            } else if (command.equals("move")) {
                 if (firstContainer.contains() >= amount) {
                    firstContainer.remove(amount);
                    secondContainer.add(amount);
                } else {
                    secondContainer.add(firstContainer.contains());
                    firstContainer.remove(firstContainer.contains());
                }
            } else if (command.equals("remove")) {
                if (secondContainer.contains() > 0) {
                    secondContainer.remove(amount);
                } else {
                    firstContainer.remove(amount);
                }
            }
        }
    }
}