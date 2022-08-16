import java.util.Scanner;
import java.util.Arrays;

class MatricesEqual
{
	public static void matricesEqual()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter the Given Rows: ");
		int row = scan.nextInt();
		System.out.print("\nEnter the Given Columns: ");
		int column = scan.nextInt();

		int[][] array = new int[row][column];
		System.out.println("Enter Elements: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				array[i][j] = scan.nextInt();
			}
		}

		System.out.print("\nEnter the Given another Rows: ");
		int row1 = scan.nextInt();
		System.out.print("\nEnter the Given another Columns: ");
		int column1 = scan.nextInt();

		int[][] array1 = new int[row1][column1];
		System.out.println("Enter Elements: ");
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<column1;j++)
			{
				array1[i][j] = scan.nextInt();
			}
		}

		System.out.println("Matrix 1: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}	


		System.out.println("Matrix 2: ");
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<column1;j++)
			{
				System.out.print(array1[i][j]+" ");
			}
			System.out.println();
		}

		boolean flag = true;
		if(row != row1 || column != column1)
		{
			flag = false;
		}
		else
		{
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					if(array[i][j] != array1[i][j])
					{
						flag= false;
						break;
					}
				}
			}
		}
		if(flag == true)
		{
			System.out.println("Matrices are Equal");
		}
		else
		{
			System.out.println("Matrices is Not Equal");
		}
	}
	public static void main(String[] args)
	{
		matricesEqual();
	}
}