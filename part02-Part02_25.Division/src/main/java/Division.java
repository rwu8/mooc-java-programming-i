import java.util.Scanner;

public class Division {

    public static void main(String[] args) {

        // Once you have implemented the division method, you can
        // try it out here. Fopr example division(3,5);
        // should print "0.6"

        // division(3, 5);
		Scanner scanner = new Scanner(System.in);
		int num = Integer.valueOf(scanner.nextLine());
		int denom = Integer.valueOf(scanner.nextLine());

		division(num, denom);
    }

    // implement the method here
	public static void division(int numerator, int denominator) {
		System.out.println( (double) numerator / denominator);
	}
}
