import java.util.Scanner;
import java.util.Arrays;

class SecondLargestArray
{
	public static void secondLargestArray();
	{
		int array,secondlongest;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\nNumber of Value in array: ");
		array = scan.nextInt();//5	
		if(array>=2)
		{
			float index[] = new float[array];
		float largest=0,secondlargest=0,check=0;
		
		System.out.println("\nNumber of index Value: ");
		for(int i=0;i<array;i++)
		{
			//(0<5,1),(1<5,2),(2<5,3)(3<5,4),(4<5,5)-(5<5,6)
			index[i]=scan.nextFloat();// 2,3,5,4,6
		}
		largest=index[1];
		secondlargest=index[0];
		for(int i=0;i<array;i++)
		{
			check=index[i];
			if(check>largest)
			{
				secondlargest=largest;
				largest=check;
			}
			else if(check>secondlargest && check<largest)
			{
				secondlargest=check;
			}
		}
		System.out.println(secondlargest);
	}	
	else
	{
		System.out.println("Please Insert Minimum Value is: 2 ");
	  }
	}

	public static void main(String[] args)
	{
	SecondLargestArray();	
	}
		
}
