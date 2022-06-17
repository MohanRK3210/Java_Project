/*
Initialize the Packages
*/
import java.util.Scanner;

class BinaryConvertion
{
	public static void realNumber()
	{
		// Declare the Variable & DataType
		int decimal;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\nEnter the Decimal Number: ");
		decimal = scan.nextInt();
		
		String binary = Integer.toBinaryString(decimal);
		System.out.println("The Decimal Number Convert to Binary Number: "+ binary);

		System.out.print("\nEnther the Binary Number: ");
		binary = scan.next();

		decimal = Integer.parseInt(binary,2); 
		System.out.println("The Binary Number Convert to Decimal Number: "+ decimal);

	}

	public static void floating()
	{
		// Declare the Variable & DataType
		float floating;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\nEnter the Float Number: ");
		floating = scan.nextFloat();

		String binary = Integer.toBinaryString(Float.floatToIntBits(floating));
		System.out.println("The Floating Pointer Convert to Binary Number: "+ binary);

		System.out.print("\nEnter the Binary Number:");

	}

	public static void main(String[] args)
	{
		System.out.println("\n ===== Decimal to Binary =====");
		realNumber(); // Method Calling

		System.out.println("\n ===== Floating to Binary =====");
		floating(); // Method Calling
		
	} // End of main
} // End of BinaryConversation Class