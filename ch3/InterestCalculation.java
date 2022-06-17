/*
Initialize the Packages
*/
import java.util.Scanner;

class InterestCalculation
{
	public static void simpleInterest()
	{
		// Simple Interest = principal amount*rate of interest*numberofyears

		Scanner scan = new Scanner(System.in);
		double principalamount,rateofinterest,years,simpleinterest;

		System.out.print("\nEnter the Principal Amount: ");
		principalamount = scan.nextDouble();

		System.out.print("Enter the Rate of Interest: ");
		rateofinterest = scan.nextDouble();

		System.out.print("Enter the Number of Years: ");
		years =12*scan.nextDouble();

		simpleinterest = principalamount*rateofinterest*years/100;
		System.out.println("The Value of Simple Interest: " + simpleinterest);
		System.out.println("Total Amount of : " + (simpleinterest+principalamount));
	}

	public static void compoundInterest()
	{
		// Compount Interest = principalamount*(1+rateofinterest/100)*years
		Scanner scan = new Scanner(System.in);
		double principalamount,rateofinterest,years,compoundinterest;

		System.out.print("\nEnter the Principal Amount: ");
		principalamount = scan.nextDouble();

		System.out.print("Enter the Rate of Interest: ");
		rateofinterest = scan.nextDouble();

		System.out.print("Enter the Number of Years: ");
		years =12*scan.nextDouble();
		
		compoundinterest = principalamount*(1+rateofinterest/100)*years;
		System.out.println("The Value of Compound Interest: " + compoundinterest);
	
	}

	public static void main(String[] args)
	{

		System.out.println("\n ====== Simple Interest ======");
		simpleInterest();

		System.out.println("\n ====== Compound Interest ======");
		compoundInterest();
	}
}