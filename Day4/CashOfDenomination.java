import java.util.Scanner;

class CashOfDenomination
{
	public static void main(String[] args)
	{

	Scanner scan = new Scanner(System.in);
	int amount,rupees2000,rupees500,rupees100,rupees50,rupees10,total;

	System.out.println("===== Rupees To Denomination ===== ");

	System.out.print("\nEnter the Amount: ");
	amount = scan.nextInt();

	rupees2000 = (amount>=2000)?(amount/2000):0;
	amount = amount-(rupees2000*2000); 
	
	rupees500 = (amount>=500)?(amount/500):0;
	amount = amount-(rupees500*500); 

	rupees100 = (amount>=100)?(amount/100):0;
	amount = amount-(rupees100*100); 
	
	rupees50 = (amount>=50)?(amount/50):0;
	amount = amount-(rupees50*50); 
	
	rupees10 = (amount>=10)?(amount/10):0;
	amount = amount-(rupees10*10); 

	total = (rupees2000*2000)+(rupees500*500)+(rupees100*100)+(rupees50*50)+(rupees10*10)+amount;

	System.out.printf("\n2000 X %1d = %4d\n",rupees2000 ,(rupees2000*2000)); 
	System.out.printf(" 500 X %1d = %4d\n",rupees500,(rupees500*500)); 
	System.out.printf(" 100 X %1d = %4d\n",rupees100,(rupees100*100));  
	System.out.printf("  50 X %1d = %4d\n",rupees50,(rupees50*50)); 
	System.out.printf("  10 X %1d = %4d\n",rupees10,(rupees10*10)); 
	System.out.printf("   1 X %1d = %4d\n",amount,amount);
	System.out.printf("\n------------------");
	System.out.printf("\nTotal   =%6d",total);
	}
}