import java.util.Scanner;
import java.util.Arrays;

class StringModified
{
	public static void stringModified()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter the your Statement: ");
		String str = scan.nextLine();
		String rev="";
		System.out.println("\nThe Given Statement into convert UpperCase: "+str.toUpperCase());

		System.out.println("\nThe Given Statement into convert LowerCase: "+str.toLowerCase());

		for(int i=str.length()-1;i>=0;i--)
		{
			rev = rev+str.charAt(i);
		}
		System.out.println("\nThe Given sentence is reversed: "+rev);
		System.out.println("\nEnter the your sub string position: ");
		int sub = scan.nextInt();
		System.out.println("\n"+str.substring(sub));
	}
	public static void main(String[] args)
	{
		stringModified();
	}
}