import java.util.Scanner;

class TotalAverage
{
	public static void totalAverage()
	{
		Scanner scan = new Scanner(System.in);
		int i,firstNuber,lastNumber,sum=0,averageCount=0;
		float average;
		
		System.out.println("\n===== Find the Total & Average of Given Range =====");
	
		System.out.print("\nFirst Number of Range: ");
		firstNuber = scan.nextInt();//2

		System.out.print("Last Number of Range: ");
		lastNumber = scan.nextInt();//5
		
		for(i=firstNuber;i<=lastNumber;i++)
		{
			//(2<=5,3),(3<=5,4),(4<=5),(5<=5)
			sum+=i;//(0+2)(2+3=5)(5+4=9)(9+5=14)
			averageCount++;//1,2,3,4
		}

		sum = sum;
		System.out.println("\n===== Result for Total & Average of Given Range =====");
	
		System.out.println("\nThe sum of Given Range "+ sum);
		average = (float)sum/averageCount;
		System.out.println("The Average of Given Range "+average);
	}

	public static void main(String[] args)
	{
		totalAverage();
	}
}