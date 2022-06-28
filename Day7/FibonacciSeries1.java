import java.util.*;

class FibonacciSeries
{
	public static void fibonacciSeries()
	{
		Scanner scan = new Scanner(System.in);
		int firstNumber,secondNumber,thirdNumber;
		int numberOfTime;

		System.out.print("\nNumber Of Time: ");
		numberOfTime = scan.nextInt();

		System.out.print("First Number: ");
		firstNumber = scan.nextInt();

		System.out.print("Second Number: ");
		secondNumber= scan.nextInt();
		System.out.println("\n---------------------------");
		if(numberOfTime>=2)
		{
			for(int i=1;i<=numberOfTime; ++i)
		{
			System.out.print(firstNumber+ ",");
			thirdNumber = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = thirdNumber; 
		}
	}
		else
		{
			System.out.println("\nYour value is lower then 2.");
		}
		
	}

	public static void main(String[] args)
	{
		System.out.println("\n===== FibonacciSeries =====");
		fibonacciSeries();
		System.out.println("\n---------------------------");
		
	}
}