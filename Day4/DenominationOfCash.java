import java.util.Scanner;

class DenominationOfCash
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int rupees2000,rupees500,rupees200,rupees100,rupees50,rupees10,coins,total,r2000,r500,r200,r100,r50,r10,balance;
	
		System.out.println("\n===== Denomination To Rupees ===== ");

		System.out.print("\nCount of 2000 Rupess\t: ");
		rupees2000 = scan.nextInt();

		System.out.print("Count of 500 Rupess\t: ");
		rupees500 = scan.nextInt();

		System.out.print("Count of 200 Rupess\t: ");
		rupees200 = scan.nextInt();

		System.out.print("Count of 100 Rupess\t: ");
		rupees100 = scan.nextInt();

		System.out.print("Count of 50 Rupess\t: ");
		rupees50 = scan.nextInt();

		System.out.print("Count of 10 Rupess\t: ");
		rupees10 = scan.nextInt();

		System.out.println("\n===== Rupees To Denomination ===== ");

		r2000 = rupees2000*2000; 
		r500 = rupees500*500; 
		r200 = rupees200*200; 
		r100 = rupees100*100; 
		r50 = rupees50*50; 
		r10 = rupees10*10; 
		
		total = r2000+r500+r100+r50+r10;
		System.out.println("\n2000 X "+rupees2000+ " = " +r2000);
		System.out.println(" 500 X "+rupees500+" = "+r500);
		System.out.println(" 200 X "+ rupees200+ " = "+r200);
		System.out.println(" 100 X "+rupees100+" = "+r100);
		System.out.println("  50 X "+rupees50+" = "+r50);		
		System.out.println("  10 X "+rupees10+" = "+r10);
		System.out.println("-------------------------------------------");
	 	System.out.println("\nTotal Amount: " + total +" Rupees");
	}
}