import java.util.Scanner;

class CashOfDenomination
{
	public static void main(String[] args)
	{

	Scanner scan = new Scanner(System.in);
	int amount,rupees2000,rupees500,rupees100,rupees50,rupees10;

	System.out.println("===== Rupees To Denomination ===== ");

	System.out.print("\nEnter the Amount: ");
	amount = scan.nextInt();

	rupees2000 = (amount>2000)?(amount/2000):0;
	amount = amount-(rupees2000*2000); 
	
	rupees500 = (amount>500)?(amount/500):0;
	amount = amount-(rupees500*500); 

	rupees100 = (amount>100)?(amount/100):0;
	amount = amount-(rupees100*100); 
	
	rupees10 = (amount>10)?(amount/10):0;
	amount = amount-(rupees10*10); 

	System.out.println("\n2000 \tx "+ rupees2000 + "\t= " + (rupees2000*2000)); 
	System.out.println("500 \tx "+ rupees500 + "\t= " + (rupees500*500)); 
	System.out.println("100 \tx "+ rupees100 + "\t= " + (rupees100*100)); 
	System.out.println("10\tx "+ rupees10 + "\t= " + (rupees10*10)); 
	System.out.println("Coins \tx " + amount+ "\t= "+(amount));
	}
}