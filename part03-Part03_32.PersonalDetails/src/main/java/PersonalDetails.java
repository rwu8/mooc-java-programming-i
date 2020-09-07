
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		int age = 0;
		int maxAge = 0;
		String longestName = "";

		while (true) {
			String input = scanner.nextLine();
			if (input.equals("")) {
				break;
			}

			String[] parts = input.split(",");
			sum = sum + Integer.valueOf(parts[1]);
			count = count + 1;
			age = Integer.valueOf(parts[1]);
			if (age > maxAge) {
				maxAge = age;
			}

			if (parts[0].length() > longestName.length()) {
				longestName = parts[0];
			}
		}
		System.out.println("Longest name: " + longestName);
		System.out.println("Age average: " + (1.0 * sum / count));
	}
}
