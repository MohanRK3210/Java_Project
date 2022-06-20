import java.util.Scanner;

class DenominationOfCash
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int rupees2000,rupees500,rupees100,rupees50,rupees10,coins,total,r2000,r500,r100,r50,r10,balance;
	
		System.out.println("\n===== Denomination To Rupees ===== ");

		System.out.print("\nCount of 2000 Rupess\t: ");
		rupees2000 = scan.nextInt();

		System.out.print("Count of 500 Rupess\t: ");
		rupees500 = scan.nextInt();

		System.out.print("Count of 100 Rupess\t: ");
		rupees100 = scan.nextInt();

		System.out.print("Count of 50 Rupess\t: ");
		rupees50 = scan.nextInt();

		System.out.print("Count of 10 Rupess\t: ");
		rupees10 = scan.nextInt();

		System.out.print("Count of Coins (0-9)\t: ");
		coins = scan.nextInt();

		System.out.println("\n===== Rupees To Denomination ===== ");

		r2000 =(rupees2000*2000); 
		System.out.println("\n2000 \tx "+ rupees2000 + "\t= " + r2000);

		r500 =(rupees500*500); 
		System.out.println("500 \tx "+ rupees500 + "\t= " + r500);


		r100 =(rupees100*100); 
		System.out.println("100 \tx "+ rupees100 + "\t= " + r100);

		r50 =(rupees50*50); 
		System.out.println("50 \tx "+ rupees50 + "\t= " + r50);

		r10 =(rupees10*10); 
		System.out.println("10 \tx "+ rupees10 + "\t= " + r10);

		balance =(coins <=9)? (coins):0; 
		System.out.println("coins \tx "+ coins + "\t= " + balance);

		total = r2000+r500+r100+r50+r10+balance;
		System.out.println("\nTotal Amount of Cash: " + total +" Rupees");
	}
}