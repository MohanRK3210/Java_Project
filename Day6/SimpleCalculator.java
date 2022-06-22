import java.util.Scanner;

class SimpleCalculator
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int firstNumber,secondNumber,addition,subtraction,multiplication,division,moduloDivision;

		System.out.println("\n ====== Simple Calculator =====");
		System.out.print("\nFirst Number  : ");
		firstNumber = scan.nextInt();

		System.out.print("Second Number : ");
		secondNumber = scan.nextInt();

		addition = firstNumber + secondNumber;
		subtraction = firstNumber - (secondNumber);
		multiplication = firstNumber * secondNumber;
		division = firstNumber / secondNumber;
		moduloDivision = firstNumber % secondNumber;

		System.out.println("\n--------------------------------------------");
		
		System.out.println("\nAddition of Two Number         : " + addition);
		System.out.println("Subtraction of Two Number      : " + subtraction);
		System.out.println("Multiplication of Two Number   : " + multiplication);
		System.out.println("Division of Two Number         : " + division);
		System.out.println("Modulo Division of Two Number  : " + moduloDivision);
	}
}