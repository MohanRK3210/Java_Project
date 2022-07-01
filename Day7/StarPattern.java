import java.util.Scanner;

class StarPattern
{
	public static void starPattern()
	{
		System.out.println("\n===== Increasing Right Triangle Star Pattern =====");

		int rows;
		Scanner scan = new Scanner(System.in);
		System.out.print("\nNumber of Rows: ");
		rows = scan.nextInt();
		System.out.println();

		for(int rowCheck=1;rowCheck<=rows;rowCheck++)
		{
			for(int colCheck=1;colCheck<=rowCheck;colCheck++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args)
	{
		starPattern();
	}
}