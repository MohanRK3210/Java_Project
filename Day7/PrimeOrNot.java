import java.util.Scanner;

class PrimeOrNot
{
	public static void main(String[] args)
	{
		int num;
		Scanner scan = new Scanner(System.in);
		String prime = "yes";

		System.out.print("\nEnter the Value: ");
		num = scan.nextInt();
		
		if(num >=2)//4
		{
			for(int i=2;i<= num/2;i++)// 2<=4
			{
				if(num%i == 0) // 4%2 == 0
				{
					prime = "no";
					break;
				}
			}
			if(prime == "yes")
			{
				System.out.println(num +" is Prime Number");
			}
			else
			{
				System.out.println(num + " is Not Prime Number");
			}	
		}
		else
		{
			System.out.println("Please Enter Minimum Value is 2");
		}	
	}
}