import java.util.Scanner;
import java.util.Arrays;

class ArrayNoRepeat
{
	public static void arrayNoRepeat()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("\nGiven Array index Size: ");
		int index = scan.nextInt();

		int check=0;
		int[] array = new int[index];
		System.out.println("Enter the array index Value: ");
		for(int i=0;i<index;i++)
		{
			array[i]=scan.nextInt();
			if(array[i]>check)
			{
				check=array[i];
			}
			else if(array[i]==check)
			{
				System.out.println("Duplicate not allowed. Please enter another number.");
				i--;
			}
			else
			{
				System.out.println("Number must be greater than previous Value.");
				i--;
			}
		}
		System.out.print("\nArray of index ");
		for(int i=0;i<index;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		arrayNoRepeat();
	}
		
}
