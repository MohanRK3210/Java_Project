/*
Initialize the Packages
*/
import java.util.Scanner;

class BiggestTwoNumbers
{
	public static void biggestTwoNumers()
	{
		Scanner scan = new Scanner(System.in);
		// Declare variable
		int num1,num2;
		System.out.print("\nFirst Number : ");
		num1 = scan.nextInt();

		System.out.print("Second Number: ");
		num2 = scan.nextInt();

		if(num1>num2) 
		{
			System.out.println("\nThe Biggest Number Option A: " + num1);
		}
		else
		{
			System.out.println("\nThe Biggest Number Option B: " + num2);
		}
	}
	public static void main(String[] args)
	{
		System.out.println("\n===== Find The Biggest Number ===== ");
		biggestTwoNumers();
	}
}
