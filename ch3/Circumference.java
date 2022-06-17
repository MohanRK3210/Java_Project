/*
Initialize the Packages
*/
import java.util.Scanner; 

class Circumference
{
	public static void CircleOfCircumference()
	{
		// 2*Pi*radius
		final double pi = 3.14;
		double radius,circleofcircumference;

		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter the Radius: ");
		radius = scan.nextDouble();

		circleofcircumference = 2*pi*radius;
		System.out.println("\nThe Circle of Circumference is: " + circleofcircumference);

	} // End of CircleOfCircumference

	public static void SquareOfCircumference()
	{
		// 4*area
		
		int area,squareofcircumference;

		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter the Area: ");
		area = scan.nextInt();

		squareofcircumference = 4*area;
		System.out.println("\nThe Square Of Circumference is: " + squareofcircumference);
	
	} // End of CircleOfCircumference

public static void RetangleOfCircumference()
	{
		// 2*(length+Width)
		
		int length,width,retangleofcircumference;

		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter the length: ");
		length = scan.nextInt();

		System.out.print("\nEnter the Width: ");
		width = scan.nextInt();

		retangleofcircumference = 2*(length+width);
		System.out.println("\nThe Retangle Of Circumference is: " + retangleofcircumference);
	} // End of RetangleOfCircumference

	public static void main(String[] args)
	{
		System.out.println("\n ===== Circle Of Circumference =====");
		CircleOfCircumference();
		System.out.println("\n ===== Square Of Circumference =====");
		SquareOfCircumference();
		System.out.println("\n ===== Retangle Of Circumference =====");
		RetangleOfCircumference();
	} // End of main
} // End of Circumference Class