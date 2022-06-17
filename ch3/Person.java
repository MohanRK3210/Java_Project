/*
Initialize the Packages
*/
import java.util.Scanner;

class Person{

	public static void personDetail()
	{
		//Declare the Variables & Datatype
		int age,pincode,doorNumber;
		String name,gender,DOB,maritalStatus,street,locality,city,state,country,isAadharAvailable,isTelephoneAvailable,phoneNumber,qualification,isSalaried,monthlySalary,montlyExpense,hobbies;

		Scanner scan = new Scanner(System.in);
		
		//User Information
		System.out.print("Enter the Name\t\t\t: ");
		name = scan.next();

		System.out.print("Enter the Gender\t\t: ");
		gender = scan.next();

		System.out.print("Enter the Date-of-Birth\t\t: ");
		DOB = scan.next();

		System.out.print("Enter the Age\t\t\t: ");
		age = scan.nextInt();

		System.out.print("Enter the Marital Status\t\t: ");
		maritalStatus = scan.next();

		System.out.print("Enter the Door Number\t: ");
		doorNumber = scan.nextInt();

		System.out.print("Enter the Street\t\t: ");
		street = scan.next();

		System.out.print("Enter the Locality\t\t: ");
		locality = scan.next();

		System.out.print("Enter the City\t: ");
		city = scan.next();

		System.out.print("Enter the State\t: ");
		state = scan.next();

		System.out.print("Enter the Country\t\t: ");
		country = scan.next();

		System.out.print("Enter Pin Code\t\t: ");
		pincode = scan.nextInt();
		
		System.out.print("Aadhar Available\t: ");
		isAadharAvailable = scan.next();


		System.out.print("Telephone Available\t\t: ");
		street = scan.next();

		System.out.print("Enter the Phone Number\t\t: ");
		phoneNumber = scan.next();

		System.out.print("Enter the Qualification\t: ");
		qualification = scan.next();

		System.out.print("Enter the your are Salaried\t: ");
		isSalaried = scan.next();

		System.out.print("Enter the Monthly Salary\t\t: ");
		monthlySalary = scan.next();

		System.out.print("Enter the Montly Expense\t: ");
		montlyExpense = scan.next();

		System.out.print("Enter the Hobbies\t\t: ");
		hobbies = scan.next();

		System.out.print("\n =============================");

	} 
	public static void main(String[] args)
	{
		System.out.println(" ===== Person Details ===== ");
		personDetail(); // Method Calling
	} // End the main 
} //End the Person Class