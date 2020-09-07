
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int age = 0;
		int maxAge = 0;
		String oldestPerson = "";

		while (true) {
			String input = scanner.nextLine();
			if (input.equals("")) {
				break;
			}

			String[] parts = input.split(",");
			age = Integer.valueOf(parts[1]);

			if (age > maxAge) {
				maxAge = age;
				oldestPerson = parts[0];
			}
		}
		System.out.println("Name of the oldest: " + oldestPerson);
    }
}
