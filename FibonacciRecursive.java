import java.util.Scanner;

public class FibonacciRecursive {

	static int Fibonacci(int number) {
		if (number == 1 || number == 2)
			return 1;
		return Fibonacci(number - 1) + Fibonacci(number - 2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfElements;

		System.out.println("Enter the number of elements of Fibonacci series");
		numberOfElements = sc.nextInt();

		System.out.println("Fibonacci " + numberOfElements + ". element " + Fibonacci(numberOfElements));
	}

}
