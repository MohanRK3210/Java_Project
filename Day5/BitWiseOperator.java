import java.util.Scanner;

class BitWiseOperator
{
	public static void bitWiseOR()
	{
		Scanner scan = new Scanner(System.in);
		int firstValue,secondValue,result;

		System.out.print("\nFirst Value: ");
		firstValue = scan.nextInt();

		System.out.print("Second Value: ");
		secondValue = scan.nextInt();

		result = firstValue | secondValue;
		System.out.println("\nBitWise OR Value is: "+ result);
	}

	public static void bitWiseAnd()
	{
		Scanner scan = new Scanner(System.in);
		int firstValue,secondValue,result;

		System.out.print("\nFirst Value: ");
		firstValue = scan.nextInt();

		System.out.print("Second Value: ");
		secondValue = scan.nextInt();

		result = firstValue & secondValue;
		System.out.println("\nBitWise OR Value is: "+ result);
	}

	public static void bitWiseXor()
	{
		Scanner scan = new Scanner(System.in);
		int firstValue,secondValue,result;

		System.out.print("\nFirst Value: ");
		firstValue = scan.nextInt();

		System.out.print("Second Value: ");
		secondValue = scan.nextInt();

		result = firstValue ^ secondValue;
		System.out.println("\nBitWise XOR Value is: "+ result);
	}

	public static void bitWiseComplement()
	{
		Scanner scan = new Scanner(System.in);
		int firstValue,result;

		System.out.print("\nFirst Value: ");
		firstValue = scan.nextInt();

		result = ~firstValue;
		System.out.println("\nBitWise Complement Value is: "+ result);
	}

	public static void bitWiseLeftShift()
	{
		Scanner scan = new Scanner(System.in);
		int firstValue,result;

		System.out.print("\nFirst Value: ");
		firstValue = scan.nextInt();

		result = firstValue << 2;
		System.out.println("\nBitWise Left Shift Operation is: "+ result);
	}

	public static void bitWiseSignedRightShift()
	{
		Scanner scan = new Scanner(System.in);
		int firstValue,result;

		System.out.print("\nFirst Value: ");
		firstValue = scan.nextInt();

		result = firstValue >> 2;
		System.out.println("\nBitWise Signed Right Shift Operation is: "+ result);
	}

	public static void bitWiseUnSignedRightShift()
	{
		Scanner scan = new Scanner(System.in);
		int firstValue,result;

		System.out.print("\nFirst Value: ");
		firstValue = scan.nextInt();

		result = firstValue >>> 2;
		System.out.println("\nBitWise UnSigned Right Shift Operation is: "+ result);
	}

	public static void main(String[] args)
	{
		System.out.println("\n===== BitWise OR =====");
		bitWiseOR();

		System.out.println("\n===== BitWise AND =====");
		bitWiseAnd();

		System.out.println("\n===== BitWise XOR =====");
		bitWiseXor();

		System.out.println("\n===== BitWise Complement =====");
		bitWiseComplement();

		System.out.println("\n===== BitWise Left Shift =====");
		bitWiseLeftShift();

		System.out.println("\n===== BitWise Signed Right Shift =====");
		bitWiseSignedRightShift();

		System.out.println("\n===== BitWise UnSigned Right Shift =====");
		bitWiseUnSignedRightShift();
	}
}