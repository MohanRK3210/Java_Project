import java.util.Scanner;

class Voting
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int age;

		System.out.println("\n===== Canditate Check For Voting =====");
		System.out.print("\nEnter your Age: ");
		age = scan.nextInt();
		if (age>=18)
		{
			System.out.println("\nYou are Eligible for Voting.");
		}
		else
		{
			System.out.println("\nYou are Not Eligible for Voting this time.");
		}
	}
}