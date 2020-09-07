
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Enter username:");
		String username = scanner.nextLine();
		System.out.println("Enter password:");
		String pw = scanner.nextLine();

		if ((username.equals("alex") && pw.equals("sunshine") || (username.equals("emma") && pw.equals("haskell")))) {
			System.out.println("You have successfully logged in!");
		} else {
			System.out.println("Incorrect username or password!");
		}
    }
}
