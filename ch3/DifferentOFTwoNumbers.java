import java.util.Scanner;

class DifferentOFTwoNumbers
{
	public static void differentOFTwoNumbers()
	{
		Scanner scan = new Scanner(System.in);
		int firstNumber,secondNumber,differents;

		System.out.print("\nFirst Number: ");
		firstNumber = scan.nextInt();

		System.out.print("Second Number: ");
		secondNumber = scan.nextInt();

		differents = firstNumber-secondNumber;
		System.out.println("\nDifferent Between Two Numbers: "+ differents);
	}
	public static void main(String[] args)
	{
		System.out.println("\n===== Different Between Two Numbers =====");
		differentOFTwoNumbers();
	}
}