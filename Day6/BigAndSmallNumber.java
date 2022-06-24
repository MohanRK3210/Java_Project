/*
Initialize the Packages
*/
import java.util.Scanner;

class BigAndSmallNumber
{
	public static vid bigAndSmallNumber()
	{
		int num1,num2,num3,biggestResult,smallestResult;

		Scanner scan = new Scanner(System.in);
		
		System.out.print("\nFirst Value: ");
		num1 = scan.nextInt();

		System.out.print("\nSecond Value: ");
		num2 = scan.nextInt();

		System.out.print("\nThird Value: ");
		num3 = scan.nextInt();

		if(num1>num2) // 2>1
		{
			biggestResult = num1>num3 ? num1:num3;
			smallestResult = num2<num3 ? num2:num3;

			System.out.println("\n===== Result ===== ");
			System.out.println("\nThe Biggest Number is: "+ biggestResult);
			System.out.println("\nThe Smallest Number is: "+ smallestResult);
		}

		else 
		{
			biggestResult = num2<num3 ? num3:num2;
			smallestResult = num2<num3 ? num2:num3;

			System.out.println("\n===== Result ===== ");
			System.out.println("\nThe Biggest Number is: "+ biggestResult);
			System.out.println("\nThe Smallest Number is: "+ smallestResult);
		}
	}
	public static void main(String[] args)
	{
		System.out.println("\n===== Find The Biggest and Smallest Number ===== ");
		bigAndSmallNumber();		
	}
}