import java.util.Scanner;
import java.util.Arrays;

class MatrixType
{
	public static void matrixType()
	{
		int index,f=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("\nNumber of Matrix Size is: ");
		index= scan.nextInt();//3

		int[][] array = new int[index][index];//3X3
			
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
		System.out.println("\nMatrix is");
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
				if (i==j && array[i][j] == 1) 
				{
					f=2;
					break;
				}
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
			System.out.println("\nMatrix is Scalar Matrix");
		}
		else if(f==2)
		{
			System.out.println("\nMatrix is Identity Matrix");
		}
		else
		{
			System.out.println("\nThis Matrix is Diagonal Matrix.");
		}
	}
	public static void main(String[] args)
	{
		matrixType();
	}
}