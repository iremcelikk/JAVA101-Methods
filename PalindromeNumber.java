import java.util.Scanner;

public class PalindromeNumber {

	static boolean isPalindrome(int number) {
		int reverseNumber = 0, temp = number, lastDigit;

		while (temp != 0) {
			lastDigit = temp % 10;
			reverseNumber = (reverseNumber * 10) + lastDigit;
			temp /= 10;
		}
		if (reverseNumber == number)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;

		System.out.println("Enter a number to find whether the number is palindrome:");
		number = sc.nextInt();

		if (isPalindrome(number))
			System.out.println(number + " is a palindrome number.");
		else
			System.out.println(number + " is not a palindrome number.");
	}
}
