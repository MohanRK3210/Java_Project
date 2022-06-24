/*
Initialize the Packages
*/
import java.util.Scanner;

class Voting
{
	public static void voting()
	{
		Scanner scan = new Scanner(System.in);
		int voter_age;
		String validate,category,name;
		char gender;

		System.out.print("\nName: ");
		name = scan.next();

		System.out.print("Age: ");
		voter_age = scan.nextInt();

		System.out.print("Gender (M/F): ");
		gender = scan.next().charAt(0);

		category = ('M' == gender || 'm' == gender) ? "Mr":"Miss";

		validate = (voter_age >=18) ? "Eligible" : "Not Eligible";
		System.out.println("\n"+(category + " " + name)+" is "+ validate +" for Voting");
	}
	public static void main(String[] args)
	{
		System.out.println("\n ===== Checking Eligible For Voting ===== ");
		voting();
	}
}