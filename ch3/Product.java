/*
Initialize the Packages
*/
import java.util.Scanner;

public class Product
{
	public static void main(String[] args)
	{
		//create Scanner to input from command window
		Scanner scan = new Scanner(System.in);

		int x,y,z; // input by user given product Value
		int result; // product of Numbers


		System.out.println(" ===== Find The Product ===== ");

		System.out.print("\nEnter the First Product Value: ");
		x = scan.nextInt();

		System.out.print("Enter the Scond Product Value: ");
		y = scan.nextInt();

		System.out.print("Enter the Third Product Value: ");
		z = scan.nextInt();

		result = x*y*z; // Calculate product of number
		System.out.printf("\nProduct is %d%n ", result);
	} // end method main
} // end class Product