/*
Initialize the Packages
*/
import java.util.Scanner;

class BigAndSmallNumber
{
	public static void bigAndSmallNumber()
	{
		int num1,num2,num3,biggestResult,smallestResult;

		Scanner scan = new Scanner(System.in);
		System.out.print("\nFirst Value: ");
		num1 = scan.nextInt();

		System.out.print("Second Value: ");
		num2 = scan.nextInt();

		System.out.print("Third Value: ");
		num3 = scan.nextInt();

		num1 = num1>num2 ? num1:num2;
		biggestResult = num1>num3 ? num1:num3;
		
		num2 = num1<num2 ? num1:num2;
		smallestResult = num2<num3 ? num2:num3;

		System.out.println("\n ===== Result ===== ");
		System.out.println("\n The Biggest Number is: "+ biggestResult);
		System.out.println(" The Smallest Number is: "+ smallestResult);
	}
	public static void main(String[] args)
	{
	System.out.println("\n===== Find The Biggest and Smallest Number ===== ");
	bigAndSmallNumber();
	}
}