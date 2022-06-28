import java.util.Scanner;

class Voting
{
	public static void voting()
	{
		Scanner scan = new Scanner(System.in);
		int voter_age,candidate=0,maleGenderCount=0,femaleGenderCount=0;
		String validate,category,name;
		char gender,rentry;

		
		do{
			System.out.print("Name: ");
			name = scan.next();

			System.out.print("Age: ");
			voter_age = scan.nextInt();

			System.out.print("Gender (M/F): ");
			gender = scan.next().charAt(0);

			candidate = candidate+1;
			maleGenderCount = ('M'== gender || 'm' == gender)? maleGenderCount+1:maleGenderCount;
			femaleGenderCount = ('F'== gender || 'f' == gender)? femaleGenderCount+1:femaleGenderCount;


			category = ('M' == gender || 'm' == gender) ? "Mr":"Mrs";
			validate = (voter_age >=18) ? "Eligible" : "Not Eligible";
			System.out.println((category + " " + name)+" is "+ validate +" for Voting");
			System.out.print("\nContinue the Voting Process[Y/N]:");		
			rentry = scan.next().charAt(0);
			
		}
		while((rentry =='Y') ||(rentry == 'y'));

		if((rentry == 'N')||(rentry == 'n'))
		{
			System.out.println("\n===== Voting Report =====");
			System.out.println("Number of candidated Visited = " + candidate);
			System.out.println("Number of Male Count = " + maleGenderCount);
			System.out.println("Number of Female Count = " + femaleGenderCount);
		}
	}

	public static void main(String[] args)
	{
		System.out.println("\n===== Voter Identification =====");
		voting();
	}
}