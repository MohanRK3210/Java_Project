import java.util.Scanner;

class SimpleCalculator
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int firstNumber,secondNumber,result;
		char choice,addition,subtraction,multiplication,division,moduloDivision,rentry;

	
		do{

			System.out.println("\n ====== Simple Calculator =====");
			System.out.print("\nChoice is Your (+,-,*,/,%) : ");
			choice = scan.next().charAt(0);

			addition = '+';
			subtraction = '-'; 
			multiplication = '*'; 
			division = '/';
			moduloDivision = '%'; 

			System.out.print("\nFirst Number  : ");
			firstNumber = scan.nextInt();

			System.out.print("Second Number : ");
			secondNumber = scan.nextInt();

		if (choice == '+')
		{
			result = firstNumber + secondNumber;
			System.out.println("\nAddition of Two Numbers: " + result);
			System.out.print("Continue the Voting Process[Y/N]:");		
			rentry = scan.next().charAt(0);
		}
		else if (choice == '-')
		{
			result = firstNumber - secondNumber;
			System.out.println("\nSubtraction of Two Numbers: " + result);
			System.out.print("Continue the Voting Process[Y/N]:");		
			rentry = scan.next().charAt(0);
		}
		else if (choice == '*')
		{
			result = firstNumber * secondNumber;
			System.out.println("\nMultiple of Two Numbers: " + result);
			System.out.print("Continue the Voting Process[Y/N]:");		
			rentry = scan.next().charAt(0);
		}
		else if (choice == '/')
		{
			result = firstNumber / secondNumber;
			System.out.println("\nDivided of Two Numbers: " + result);
			System.out.print("Continue the Voting Process[Y/N]:");		
			rentry = scan.next().charAt(0);
		}
		else if (choice == '%')
		{
			result = firstNumber % secondNumber;
			System.out.println("\nRemainder of Two Numbers: " + result);
			System.out.print("Continue the Voting Process[Y/N]:");		
			rentry = scan.next().charAt(0);
		}
		else
		{
			System.out.println("\nyour choice is Invalid");
			System.out.print("Continue the Voting Process[Y/N]:");		
			rentry = scan.next().charAt(0);
		}	
	}
	while((rentry =='Y') ||(rentry == 'y'));
	}
}