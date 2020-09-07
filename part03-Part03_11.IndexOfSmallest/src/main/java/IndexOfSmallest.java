
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
		ArrayList<Integer> list = new ArrayList<>();
		while (true) {
			int input = Integer.valueOf(scanner.nextLine());
			if (input == 9999) {
				break;
			}

			list.add(input);
		}

		int smallest = 1000000;
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
		for (int i=0; i<list.size(); i++) {
			int num = list.get(i);
			if (num < smallest) {
				smallest = num;
			}
		}
		System.out.println("Smallest number: " + smallest);

		for (int i=0; i<list.size(); i++) {
			int num = list.get(i);
			if (num == smallest) {
				System.out.println("Found at index: " + i);
			}
		}

    }
}
