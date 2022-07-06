import java.util.Scanner;
import java.util.Arrays;

class SumOfArray
{
	public static void sumOfArray()
	{
		int array,odd=0,even=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("\nArray of Value is: ");
		array = scan.nextInt();

		int index[] = new int[array];
		System.out.println("\nNumber of index value: ");
		for(int i=0;i<array;i++)
		{
			index[i]=scan.nextInt();
		}
		System.out.print("Number of Array value is: "+array+",and the index value is: "+Arrays.toString(index));
		System.out.println();
		for(int i=0;i<array;i++)
		{
			
			if(i%2 == 0)
			{
				System.out.print(index[i]+" ");
				even+=index[i];
			}
			else
			{
				odd+=index[i];
			}
		}
		System.out.println();
		System.out.println("\nSum of Even Number is: "+even);
		System.out.println("Sum of Odd Number is: "+odd);
	}

	public static void main(String[] args)
	{
		sumOfArray();
	}
}