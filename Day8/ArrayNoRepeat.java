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
		int[] array = new int[index];//5
		System.out.println("Enter the array index Value: ");
		for(int i=0;i<1;i++)
		{
			array[i]=scan.nextInt();
			check = array[i];
		}
		for(int i=1;i<index;i++)
		{
			array[i]=scan.nextInt();//1,2,1
			if(array[i]>check)
			{//-1>0,2>1,2>2,1>2
				check=array[i];//1,2
			}
			else if(array[i]==check)
			{//-1==0,2==2,
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
