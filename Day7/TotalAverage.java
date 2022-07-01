import java.util.Scanner;

class TotalAverage
{
	public static void totalAverage()
	{
		Scanner scan = new Scanner(System.in);
		int firstNuber,lastNumber,check,sum=0,averageCount=0;
		float average;
		
		System.out.println("\n===== Find the Total & Average of Given Range =====");
	
		System.out.print("\nFirst Number of Range: ");
		firstNuber = scan.nextInt();//2

		System.out.print("Last Number of Range: ");
		lastNumber = scan.nextInt();//5
		
		//(2^5=4)
		// averageCount = (lastNumber+1)-firstNuber;// (5+1)-2=(6-2=4)
		// averageCount = firstNuber ^ (1+lastNumber) ;
		// averageCount++;

		check = firstNuber;

		while(check<=lastNumber)
		{
			//(2<=5,3),(3<=5,4),(4<=5),(5<=5)
			sum = sum+check;//(0+2=2)(2+3=5=2)(5+4=9)(9+5=14)
			averageCount++;//1,2,3,4
			check++;//3,4,5
		}
			
		System.out.println("\n===== Result for Total & Average of Given Range =====");
		System.out.println("\nThe sum of Given Range "+ sum);
		average = (float)sum/averageCount;//(14/4)
		System.out.println("\nThe Average of Given Range "+average);
		System.out.println("\nThe Average Count "+averageCount);
	}

	public static void main(String[] args)
	{
		totalAverage();
	}
}