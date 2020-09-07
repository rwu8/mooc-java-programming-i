import java.util.Scanner;

public class FromOneToParameter {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = Integer.valueOf(scanner.nextLine());
		printUntilNumber(num);
    }

    public static void printUntilNumber(int numTimes) {
    	for (int i=1; i<=numTimes; i++) {
			System.out.println(i);
		}
	}

}
