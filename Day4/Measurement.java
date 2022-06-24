import java.util.Scanner;

class Measurement{

	public static void cmToMeter()
	{
		// cm/100
		long centimeter,centimeterToMeter,meter;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\nYour Centimeter Value: ");
		centimeter = scan.nextLong();

		centimeterToMeter = centimeter/100;
		meter = centimeter-(centimeterToMeter*100); 
		System.out.println("The Centimeter is "+ centimeter + ",To Convert Meter Value is :" + centimeterToMeter + " Balance Centimeter is: "+ meter);
	}
	
	public static void meterToKilometer()
	{
		// meter/1000
		long meter,meterToKilometer,kiloMeter;
		Scanner scan = new Scanner(System.in);

		System.out.print("\nYour Meter Value: ");
		kiloMeter = scan.nextLong();
		
		meterToKilometer = kiloMeter/1000;
		meter = kiloMeter-(meterToKilometer*1000); 
		System.out.println("The Meter value is " + kiloMeter +" to Convert Kilometer is "+ meterToKilometer +" Balance Meter is: "+ meter);
	}
	
	public static void inchesToFeet()
	{
		// user input/12
		long inches,inchesToFeet,feet;
		Scanner scan = new Scanner(System.in);

		System.out.print("\nYour inches Value: ");
		feet = scan.nextLong();
		
		inchesToFeet = feet/12;
		inches = feet-(inchesToFeet*12);
		System.out.println("The inches Value is " + feet +" to Convert Feet is: "+ inchesToFeet +" Balance inches is: "+ inches);
	}
	
	public static void sqftToCent()
	{
		// userinput/436
		long sqft,sqftToCent,cent;
		Scanner scan = new Scanner(System.in);

		System.out.print("\nSquare feet Value: ");
		cent = scan.nextLong();
		
		sqftToCent = cent/436;
		sqft = cent-(sqftToCent*436);
		System.out.println("The Square Feet Value is " + cent +" to Convert Cent value is: "+ sqftToCent + " Balance SquareFeet is: "+ sqft);
	}
	
	public static void gramToKilogram()
	{
		// userinput/1000
		long gram,gramToKilogram,kiloGram;
		Scanner scan = new Scanner(System.in);

		System.out.print("\nYour gram Value: ");
		kiloGram = scan.nextLong();
		
		gramToKilogram = kiloGram/1000;
		gram = kiloGram-(gramToKilogram*1000);
		System.out.println("The Gram Value is " + kiloGram +" to Convert Gram  is: "+ gramToKilogram + " Balance gram is: "+ gram);
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