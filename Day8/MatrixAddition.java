import java.util.Scanner;

class MatrixAddition
{

	public static void MatrixAddition()
	{
		int index;
		Scanner scan = new Scanner(System.in);
		System.out.print("Number of Matrix Size is: ");
		index= scan.nextInt();

		int[][] array = new int[index][index];
		System.out.println("\nFirst Matrix Index Value is: ");

		for(int i=0;i<index;i++)
		{
			for(int j=0;j<index;j++)
			{
				array[i][j]=scan.nextInt();
				
			}
		}

		System.out.println("Matrix is: ");
		for(int i=0;i<index;i++)
		{
			for(int j=0;j<index;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}

		int[][] array1 = new int[index][index];
		System.out.println("\nSecond Matrix Index Value is: ");

		for(int i=0;i<index;i++)
		{
			for(int j=0;j<index;j++)
			{
				array1[i][j]=scan.nextInt();
				
			}
		}

		System.out.println("Matrix is: ");
		for(int i=0;i<index;i++)
		{
			for(int j=0;j<index;j++)
			{
				System.out.print(array1[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][] array2 = new int[index][index];
		for(int i=0;i<index;i++)
		{
			for(int j=0;j<index;j++)
			{
				array2[i][j]=array[i][j]+array1[i][j];
			}
		}
		System.out.println();

		System.out.println("The Addition of Matrix is: ");
		for(int i=0;i<index;i++)
			{
				for(int j=0;j<index;j++)
				{
					System.out.print(array2[i][j]+" ");
				}
				System.out.println();
			}
	}

	public static void main(String[] args) 
	{
		MatrixAddition();
	}

	
}