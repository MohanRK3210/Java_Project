import java.util.Scanner;

class PrimeOrNot
{
	public static void main(String[] args)
	{
		int num;
		Scanner scan = new Scanner(System.in);
		String prime = "yes";
		//boolean bool = true;
		 
		System.out.print("\nEnter the Value: ");
		num = scan.nextInt();
		
		if(num >=2)//4
		{
			for(int i=2;i<= num;i++)// 
			{
				if(num%i == 0) // 4%2 == 0
				{
					prime = "no";
					//bool = false;
					break;
				}
			}
			if(prime == "yes")//(bool = true)
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