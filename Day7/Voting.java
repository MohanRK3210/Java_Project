import java.util.Scanner;

class Voting
{
	public static void voting()
	{
		Scanner scan = new Scanner(System.in);
		int voter_age;
		String validate,category,name;
		char gender,rentry;

		
		do{

			System.out.print("\nName: ");
			name = scan.next();

			System.out.print("Age: ");
			voter_age = scan.nextInt();

			System.out.print("Gender (M/F): ");
			gender = scan.next().charAt(0);

			category = ('M' == gender || 'm' == gender) ? "Mr":"Mrs";
	
			validate = (voter_age >=18) ? "Eligible" : "Not Eligible";
			System.out.println((category + " " + name)+" is "+ validate +" for Voting");
			System.out.print("Continue the Voting Process[Y/N]:");		
			rentry = scan.next().charAt(0);
		}
		while((rentry =='Y') ||(rentry == 'y'));	
	}

	public static void main(String[] args)
	{
		System.out.println("\n===== Voter Identification =====");
		voting();
	}
}