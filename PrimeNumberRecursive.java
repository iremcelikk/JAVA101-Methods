import java.util.Scanner;

public class PrimeNumberRecursive {

	static boolean isPrime(int number, int i) {

		if (number < 2)
			return false;
		if (number == i)
			return true;
		if (number % i == 0)
			return false;
		return isPrime(number, i + 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;

		System.out.println("Enter a number to find whether it is a prime number:");
		number = sc.nextInt();

		if (isPrime(number, 2))
			System.out.println(number + " is a prime number.:)");
		else
			System.out.println(number + " is not a prime number.");
	}
}
