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

		System.out.print("\nPrincipal Amount: ");
		principalamount = scan.nextDouble();

		System.out.print("Rate of Interest: ");
		rateofinterest = scan.nextDouble();

		System.out.print("Number of Years: ");
		years =scan.nextDouble();

		simpleinterest = principalamount*rateofinterest*years/100;
		System.out.println("The Value of Simple Interest: " + simpleinterest);
		System.out.println("Total Amount of : " + (simpleinterest+principalamount));
	}

	public static void compoundInterest()
	{
		// Compount Interest = principalamount*(1+rateofinterest/100)*years
		Scanner scan = new Scanner(System.in);
		double principalamount,rateofinterest,years,compoundinterest;

		System.out.print("\nPrincipal Amount: ");
		principalamount = scan.nextDouble();

		System.out.print("Rate of Interest: ");
		rateofinterest = scan.nextDouble();
		rateofinterest =rateofinterest/100;

		System.out.print("Number of Years: ");
		years =scan.nextDouble();
		
		compoundinterest = principalamount*Math.pow(1+rateofinterest, years);
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