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
		String validate,name,category,gender;

		System.out.println("\n ===== Eligible Checking For Voting ===== ");

		System.out.print("\nEnter the your Name: ");
		name = scan.next();

		System.out.print("\nEnter Your Age: ");
		voter_age = scan.nextInt();

		System.out.print("\nEnter Your Gender (M/F): ");
		gender = scan.next();

		category =  (gender == "M") ? "Mr":"Miss"; // (M == M): M 
		validate = (voter_age > 18) ? "Eligible" : "Not Eligible";
		System.out.println((category + " " + name)+" is "+ validate +" for Voting");
	}
}