import java.util.Scanner;

public class SerialPatternRecursive {

	static void CreatePattern(int number) {
		if (number > 0) {
			System.out.print(" " + number);
			CreatePattern(number - 5);
		}
		System.out.print(" " + number);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;

		do {
			System.out.println("\nEnter a number: ");
			number = sc.nextInt();
			if (number > 0)
				CreatePattern(number);
		} while (number > 0);
		System.out.println("Out of the loop");
	}
}
