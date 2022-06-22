import java.util.Scanner;

class Measurement{

	public static void cmToMeter()
	{
		// cm/100
		float centimeter,centimeterToMeter;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\nYour Centimeter Value: ");
		centimeter = scan.nextFloat();

		centimeterToMeter = centimeter/100;
		System.out.println("The Centimeter value is "+ centimeter + " To Convert Meter Value is " + centimeterToMeter);
	}
	
	public static void meterToKilometer()
	{
		// meter/1000
		float meter,meterToKilometer;
		Scanner scan = new Scanner(System.in);

		System.out.print("\nYour Meter Value: ");
		meter = scan.nextFloat();
		
		meterToKilometer = meter/1000;
		System.out.println("The Meter Value is " + meter +" to Convert Kilometer value is "+ meterToKilometer);
	}
	
	public static void inchesToFeet()
	{
		// user input/12
		float inches,inchesToFeet;
		Scanner scan = new Scanner(System.in);

		System.out.print("\nYour inches Value: ");
		inches = scan.nextFloat();
		
		inchesToFeet = inches/12;
		System.out.println("The inches Value is " + inches +" to Convert Feet value is "+ inchesToFeet);
	}
	
	public static void sqftToCent()
	{
		// userinput/436
		float sqft,sqftToCent;
		Scanner scan = new Scanner(System.in);

		System.out.print("\nSquare feet Value: ");
		sqft = scan.nextFloat();
		
		sqftToCent = sqft/436;
		System.out.println("The Square Feet Value is " + sqft +" to Convert Cent value is "+ sqftToCent);
	}
	
	public static void gramToKilogram()
	{
		// userinput/1000
		float gram,gramToKilogram;
		Scanner scan = new Scanner(System.in);

		System.out.print("\nYour gram Value: ");
		gram = scan.nextFloat();
		
		gramToKilogram = gram/1000;
		System.out.println("The Gram Value is " + gram +" to Convert Kilogram value is "+ gramToKilogram);
	}
	
	public static void rupeesToDollar()
	{
		// userinput/76.75 
		double rupees,rupeesToDollar;
		Scanner scan = new Scanner(System.in);

		System.out.print("\nYour Rupees Amount: ");
		rupees = scan.nextDouble();
		
		rupeesToDollar = rupees/76.75;
		System.out.println("The Rupees amount is " + rupees+" to Convert Dollar value is "+ rupeesToDollar);
	}
	
	public static void fahrenheltToCelsius()
	{
		// (F-32)*5/9
		float fahrenhelt,fahrenheltToCelsius;
		Scanner scan = new Scanner(System.in);

		System.out.print("\nFahrenhelt Value: ");
		fahrenhelt = scan.nextFloat();
		
		fahrenheltToCelsius = (fahrenhelt - 32)*5/9;
		System.out.println("The Fahrenhelt Value is " + fahrenhelt +" to Convert Celsius value is "+ fahrenheltToCelsius);
	}
	
	public static void main(String[] args)
	{
		System.out.println("\n===== Centimeter To Meter ======");
		cmToMeter();

		System.out.println("\n===== Meter to Kilometer ======");
		meterToKilometer();
		
		System.out.println("\n===== Inches To Feet ======");
		inchesToFeet();
		
		System.out.println("\n===== SquareFeet To Cent ======");
		sqftToCent();
		
		System.out.println("\n===== Gram To Kilogram ======");
		gramToKilogram();
		
		System.out.println("\n===== Rupees To Dollar ======");
		rupeesToDollar();
		
		System.out.println("\n===== Fehrenhelt To Celsius ======");
		fahrenheltToCelsius();
	}
}