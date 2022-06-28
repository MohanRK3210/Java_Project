import java.util.Scanner;

class PrimeNumberGivenRange
{
	public static void primeNumberGivenRange()
	{
		int range,prime,count;
		System.out.print("Enter Range value : ");
		
		Scanner scan =new Scanner(System.in);
		range=scan.nextInt();
		
		System.out.println("Prime numbers between 1 to "+range+" are ");
		
		if(range>=1)//5,
		{
			for(int i=2;i<=range;i++)
			{
				//(2<=5,3),(3<=5,4)(4<=5,6)(6<=5,7)
				count=0;//1,2
				for(prime=1;prime<=i;prime++) //(2<=3,2),(2<=4,3)(3<=5,4)
				{
					if(i%prime==0) 
					{
						//(2%2==0)->true,(4%2==0)->true,(5%4==0)->false,
						count++;// 1,2
					}
				}
				if(count==2)
				{
					System.out.print(i+" ");     
				}
			}
		}
		else
		{
			System.out.println("Please Given Range is Minimum 2.");
		}
	}

	public static void main(String arg[])	
	{
		System.out.println("\n===== Prime Number Given Range =====");
		primeNumberGivenRange();
	}
}