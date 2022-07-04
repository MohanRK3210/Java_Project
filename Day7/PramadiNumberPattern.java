//example-6

import java.util.Scanner;

class PramadiNumberPattern
{
	public static void pramadiNumberPattern()
	{
		
		Scanner scan = new Scanner(System.in);

		int rows;
		System.out.print("\nNumber of Rows: ");
		rows = scan.nextInt();

		for(int rowCheck=1;rowCheck<=rows;rowCheck++)
		{

			int check=rows;
			check-=rowCheck;
			for(int invisible=1;invisible<=check;invisible++)
			{
				System.out.print(". ");
			}
			for(int colCheck=rowCheck;colCheck>=1;colCheck--)
			{
				System.out.print(colCheck+" ");
			}
			for(int colCheck1=1;colCheck1<=rowCheck;colCheck1++)
			{
				System.out.print(colCheck1+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		pramadiNumberPattern();
	}
}