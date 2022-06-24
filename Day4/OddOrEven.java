/*
Initialize the Packages
*/
import java.util.Scanner;

class OddOrEven
{
	public static void oddOrEven()
	{
		Scanner scan = new Scanner(System.in);

		int number;
		String result;
		System.out.print("\nThe Value: ");
		number = scan.nextInt();

		result = (number % 2) == 0 ? " Even" : " Odd";
		System.out.println("\nThe User given Value is"+ result);

	}
	public static void main(String[] args)
	{
		System.out.println("\n ===== Odd Or Even ===== ");
		oddOrEven();
	}
}