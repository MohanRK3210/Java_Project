/*
Initialize the Packages
*/
import java.util.Scanner;

public class Product
{
	public static void product()
	{
		Scanner scan = new Scanner(System.in);

		int x,y,z; // input by user given product Value
		int result; // product of Numbers

		System.out.print("\nFirst Product Value: ");
		x = scan.nextInt();

		System.out.print("Scond Product Value: ");
		y = scan.nextInt();

		System.out.print("Third Product Value: ");
		z = scan.nextInt();

		result = x*y*z; // Calculate product of number
		System.out.println("\nProduct is: " + result);
	}

	public static void main(String[] args)
	{
		//create Scanner to input from command window

		System.out.println(" ===== Find The Product ===== ");
		product();		
	} // end method main
} // end class Product