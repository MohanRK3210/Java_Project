import java.util.Scanner;

class NumberStarPattern
{
	public static void numberStarPattern()
	{
		Scanner scan = new Scanner(System.in);

		int rows;
		System.out.println("\n===== Increasing Right Triangle Number Pattern =====");

		System.out.print("\nNumber of Rows: ");
		rows = scan.nextInt();
		System.out.println();

		for(int rowCheck=1;rowCheck<=rows;rowCheck++)
		{
			for(int colCheck=1;colCheck<=rowCheck;colCheck++)
			{
				System.out.print(colCheck+" ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args)
	{
		numberStarPattern();
	}
}