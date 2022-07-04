//example-3

import java.util.Scanner;

class NumberPatternLeftIncrement
{
	public static void numberPatternLeftIncrement()
	{
		Scanner scan = new Scanner(System.in);
		int rows,increament;
		System.out.println("\n===== Increament of User Input =====");
		System.out.print("\nNumber of Rows: ");
		rows = scan.nextInt();
		
		System.out.print("\nNumber of Increament: ");
		increament = scan.nextInt();
		
		for(int rowsCheck=1;rowsCheck<=rows;rowsCheck++)
		{
			//(1,1<=3,2)
			int colincrement=1;
			for(int colCheck=1;colCheck<=rowsCheck;colCheck++)
			{
				System.out.print(colincrement+" ");
				colincrement+=increament;
			}

			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		numberPatternLeftIncrement();
	}
}