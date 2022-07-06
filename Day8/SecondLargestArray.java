import java.util.Scanner;
import java.util.Arrays;

class SecondLargestArray
{
	public static void secondLargestArray()
	{
		int array,temp;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\nNumber of Value in array: ");
		array = scan.nextInt();//5

		int index[] = new int[array];
		
		System.out.println("\nNumber of index Value: ");
		for(int i=0;i<array;i++)
		{
			//(0<5,1),(1<5,2),(2<5,3)(3<5,4),(4<5,5)-(5<5,6)
			index[i]=scan.nextInt();//1,3,2,5,2
		}
		System.out.println("\nNumber of Array is: "+array+" ,and the Value is: "+ Arrays.toString(index));
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
		System.out.println("\nSecond Largest Number is: "+index[array-2]);
	}
	
	public static void main(String[] args)
	{
		secondLargestArray();
	}
}