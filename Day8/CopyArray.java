import java.util.Scanner;
import java.util.Arrays;

class CopyArray
{
	public static void copyArray()
	{
		int array;
		Scanner scan = new Scanner(System.in);
		System.out.print("\nArray of Value is: ");
		array = scan.nextInt();

		int index[]=new int[array];
		System.out.println("\nIndex of value is: ");
		for(int i=0;i<array;i++)
		{
			index[i]=scan.nextInt();
		}
		
		System.out.println("\nNumber of Arrays is: "+array+",and value of index is: "+Arrays.toString(index));		
		
		System.out.print("\nThe Original Arrays Value is: ");
		for(int original=0;original<array;original++)
		{
			System.out.print(index[original]+" ");
		}		
		System.out.println();
		int copyArray[] = index;
		System.out.print("\nThe Copy of Arrays Value is: ");
		for(int copy=0;copy<array;copy++)
		{
			System.out.print(copyArray[copy]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		copyArray();
	}
}