import java.util.Scanner;

class FibonacciSeries
{
	public static void fibonacciSeries()
	{
		int firstNumber = 0,secondNumber = 1,thirdNumber,numberOfTime = 1;
		
		while(numberOfTime<=10)
		{
			System.out.print(firstNumber+ ",");//0,1,2,
			thirdNumber = firstNumber + secondNumber;//0+1=1,1+1=2,
			firstNumber = secondNumber;//1,2,
			secondNumber = thirdNumber;//1,2,
			numberOfTime++;
		}
	}
	public static void main(String[] args)
	{
		System.out.println("\n===== Fibonacci Series =====");
		fibonacciSeries();
		System.out.println();
	}
}