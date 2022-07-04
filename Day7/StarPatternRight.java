//example-4

import java.util.Scanner;

class StarPatternRight
{
	public static void starPatternRight()
	{
		int rows;
		Scanner scan = new Scanner(System.in);

		System.out.println("\n===== Right Star Triangle Pattern");

		System.out.print("\nNumber of Rows: ");
		rows = scan.nextInt();

		for(int rowCheck=1;rowCheck<=rows;rowCheck++)
		{
			for(int invisible=rows;invisible>=rowCheck;invisible--)
			{
				System.out.print("- ");
			}
			for(int colcheck=1;colcheck<=rowCheck;colcheck++)
			{
				System.out.print("* ");	
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		starPatternRight();
	}
}