/*
Initialize the Packages
*/
import java.util.Scanner;

class BiggestTwoNumbers
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		// Declare variable
		int num1,num2,result;
		System.out.println("\n===== Find The Biggest Number ===== ");

		System.out.print("\nEnter the First Number : ");
		num1 = scan.nextInt();

		System.out.print("Enter the Second Number: ");
		num2 = scan.nextInt();

		if(num1>num2) 
		{
			result= (num1>num2)?(num1):(num2); 
			System.out.println("\nThe Biggest Number Option A: " + result);
		}
		else
		{
			System.out.println("\nThe Biggest Number Option B: " + num2);
		}
	}
}
