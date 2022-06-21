import java.util.Scanner;

class EbBill
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int unit;
		double amount=0;

		System.out.println("\n===== Eb Bill Reading =====");
		System.out.print("\nEnter Your Unit: ");
		unit = scan.nextInt();

		if(unit <= 100)
		{
			System.out.println("Your Unit will be Free.");
		}
		else if(unit <= 300)
		{
			amount = ((100*0)+((unit-100)*2.50));
			System.out.println("Your EB Bill Amount : " + amount);
		}
		else if(unit <= 500)
		{
			amount = ((100*0)+(100*2.50)+((unit-300)*3.00));
			System.out.println("Your EB Bill Amount : " + amount);
		}

		else if(unit <= 1000)
		{
			amount = ((100*0)+(100*2.50)+(100*3.00)+((unit-500)*5.00));
			System.out.println("Your EB Bill Amount : " + amount);
		}

		else 
		{
			amount = ((100*0)+(100*2.50)+(100*3.00)+(100*5.00)+((unit-1000)*7.00));
			System.out.println("Your EB Bill Amount : " + amount);
		}
	}
}