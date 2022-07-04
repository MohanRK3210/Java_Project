//example-7

import java.util.Scanner;

class PramadiNumberLeft
{
	public static void pramadiNumberLeft()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("\n===== Pramadi Number Left");

		int pramadi;
		System.out.print("\nPramadi value: ");
		pramadi = scan.nextInt();

		for(int rowCheck=1;rowCheck<=pramadi;rowCheck++)
		{
			for(int colcheck=1;colcheck<=rowCheck;colcheck++)
			{
				System.out.print(colcheck+" ");
			}
			System.out.println();
		}
		for(int rowCheck=pramadi-=1;rowCheck>=1;rowCheck--)
		{
			for(int colcheck=1;colcheck<=rowCheck;colcheck++)
			{
				System.out.print(colcheck+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		pramadiNumberLeft();
	}
}