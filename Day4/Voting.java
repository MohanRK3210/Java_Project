/*
Initialize the Packages
*/
import java.util.Scanner;

class Voting
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int voter_age;
		String validate,name,gender,category;

		System.out.println("\n ===== Checking Eligible For Voting ===== ");

		System.out.print("\nName: ");
		name = scan.next();

		System.out.print("Age: ");
		voter_age = scan.nextInt();

		System.out.print("Gender (M/F): ");
		gender = scan.next();

		category =("Male" == gender )? "Mr":"Miss";

		validate = (voter_age > 18) ? "Eligible" : "Not Eligible";
		System.out.println((category + " " + name)+" is "+ validate +" for Voting");
	}
}