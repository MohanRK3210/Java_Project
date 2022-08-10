import java.util.Scanner;
import java.util.Arrays;

class Transpose
{
	public static void transpose()
	{
		int row,column;
		Scanner scan = new Scanner(System.in);
		System.out.println("Number of row Value is: ");
		row = scan.nextInt();

		System.out.println("Number of Column Value is: ");
		column = scan.nextInt();

		int[][] array = new int[row][column];
		System.out.println("\nIndex Value is: ");

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				array[i][j]=scan.nextInt();
			}
		}
		int [][] temp = new int[row][column];
		for(int m=0;m<row;m++)
		{
			for(int n=0;n<column;n++)
			{
				temp[n][m] = array[m][n];
			}
		}
		for(int k=0;k<row;k++)
		{
			System.out.println();
			for(int l=0;l<column;l++)
			{
				System.out.print(temp[k][l]+" ");
			}
			System.out.println();
		}
		

	}
	public static void main(String[] args)
	{
		transpose();
	}
}