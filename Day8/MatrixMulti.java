import java.util.Scanner;
import java.util.Arrays;

public class MatrixMulti 
{

	public static void matrixMulti()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\nEnter First Matrix Row: ");
		int row1 = scan.nextInt();
		
		System.out.print("\nEnter First Matrix Column: ");
		int col1 = scan.nextInt();
		int[][] firstMatrix = new int[row1][col1];
		
		System.out.println("\nFirst Matrix Index Value is: ");

		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<col1;j++)
			{
				firstMatrix[i][j]=scan.nextInt();
				
			}
		}

		System.out.println("Matrix is: ");
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<col1;j++)
			{
				System.out.print(firstMatrix[i][j]+" ");
			}
			System.out.println();
		}

		System.out.print("\nEnter Second Matrix Row: ");
		int row2 = scan.nextInt();
		
		System.out.print("\nEnter Second Matrix Row: ");
		int col2 = scan.nextInt();
		
		int[][] secondMatrix = new int[row2][col2];
		System.out.println("\nSecond Matrix Index Value is: ");

		for(int i=0;i<row2;i++)
		{
			for(int j=0;j<col2;j++)
			{
				secondMatrix[i][j]=scan.nextInt();
				
			}
		}

		System.out.println("Matrix is: ");
		for(int i=0;i<row2;i++)
		{
			for(int j=0;j<col2;j++)
			{
				System.out.print(secondMatrix[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][] multi = new int[row1][col2];
        for(int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    multi[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
    
     System.out.println("Two Matrices Multiplied is: ");
        for(int[] row : multi) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
	} 
    public static void main(String[] args) 
    {
        matrixMulti();
    }
}
