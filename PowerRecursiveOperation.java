import java.util.Scanner;

public class PowerRecursiveOperation {

	static int Power(int a, int b) {
		if (b == 0)
			return 1;
		return a * Power(a, b - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int baseNumber, power;

		System.out.println("Enter the base number:");
		baseNumber = sc.nextInt();
		System.out.println("Enter the power:");
		power = sc.nextInt();

		System.out.println(baseNumber + "^" + power + "=" + Power(baseNumber, power));

	}

}