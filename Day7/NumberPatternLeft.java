import java.util.Scanner;

class NumberPatternLeft
{
	public static void numberPatternLeft()
	{
		int rows;
		Scanner scan = new Scanner(System.in);

		System.out.println("\n===== Left Increament Triangle Pattern");

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
				colcheck=colcheck+2;//(3),
				System.out.print(colcheck+" ");
				colcheck = colcheck-2;(1)
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		numberPatternLeft();
	}
}