import java.util.Scanner;
import java.util.Arrays;

class Duplicate
{
	public static void duplicate()
	{
		int array;

		Scanner scan = new Scanner(System.in);
		System.out.print("\nNumber of  Array Value is: ");
		array = scan.nextInt();

		int index[] = new int[array];
		System.out.println("\nIndex Value is: ");
		for(int i=0;i<index.length-1;i++)
		{
			index[i]= scan.nextInt();
		}

		int len = index.length;
		int temp[] = new int[];
		int j=0;


	
	}
	public static void main(String[] args)
	{
		duplicate();
	}
}