
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int age = 0;
		int maxAge = 0;
        while (true) {
			String input = scanner.nextLine();
			if (input.equals("")) {
				break;
			}

			String[] parts = input.split(",");
			age = Integer.valueOf(parts[1]);
			if (age > maxAge) {
				maxAge = age;
			}
		}
		System.out.println("Age of the oldest: " + maxAge);
	}
}
