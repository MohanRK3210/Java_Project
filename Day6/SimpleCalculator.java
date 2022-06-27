import java.util.Scanner;

class SimpleCalculator
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int firstNumber,secondNumber,result;
		char choice,addition,subtraction,multiplication,division,moduloDivision;

		System.out.println("\n ====== Simple Calculator =====");
		System.out.print("\nChoice is Your (+,-,*,/,%) : ");
		choice = scan.next().charAt(0);

		System.out.print("\nFirst Number  : ");
		firstNumber = scan.nextInt();

		System.out.print("Second Number : ");
		secondNumber = scan.nextInt();

		addition = '+';
		subtraction = '-'; 
		multiplication = '*'; 
		division = '/';
		moduloDivision = '%'; 

		if (choice == '+')
		{
			result = firstNumber + secondNumber;
			System.out.println("\nAddition of Two Numbers: " + result);
		}
		else if (choice == '-')
		{
			result = firstNumber - secondNumber;
			System.out.println("\nSubtraction of Two Numbers: " + result);
		}
		else if (choice == '*')
		{
			result = firstNumber * secondNumber;
			System.out.println("\nMultiple of Two Numbers: " + result);
		}
		else if (choice == '/')
		{
			result = firstNumber / secondNumber;
			System.out.println("\nDivided of Two Numbers: " + result);
		}
		else if (choice == '%')
		{
			result = firstNumber % secondNumber;
			System.out.println("\nRemainder of Two Numbers: " + result);
		}
		else
		{
			System.out.println("\nyour choice is Invalid");
		}

		System.out.println("\n--------------------------------------------");
		
		System.out.println("\nAddition of Two Number         : " + addition);
		System.out.println("Subtraction of Two Number      : " + subtraction);
		System.out.println("Multiplication of Two Number   : " + multiplication);
		System.out.println("Division of Two Number         : " + division);
		System.out.println("Modulo Division of Two Number  : " + moduloDivision);
	}
}