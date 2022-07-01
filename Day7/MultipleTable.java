import java.util.*;

class MultipleTable
{
	public static void multipleTable()
	{
		Scanner scan = new Scanner(System.in);
		int nuber,multiple;

		System.out.print("\nYour Multiplication Value is: ");
		multiple = scan.nextInt();
		
		System.out.print("\nNumber Of Time Multiply: ");
		nuber = scan.nextInt();
		
		System.out.println("");
		// 1X5=5 --> 10X5=50.
		for(int i=1;i<=nuber;i++)
		{
			System.out.printf("%2d X %2d = %3d \n", i,multiple,multiple*i);
		}
	}

	public static void main(String[] args)
	{
		System.out.println("\n===== Multiple Table =====");
		multipleTable();
	}
}