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

		if (check >= 'A' && check <= 'Z' )
		{
			System.out.println("\nCharacter is Upper Case!.");
		}
		else if(check >= 'a' && check <+'z')
		{
			System.out.println("\nCharacter is Lower Case!.");
		}
		else
		{
			System.out.println("\n"+check + " is Not Alphabets");
		}
	}
}