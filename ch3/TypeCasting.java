/*
Initialize the Packages
*/
import java.util.Scanner;

class TypeCasting
{
	public static void byteToInt()
	{
		byte bit;
		int integer;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("\nByte Number: ");
		
		bit = scan.nextByte();
		integer = (int)bit;
		System.out.println("The Byte value " + bit + " is convert to Interger: "+ integer);

		System.out.print("\nInteger Number: ");
		integer = scan.nextByte();
		bit = (byte)integer;
		System.out.println("The Byte value " + integer + " is convert to Byte: "+ bit);
	
	}
	
	public static void intToFloat()
	{
		int integer;
		float floater;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("\nInterger Value: ");
		integer = scan.nextInt();
		
		floater = integer;	
		System.out.println("The Interger value " + integer + " is convert to Float: "+ floater);

		System.out.print("\nFloating Value: ");
		floater = scan.nextFloat();
		
		integer = (int)floater;	
		System.out.println("The Floating value " + floater + " is convert to Integer: "+ integer);
	}

	public static void intToLong()
	{
		int integer;
		long longer;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("\nInteger Value: ");
		integer = scan.nextInt();
		
		longer = Long.valueOf(integer);	
		System.out.println("The Interger value " + integer + " is convert to Long: "+ longer);

		System.out.print("\nLong Value: ");
		longer = scan.nextInt();
		
		integer = (int)longer;	
		System.out.println("The Long value " + longer + " is convert to Integer: "+ integer);
	}

	public static void floatToDouble()
	{
		float floater;
		double doubler;

		Scanner scan = new Scanner(System.in);
		System.out.print("\nFloat Value: ");
		floater = scan.nextFloat();
		
		doubler = (double) floater;
		System.out.println("The Float value " + floater + " is convert to Double: "+ doubler);

		System.out.print("\nDouble Value: ");
		doubler = scan.nextDouble();
		
		floater = (float)doubler;	
		System.out.println("The Double value " + doubler + " is convert to Float: "+ floater);
	}

	public static void intToDouble()
	{
		int integer;
		double doubler;

		Scanner scan = new Scanner(System.in);
		System.out.print("\nInteger Value: ");
		integer = scan.nextInt();

		doubler = (double) integer;
		System.out.println("The Integer value " + integer + " is convert to Double: "+ doubler);

		System.out.print("\nDouble Value: ");
		doubler = scan.nextDouble();
		
		integer = (int)doubler;	
		System.out.println("The Double value " + doubler + " is convert to Integer: "+ integer);
	}

	public static void charToInt()
	{
		int integer;
		char character;

		Scanner scan = new Scanner(System.in);
		System.out.print("\nCharacter Letter: ");
		character = scan.next().charAt(0);
		
		integer = Character.getNumericValue(character);
		System.out.println("The Character Letter " + character + " is convert to Integer: "+ integer);

		System.out.print("\nInteger Value: ");
		integer = scan.nextInt();
		
		character = (char)integer;	
		System.out.println("The Integer value " + integer + " is convert to character: "+ character);
	}

	public static void intToBoolean()
	{
		int integer;
		boolean bool;

		Scanner scan = new Scanner(System.in);
		System.out.print("\nBoolen (True/False): ");
		bool = scan.nextBoolean();
		
		integer = (bool)?1:0;
		System.out.println("The Boolean (True/False) " + bool + " is convert to Integer: "+ integer);

		System.out.print("\nInteger Value( 0 / 1 ): ");
		integer = 1;

		bool = (integer == scan.nextInt());
		System.out.println("The Integer value " + integer + " is convert to Boolean: "+ bool);
	}

	public static void charToString()
	{
		char character;
		String string;

		Scanner scan = new Scanner(System.in);
		System.out.print("\nCharacter: ");
		character = scan.next().charAt(0);
		
		string = String.valueOf(character);
		System.out.println("The Character " + character + " is convert to String: "+ string);

		System.out.print("\nString: ");
		string = scan.next();

		character  = string.charAt(0);
		System.out.println("The String of " + string + " is convert to Character: "+ character);
	}

	public static void main(String[] args)
	{
		System.out.println("\n ===== Byte To Int ===== ");
		byteToInt();

		System.out.println("\n ===== Int to Float ===== ");
		intToFloat();

		System.out.println("\n ===== Int to Long ===== ");
		intToLong();

		System.out.println("\n ===== Float to Double ===== ");
		floatToDouble();

		System.out.println("\n ===== Integer to Double ===== ");
		intToDouble();
	
		System.out.println("\n ===== Character to Integer ===== ");
		charToInt();

		System.out.println("\n ===== Integer to Boolean ===== ");
		intToBoolean();

		System.out.println("\n ===== Character to String ===== ");
		charToString();
	} // End of main
} // End of TypeCasting Class