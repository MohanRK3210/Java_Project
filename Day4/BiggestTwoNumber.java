/*
Initialize the Packages
*/
import java.util.Scanner;

class BiggestTwoNumber
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		// Declare variable
		int num1,num2;
		System.out.println(" ===== Find The Biggest Number ===== ");

		System.out.print("\nEnter the First Number: ");
		num1 = scan.nextInt();

		System.out.print("Enter the Second Number: ");
		num2 = scan.nextInt();

		System.out.println(Math.max(num1,num2) + " is greater ");
	}
}




