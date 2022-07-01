import java.util.Scanner;

class NumberPattern
{
	public static void numberPattern()
	{
		Scanner scan = new Scanner(System.in);
		int rows;
		System.out.println("\n===== Increament of 2 pattern =====");
		System.out.print("\nNumber of Rows: ");
		rows = scan.nextInt();
		
		for(int rowCheck=1;rowCheck<=rows;rowCheck++)
		{
			//(1,1<=3,2)
			for(int colCheck=1;colCheck<=rowCheck;colCheck++)
			{
				System.out.print(colCheck+" ");
				colCheck++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		numberPattern();
	}
}