
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
			System.out.println("Give a number:");
        	int num = Integer.valueOf(scanner.nextLine());
			if (num == 0) {
				break;
			} else if (num < 0) {
				System.out.println("Unsuitable number");
			} else {
				System.out.println(num * num);
			}
		}
    }
}
