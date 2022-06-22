/*
Initialize the Packages
*/
import java.util.Scanner;

class Person{

	public static void personDetail()
	{
		//Declare the Variables & Datatype
		int age,monthlySalary,montlyExpense;
		String name,dob,pincode,doorNumber,maritalStatus,street,locality,city,state,country,isAadharAvailable,isTelephoneAvailable,phoneNumber,qualification,isSalaried,hobbies;
		char  gender;

		Scanner scan = new Scanner(System.in);
		
		//User Information
		System.out.println("\n===== Person All Detail =====");
		
		System.out.print("Name\t\t: ");
		name = scan.next();

		System.out.print("Gender\t\t: ");
		gender = scan.next().charAt(0);

		System.out.print("Date-of-Birth\t: ");
		dob = scan.next();

		System.out.print("Age\t\t: ");
		age = scan.nextInt();

		System.out.print("Marital Status\t: ");
		maritalStatus = scan.next();

		System.out.print("Door Number\t: ");
		doorNumber = scan.next();

		System.out.print("Street\t\t: ");
		street = scan.next();

		System.out.print("Locality\t: ");
		locality = scan.next();

		System.out.print("City\t\t: ");
		city = scan.next();

		System.out.print("State\t\t: ");
		state = scan.next();

		System.out.print("Country\t\t: ");
		country = scan.next();

		System.out.print("Pin Code\t: ");
		pincode = scan.next();
		
		System.out.print("Aadhar Available: ");
		isAadharAvailable = scan.next();

		System.out.print("Telephone Available: ");
		isTelephoneAvailable = scan.next();

		System.out.print("Phone Number\t: ");
		phoneNumber = scan.next();

		System.out.print("Qualification\t: ");
		qualification = scan.next();

		System.out.print("Your are Salaried: ");
		isSalaried = scan.next();

		System.out.print("Monthly Salary\t: ");
		monthlySalary = scan.nextInt();

		System.out.print("Montly Expense\t: ");
		montlyExpense = scan.nextInt();

		System.out.print("Hobbies\t\t: ");
		hobbies = scan.next();

		System.out.println("\n =============================");
		System.out.println("Name\t\t: "+name);
		System.out.println("Gender\t\t: "+gender);
		System.out.println("Date-of-Birth   : "+dob);
		System.out.println("Age\t\t: "+age);
		System.out.println("Marital Status\t: "+maritalStatus);
		System.out.println("Door Number\t: "+doorNumber);
		System.out.println("Street\t\t: "+street);
		System.out.println("Locality\t: "+locality);
		System.out.println("City\t\t: "+city);
		System.out.println("State\t\t: "+state);
		System.out.println("Country\t\t: "+country);
		System.out.println("Pin-Code\t: "+pincode);
		System.out.println("Aadhar Available: "+isAadharAvailable);
		System.out.println("Telephone Available: "+isTelephoneAvailable);
		System.out.println("Phone Number\t: "+phoneNumber);
		System.out.println("Qualification\t: "+qualification);
		System.out.println("Salary\t\t: "+isSalaried);
		System.out.println("Montly Salary\t: "+monthlySalary);
		System.out.println("Montly Expense\t: "+montlyExpense);
		System.out.println("Hobbies\t\t: "+hobbies);
		System.out.print("\n =============================");

	} 
	public static void main(String[] args)
	{
		System.out.println(" ===== Person Details ===== ");
		personDetail(); // Method Calling
	} // End the main 
} //End the Person Class