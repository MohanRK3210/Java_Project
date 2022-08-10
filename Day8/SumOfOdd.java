import java.util.Scanner;
import java.util.Arrays;

class SumOfOdd
{
	public static void sumOfOdd_Even()
	{
		int array,oddTotal=0,evenTotal=0;
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

		for(int j=1;j<array;j+=2)
		{
			oddTotal = oddTotal+index[j];
		}
		System.out.println("The Sum of Odd Number: " + oddTotal);

		for(int k=0;k<array;k+=2)
		{
			evenTotal = evenTotal+index[k];
		}
		System.out.println("The Sum of Odd Number: " + evenTotal);

	}

	public static void main(String[] args)
	{
		sumOfOdd_Even();
	}
}