
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");
		int total = 0;
        // toteuta listan lukujen summan laskeminen tänne
		for (int num: list) {
			total += num;
		}

		System.out.println("Sum: " + total);
    }
}
