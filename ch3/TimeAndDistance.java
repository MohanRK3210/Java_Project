/*
Initialize the Packages
*/
import java.util.Scanner;

class TimeAndDistance
{
	public static void time()
	{
		//Declare the Variables
		float distance,time,speed;
		Scanner scan = new Scanner(System.in);

		System.out.print("\nThe Distance (km): ");
		distance = scan.nextFloat(); // User Input

		System.out.print("The Speed (km/hr): ");
		speed = scan.nextFloat(); // User Input
		speed = speed/60;//1*60

		// Operation
		time = (distance/speed);
		System.out.println("Find the Time (hr): "+ time+" Minutes");

	} // End of time

	public static void speed()
	{
		Scanner scan = new Scanner(System.in);
		float distance,time,speed;

		System.out.print("\nThe Distance (km): ");
		distance = scan.nextFloat();

		System.out.print("The Time (hr): ");
		time = scan.nextFloat();

		//Operation
		speed = (distance/time);
		System.out.println("The Time (km/hr): "+ speed);
	}

	public static void distance()
	{
		Scanner scan = new Scanner(System.in);
		float distance,time,speed;

		System.out.print("The speed (km/hr): ");
		speed = scan.nextFloat();		

		System.out.print("The Time (hr): ");
		time = scan.nextFloat();

		//Operation
		distance = speed*time;
		System.out.println("The Time (km/hr): "+ distance);
	}

	public static void main(String[] args)
	{
		System.out.println("\n ===== Find the Time of Duration ===== ");
		time();

		System.out.println("\n ===== Find the Speed of Duration ===== ");
		speed();

		System.out.println("\n ===== Find the Distance of Duration ===== ");
		distance();

	} // End of main
} // End of TimeAndDistance