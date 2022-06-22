/*
Initialize the Packages
*/
import java.util.Scanner;

class Students
{
	public static void student()
	{
		// Declare the Variables
		int tamil,english,math,science,social,totalmark;
		double average,persentage;
		Scanner scan = new Scanner(System.in);

		System.out.print("\nTamil : ");
		tamil = scan.nextInt(); // User Input
		
		System.out.print("English : ");
		english = scan.nextInt(); // User Input
		
		System.out.print("Maths : ");
		math = scan.nextInt(); // User Input
		
		System.out.print("Science : ");
		science = scan.nextInt(); // User Input
		
		System.out.print("Social : ");
		social = scan.nextInt(); // User Input

		// Operations
		totalmark = tamil+english+math+science+social;
		average = (totalmark/5.0);
		persentage = (totalmark/500.0)*100;

		System.out.println("\nStudent Total Mark: " + totalmark);
		System.out.println("\nStudent Average Mark: " + average);
		System.out.println("\nStudent Over All Persentage : " + persentage);
	}

	public static void main(String[] args)
	{
		System.out.println("\n===== Students Mark Detail =====");
		student(); // Method Calling
	} // End of main
} // End of Students Class