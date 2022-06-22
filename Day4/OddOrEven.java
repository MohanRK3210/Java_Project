/*
Initialize the Packages
*/
import java.util.Scanner;

class OddOrEven
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("\n ===== Odd Or Even ===== ");
		int number;
		String result;
		System.out.print("\nThe Value: ");
		number = scan.nextInt();

		result = (number % 2) == 0 ? " Even" : " Odd";
		System.out.println("\nThe User given Value is"+ result);
	}
}