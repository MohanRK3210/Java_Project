import java.util.Scanner;

class SimpleInterest
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		float rateOfInterest,principalAmount,numberOfDays,simpleInterest,percentage;
		int amount,percentageOfPrincipal,netpayable;

		System.out.println("\n===== Simple Interest =====");
		System.out.print("\nPrincipal Amount: ");
		principalAmount = scan.nextInt();

		System.out.print("Rate of Interest: ");
		rateOfInterest = scan.nextFloat();
		rateOfInterest = rateOfInterest/12;

		System.out.print("Number of Days: ");
		numberOfDays = scan.nextInt();

		//simple Interest = p*r*t/100
		// 10000 *10/100*15=10500/
		// 10000*0.33333*15=499.995
		// 10/30 = 0.33,10*0.33=4.95

		simpleInterest = (principalAmount*rateOfInterest*numberOfDays)/100;
		amount =(int)simpleInterest;
		System.out.println("\nSimple Interest: "+ amount);

		percentage = rateOfInterest*numberOfDays;
		percentageOfPrincipal = (int)percentage;
		System.out.println("\nPercentage Of Principal Amount: " + percentageOfPrincipal+"%");

		netpayable = (int)principalAmount+amount;
		System.out.println("\nNet payable Amount will be : " + netpayable);
		// 10000 = 100%
		// 500 = 5%
		// 0.33333*15 = 500
		// 10500
	}
}  