
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		Points pointList = new Points();
        // Write your program here -- consider breaking the program into
        // multiple classes.
		System.out.println("Enter point totals, -1 stops:");
		while (true) {
			Integer input = Integer.valueOf(scanner.nextLine());
			if (input == -1) {
				break;
			}

			pointList.add(input);
		}
		double average = pointList.average();
		System.out.println("Point average (all): " + average);
		double passingAverage = pointList.passingAverage();
		if (passingAverage == 0.0) {
			System.out.println("Point average (passing): -");
		} else {
			System.out.println("Point average (passing): " + passingAverage);
		}
		System.out.println("Pass percentage: " + pointList.passPercentage());
		System.out.println("Grade distribution:");
		pointList.gradeDistribution();
    }
}
