import java.util.Scanner;
import java.util.Arrays;

class ReverseOrder
{
	public static void reverseOrder()
	{
		int array;
		Scanner scan = new Scanner(System.in);
		System.out.print("\nNumber of Arrays: ");
		array = scan.nextInt();

		int index[] = new int[array];
		System.out.println("\nIndex of Value is: ");
		for(int i=0;i<array;i++)
		{
			index[i] = scan.nextInt();
		}
		System.out.print("\nOriginal Arrays of: ");
		for(int original=0;original<array;original++)
		{
			System.out.print(index[original]+" ");
		}
		
		int reverseArray[] = index;
		System.out.print("\nReverse Order of Arrays: ");
		for(int reverse=array-1;reverse>=0;reverse--)
		{
			System.out.print(reverseArray[reverse]+" ");
		}
	}

	public static void main(String[] args)
	{
		reverseOrder();
	}
}