/*
Initialize the Packages
*/
import java.util.Scanner;

class BiggestTwoNumber
{
	public static void biggestTwoNumber()
	{
		Scanner scan = new Scanner(System.in);
		// Declare variable
		int num1,num2;

		System.out.print("\nFirst Number: ");
		num1 = scan.nextInt();

		System.out.print("Second Number: ");
		num2 = scan.nextInt();

		System.out.println(Math.max(num1,num2) + " is greater ");
	}

	public static void main(String[] args)
	{
		
		System.out.println(" ===== Find The Biggest Number ===== ");
		biggestTwoNumber();
	}
}