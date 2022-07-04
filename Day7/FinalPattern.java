//example-6
import java.util.Scanner;

class FinalPattern
{
	public static void finalPattern()
	{
		Scanner scan = new Scanner(System.in);
		
		int rows,increment;
		System.out.println("\n===== Diamond Pattern =====");
		
		System.out.print("\nRows of Value:");
		rows = scan.nextInt();

		System.out.print("\nIncrement of Value:");
		increment = scan.nextInt();
		
		for(int rowCheck=1;rowCheck<=rows;rowCheck++)
		{
			int check=rows;
			check-=rowCheck;
			for(int invisible=1;invisible<=check;invisible++)
			{
				System.out.print(". ");
			}
			int colincrement=1;
			for(int colCheck=rowCheck;colCheck>=1;colCheck--)
			{
				System.out.print(colincrement+" ");
				colincrement+=increment;
			}
			colincrement=1;
			for(int colCheck1=1;colCheck1<=rowCheck;colCheck1++)
			{
				System.out.print(colincrement+" ");
				colincrement+=increment;
			}
				System.out.println();
			}
			for(int rowCheck=rows;rowCheck>=1;rowCheck--)
			{
				int check=rows;
				check-=rowCheck;
				for(int invisible=1;invisible<=check;invisible++)
				{
					System.out.print(". ");
				}
				int colincrement=1;
				for(int colCheck=rowCheck;colCheck>=1;colCheck--)
				{
					System.out.print(colincrement+" ");
					colincrement+=increment;
				}
				colincrement=1;
				for(int colCheck1=1;colCheck1<=rowCheck;colCheck1++)
				{
					System.out.print(colincrement+" ");
					colincrement+=increment;
				}
				System.out.println();
			}
		}	

	public static void main(String[] args)
	{
		finalPattern();
	}
}