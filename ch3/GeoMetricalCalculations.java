/*
Initialize the Packages
*/
import java.util.Scanner;

class GeoMetricalCalculations
{
	public static void square()
	{
		// A = a*a
		Scanner scan = new Scanner(System.in);
		int side,square;

		System.out.print("Enter the value of Side: ");
		side = scan.nextInt();

		square = side*side;
		System.out.println("Area of Square : "+ square);
	}

	public static void retangle()
	{
		// A = w*l
		Scanner scan = new Scanner(System.in);
		int  width,length,retangle;

		System.out.print("Enter the value of width: ");
		width = scan.nextInt();

		System.out.print("Enter the value of Length: ");
		length = scan.nextInt();

		retangle = width*length;
		System.out.println("Area of Retangle :" + retangle);
	}

	public static void circle()
	{
		// A = pi *r*r
		Scanner scan = new Scanner(System.in);
		double pi,circle;
		int radius;

		pi = 3.14;
		System.out.print("Enter the value of Radius: ");
		radius = scan.nextInt();

		circle = pi*radius*radius;
		System.out.println("Area of Circle: "+ circle);
	}

	public static void trapezoid()
	{
		// A = (a+b/2)*h
		int base1,base2,height,trapezoid;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the value of Base Value 1: ");
		base1 = scan.nextInt();
		
		System.out.print("Enter the value of Base Value 2: ");
		base2 = scan.nextInt();

		System.out.print("Enter the value of Height: ");
		height = scan.nextInt();

		trapezoid = (base1+base2/2)*height;
		System.out.println("Area of Trapezoid: " + trapezoid);
	}

	public static void parallelogram()
	{
		// A = base * Height

		int base,height,parallelogram;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the value of Base: ");
		base = scan.nextInt();

		System.out.print("Enter the value of Height: ");
		height = scan.nextInt();

		parallelogram = base*height;
		System.out.println("Area of Parallelogram: " + parallelogram);

	}

	public static void rhombus()
	{
		// A = pq/2

		double pdiagonal,qdiagonal,rhombus;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the p-diagonal value: ");
		pdiagonal = scan.nextDouble();

		System.out.print("Enter the q-diagonal value: ");
		qdiagonal = scan.nextDouble();

		rhombus = pdiagonal*qdiagonal/2;
		System.out.println("Area of Rhombus: " + rhombus);
		
	}

	public static void main(String[] args)
	{
		System.out.println("\n ====== Area of square ===== ");
		square(); // Method Calling

		System.out.println("\n ====== Area of Retangle ===== ");
		retangle(); // Method Calling

		System.out.println("\n ====== Area of Circle ===== ");
		circle(); // Method Calling

		System.out.println("\n ====== Area of Trapezoid ===== ");
		trapezoid(); // Method Calling

		System.out.println("\n ====== Area of Parallelogram ===== ");
		parallelogram(); // Method Calling

		System.out.println("\n ====== Area of Rhombus ===== ");
		rhombus(); // Method Calling

	} // End of main
} // End of GeoMetricalCalculations Class