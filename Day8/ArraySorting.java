import java.util.Scanner;
import java.util.Arrays;

class ArraySorting
{

	public static void sortArray()
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter the Given index: ");
		int index = scan.nextInt();
		
		int[] array = new int[index];
		System.out.println("Enter Elements: ");
		for(int i=0;i<index;i++)
		{
			array[i] = scan.nextInt();
		
		}

		System.out.println("\nNumber of Arrays is: "+index+ ", and value of index is: "+Arrays.toString(array));

		char order;
		int temp;

		System.out.print("\nChoose your Order (a/d):");
		order=scan.next().charAt(0);

		if(Character.toLowerCase(order)=='a')
		{
			for(int i=0;i<index;i++)
			{
				for(int j=i+1;j<index;j++)
				{
					if(array[i]>array[j])
					{
						temp=array[i];
						array[i]=array[j];
						array[j]=temp;
					}
				}
			}
		}

		else if(Character.toLowerCase(order)=='d')
		{
			for(int i=0;i<index;i++)
			{
				for(int j=i+1;j<index;j++)
				{
					if(array[i]<array[j])
					{
						temp=array[i];
						array[i]=array[j];
						array[j]=temp;
					}
				}
			}
		}
		System.out.println();
		System.out.println(Character.toLowerCase(order) == 'a' ? "Ascending Order:" : "Descending Order:");
		
		System.out.print("[");
		for(int k=0;k<index;k++)
		{
			System.out.print(array[k]+", ");
		}
		System.out.print("]");
		System.out.println();
	}

	public static void main(String[] args) 
	{
		sortArray();
	}
	
}