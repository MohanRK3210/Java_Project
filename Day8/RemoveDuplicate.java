import java.util.Scanner;
import java.util.Arrays;

class RemoveDuplicate
{
	public static void removeDuplicate()
	{
		int array;
		Scanner scan = new Scanner(System.in);
		System.out.print("\nArray of value is: ");
		array = scan.nextInt();

		int index[] = new int[array];
		System.out.println("\nIndex of value is: ");
		for(int i=0;i<array;i++)
		{
			index[i]=scan.nextInt();
		}
		System.out.print("\nArray of value is: "+array+",and the index value is: "+Arrays.toString(index));
		System.out.println();
		for(int i=0;i<array;i++)
		{
			for(int j=i+1;j<array;j++)
			{
				if(index[i]==index[j])
				{
					index[j]=index[array-1];
					array--;
					
				}
			}
		}
		System.out.print("\nBalanced Array: "+index[array]);
		System.out.println();
		System.out.print("\nRemoved Duplicate index value: ");
		for(int i=0;i<array;i++)
		{
			System.out.print(index[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		removeDuplicate();
	}
}