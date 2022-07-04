//example-5

import java.util.Scanner;

class NumberPatternRightIncrement
{
	public static void numberPatternRightIncrement()
	{
		int rows;
		Scanner scan = new Scanner(System.in);

		System.out.println("\n===== Right Increament Triangle Pattern");

		System.out.print("\nNumber of Rows: ");
		rows = scan.nextInt();

		for(int rowCheck=rows;rowCheck>=1;rowCheck--)
		{
			for(int colcheck=1;colcheck<=rowCheck;colcheck++)
			{
				System.out.print("-");	
			}
			for(int colcheck=rowCheck;colcheck<=rows;colcheck++)
			{
				System.out.print(colcheck);
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		numberPatternRightIncrement();
	}
}