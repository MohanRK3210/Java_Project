/*
Initialize the Packages
*/
import java.util.Scanner;

class Swapping
{
	public static void main(String[] args)
	{
		// Declare the Variable 
		int value1,value2;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\nFirst Value: ");
		value1 = scan.nextInt();

		System.out.print("\nSecond Value: ");
		value2 = scan.nextInt();

		System.out.println("\n====== Before Swapping ====== ");
		System.out.println("\nBefore First Value:  " + value1);
		System.out.println("\nBefore Second Value: " + value2);

		// Operation
		value1 += value2; // value1 = value1 + value2
		value2 = value1 - value2;
		value1 -= value2; // value1 = value1 - value2
		
		System.out.println("\n====== After Swapping ====== ");
		System.out.println("\nAfter First Value:  " + value1);
		System.out.println("\nAfter Second Value: " + value2);
	} // End of main
} // End of Swapping Class