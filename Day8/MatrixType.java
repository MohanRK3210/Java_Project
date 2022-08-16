import java.util.Scanner;
import java.util.Arrays;

class MatrixType
{
	public static void matrixType()
	{
		int index,f=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Number of Matrix Size is: ");
		index= scan.nextInt();

		int[][] array = new int[index][index];
		int[][] array1= new int[index][index];
		for(int i=0;i<index;i++)
		{
			for(int j=0;j<index;j++)
			{
				if(i==j)
				{
					array1[i][j]=1;
				}
				else
				{
					array1[i][j]=0;
				}
			}
		}

		System.out.println("Matrix is");
			for(int i=0;i<index;i++)
			{
				for(int j=0;j<index;j++)
				{
					System.out.print(array1[i][j]+" ");
				}
				System.out.println();
			}
			
		System.out.println("Matrix is Identity Matrix");
		
		System.out.println("\nIndex Value is: ");

		for(int i=0;i<index;i++)
		{
			for(int j=0;j<index;j++)
			{
				if(i==j)
				{
					array[i][j]=scan.nextInt();
				}
				else
				{
					array[i][j]=0;
				}
			}
		}
		System.out.println("Matrix is");
		for(int i=0;i<index;i++)
		{
			for(int j=0;j<index;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		int diag=array[0][0];
		
		for(int i=0;i<index;i++)
		{
			for(int j=0;j<index;j++)
			{
				if(i==j && array[i][j] != 1)
				{
					f=1;
					break;
				}
				else if (i!=j && array[i][j]!= 0) 
				 {
					f=1;
					break;
				}
			}
		}


		if(f==0)
		{
			System.out.println("Matrix is Identity & Scalar Matrix");
		}
		else
		{
			System.out.println("This Matrix is Diagonal Matrix.");
		}
	}
	public static void main(String[] args)
	{
		matrixType();
	}
}