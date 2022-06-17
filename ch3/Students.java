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

		System.out.print("\nEnter the Tamil Mark: ");
		tamil = scan.nextInt(); // User Input
		
		System.out.print("Enter the English Mark: ");
		english = scan.nextInt(); // User Input
		
		System.out.print("Enter the Maths Mark: ");
		math = scan.nextInt(); // User Input
		
		System.out.print("Enter the Science Mark: ");
		science = scan.nextInt(); // User Input
		
		System.out.print("Enter the Social Mark: ");
		social = scan.nextInt(); // User Input

		// Operations
		totalmark = tamil+english+math+science+social;
		average = (totalmark/5.0);
		persentage = (totalmark/500.0)*100;

		System.out.println("\nThe Student Total Mark: " + totalmark);
		System.out.println("\nThe Student Average Mark: " + average);
		System.out.println("\nThe Student Persentage Mark: " + persentage);
	}

	public static void main(String[] args)
	{
		System.out.println("\n ===== Student Mark Value ===== ");
		student(); // Method Calling
	} // End of main
} // End of Students Class