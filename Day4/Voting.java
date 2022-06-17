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
		String validate;

		System.out.println("\n ===== Eligible Checking For Voting ===== ");

		System.out.print("\n Enter Your Age: ");
		voter_age = scan.nextInt();

		validate = (voter_age > 18) ? "Eligible" : "Not Eligible";
		System.out.println(("\n You are " + validate) + " for Voting");
	}
}