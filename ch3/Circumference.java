/*
Initialize the Packages
*/
import java.util.Scanner; 

class Circumference
{
	public static void circumferenceOfCircle()
	{
		// 2*Pi*radius
		final double pi = 3.14;
		double radius,circleofcircumference;

		Scanner scan = new Scanner(System.in);
		System.out.print("\nRadius Value: ");
		radius = scan.nextDouble();

		circleofcircumference = 2*pi*radius;
		System.out.println("\nThe Circle of Circumference is: " + circleofcircumference);

	} // End of CircleOfCircumference

	public static void circumferenceOfSquare()
	{
		// 4*area
		
		int area,squareofcircumference;

		Scanner scan = new Scanner(System.in);
		System.out.print("\nArea value: ");
		area = scan.nextInt();

		squareofcircumference = 4*area;
		System.out.println("\nThe Square Of Circumference is: " + squareofcircumference);
	
	} // End of CircleOfCircumference

public static void circumferenceOfRetangle()
	{
		// 2*(length+Width)
		
		int length,width,retangleofcircumference;

		Scanner scan = new Scanner(System.in);
		System.out.print("\nRetangle length: ");
		length = scan.nextInt();

		System.out.print("\nRetangle Width: ");
		width = scan.nextInt();

		retangleofcircumference = 2*(length+width);
		System.out.println("\nThe Retangle Of Circumference is: " + retangleofcircumference);
	} // End of RetangleOfCircumference

	public static void main(String[] args)
	{
		System.out.println("\n ===== Circumference Of Circle =====");
		circumferenceOfCircle();
		System.out.println("\n ===== Circumference Of Square =====");
		circumferenceOfSquare();
		System.out.println("\n ===== Circumference Of Retangle =====");
		circumferenceOfRetangle();
	} // End of main
} // End of Circumference Class