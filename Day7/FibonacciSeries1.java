import java.util.*;

class FibonacciSeries
{
	public static void fibonacciSeries()
	{
		Scanner scan = new Scanner(System.in);
		int firstNumber,secondNumber,thirdNumber;
		int n;

		System.out.print("\nNumber Of Time: ");
		n = scan.nextInt();

		System.out.print("First Number: ");
		firstNumber = scan.nextInt();

		System.out.print("Second Number: ");
		secondNumber= scan.nextInt();
		System.out.println("\n---------------------------");
		
		for(int i=1;i<=n; ++i)
		{
			System.out.print(firstNumber+ ",");
			thirdNumber = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = thirdNumber; 
		}
	}

	public static void main(String[] args)
	{
		System.out.println("\n===== FibonacciSeries =====");
		fibonacciSeries();
		System.out.println("\n---------------------------");
		
	}
}