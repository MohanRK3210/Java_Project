/*
Initialize the Packages
*/
import java.util.Scanner;

class BigAndSmallNumber
{
	public static void main(String[] args)
	{
		int num1,num2,num3,biggestNumber,smallestNumber,biggestResult,smallestResult;

		Scanner scan = new Scanner(System.in);
		System.out.println("\n===== Find The Biggest and Smallest Number ===== ");

		System.out.print("\nEnter the First Value: ");
		num1 = scan.nextInt();

		System.out.print("\nEnter the Second Value: ");
		num2 = scan.nextInt();

		System.out.print("\nEnter the Third Value: ");
		num3 = scan.nextInt();

		biggestNumber = num1>num2 ? num1:num2;
		biggestResult = biggestNumber>num3 ? biggestNumber:num3;
		
		smallestNumber = num1<num2 ? num1:num2;
		smallestResult = smallestNumber<num3 ? smallestNumber:num3;


		System.out.println("\n ===== Result ===== ");
		System.out.println("\n The Biggest Number is: "+ biggestResult);
		System.out.println("\n The Smallest Number is: "+ smallestResult);
	}
}