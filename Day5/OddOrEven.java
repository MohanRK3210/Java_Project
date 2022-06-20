import java.util.Scanner;

class OddOrEven
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int check;

		System.out.print("\nEnter the Number: ");
		check = scan.nextInt();

		if (check%2 == 0)
		{
			System.out.println(check + " is even.");
		}
		else
		{
			System.out.println(check + " is Odd.");
		}
	}
}