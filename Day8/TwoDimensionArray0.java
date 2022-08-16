import java.util.Scanner;
import java.util.Arrays;

class TwoDimensionArray0
{
	public static void twoDimensionArray()
	{
		int row;
		Scanner scan = new Scanner(System.in);
		System.out.println("Number of row Value is: ");
		row = scan.nextInt();

		int[][] array = new int[row][row];
		System.out.println("\nIndex Value is: ");

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<row;j++)
			{
				array[i][j]=scan.nextInt();
			}
		}
		for(int k=0;k<row;k++)
		{
			System.out.println();
			for(int l=0;l<row;l++)
			{
				System.out.print(array[k][l]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		twoDimensionArray();
	}
}