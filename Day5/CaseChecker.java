import java.util.Scanner;

class CaseChecker
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		char check;

		System.out.println("\n===== Case Checker ===== ");
		
		System.out.print("\nEnter your Character: ");
		check = scan.next().charAt(0);

		if (Character.isUpperCase(check))
		{
			System.out.println("Character is Upper Case!.");
		}
		else
		{
			System.out.println("Character is Lower Case!.");
		}
	}
}