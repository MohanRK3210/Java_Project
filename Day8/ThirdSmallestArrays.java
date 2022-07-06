import java.util.Scanner;
import java.util.Arrays;

class ThirdSmallestArrays
{
	public static void thirdSmallestArrays()
	{
		int array,temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Number of Array Value is: ");
		array = scan.nextInt();

		int index[] = new int[array];
		System.out.println("Index Value is: ");
		for(int i=0;i<array;i++)
		{
			index[i]= scan.nextInt();
		}
		System.out.println("Number of Arrays is: "+array+" ,and the index Value is: "+ Arrays.toString(index));
		for(int i=0;i<array;i++)
		{
			for(int j=i+1;j<array;j++)
			{
				if(index[i]>index[j])
				{
					temp = index[i];
					index[i]=index[j];
					index[j]=temp;
				}
			}
		}
		System.out.println("Third Smallest Number is: "+index[2]);
	}
	public static void main(String[] args)
	{
		thirdSmallestArrays();
	}
}