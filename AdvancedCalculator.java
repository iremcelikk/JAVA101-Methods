import java.util.Scanner;

public class AdvancedCalculator {

	static int getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\tEnter the number:");
		int number = sc.nextInt();
		return number;
	}

	static void addition(int a, int b) {
		System.out.println(a + b);
	}

	static void extraction(int a, int b) {
		System.out.println(a - b);
	}

	static void multiplication(int a, int b) {
		System.out.println(a * b);
	}

	static void division(int a, int b) {
		if (b == 0)
			System.out.println("The second number can not be 0!!!");
		else
			System.out.println(a / b);
	}

	static void power(int a, int b) {
		int result = 1;
		for (int i = 0; i < b; i++)
			result *= a;
		System.out.println(result);
	}

	static int factorial(int a) {
		if (a == 1 || a == 0)
			return 1;
		return a * factorial(a - 1);
	}

	static void modulo(int a, int b) {
		System.out.println(a % b);
	}

	static void rectPerimeterArea(int a, int b) {
		int perimeter = (a + b) * 2;
		int area = a * b;
		System.out.println("Perimeter of rectangle: " + perimeter + "\nArea of rectangle: " + area);
	}

	public static void main(String[] args) {
		boolean isExecute = true;
		while (isExecute) {
			System.out.println(
					"Select the operation:\n1-Addition\t2-Extraction\t3-Multiplication\t4-Division\t5-Power\t6-Factorial\t7-Modulo\t8-Perimeter and Area of Rectangle");

			switch (getInput()) {
			case 1:
				addition(getInput(), getInput());
				break;
			case 2:
				extraction(getInput(), getInput());
				break;
			case 3:
				multiplication(getInput(), getInput());
				break;
			case 4:
				division(getInput(), getInput());
				break;
			case 5:
				power(getInput(), getInput());
				break;
			case 6:
				System.out.println(factorial(getInput()));
				break;
			case 7:
				modulo(getInput(), getInput());
				break;
			case 8:
				rectPerimeterArea(getInput(), getInput());
				break;
			default:
				System.out.println("Invalid number entered!!!");
				isExecute = false;
			}

		}
	}

}
