
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int first = Integer.valueOf(scanner.nextLine());
		int second = Integer.valueOf(scanner.nextLine());
		divisibleByThreeInRange(first, second);
    }

	public static void divisibleByThreeInRange(int beginning, int end) {
    	for (int i=beginning; i<=end; i++) {
    		if (i != 0 && i % 3 == 0) {
				System.out.println(i);
			}
		}
	}
}
