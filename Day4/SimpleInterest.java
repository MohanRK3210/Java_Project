import java.util.Scanner;

class SimpleInterest
{
	public static void simpleInterest()
	{

		Scanner scan = new Scanner(System.in);
		float rateOfInterest,principalAmount,amount,numberOfDays,month,years,simpleInterest,percentage,percentageOfPrincipal,netpayable;

		System.out.print("\nPrincipal Amount: ");
		principalAmount = scan.nextInt();

		System.out.print("Rate of Interest: ");
		rateOfInterest = scan.nextFloat();
		rateOfInterest = rateOfInterest/365;

		System.out.print("Number of Days: ");
		numberOfDays = scan.nextInt();

		System.out.println("\n---------------------------------------");
		
		simpleInterest = principalAmount*rateOfInterest*numberOfDays/100;
		amount = simpleInterest;
		System.out.println("\nDay Interest: "+ Math.round(amount));
		
		month = (amount/numberOfDays)*30; 
		System.out.println("\nMonthly Interest: "+ Math.round(month));
		
		years = (amount/numberOfDays)*365; 
		System.out.println("\nYears Interest: "+ Math.round(years));

		System.out.println("---------------------------------------");

		percentage = (simpleInterest/principalAmount)*100;
		System.out.println("\nPercentage of Day Interest: "+ percentage+"%");
		
		percentageOfPrincipal = 100-percentage;
		System.out.println("\nPercentage of principal Amount: "+ percentageOfPrincipal+"%");

		System.out.println("\n---------------------------------------");
				
		netpayable = Math.round(principalAmount)+Math.round(amount);
		System.out.println("\nNet payable Amount : " + (int)netpayable);
	}
	public static void main(String[] args)
	{
		System.out.println("\n===== Simple Interest =====");
		simpleInterest();
	}
}  