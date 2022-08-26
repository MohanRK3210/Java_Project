import java.util.Scanner;
import java.util.*;

class HashBank
{
	public static void main(String[] args)
	{
		int accNumber;
		String customerName;

		HashMap hm = new HashMap();
		Scanner scan = new Scanner(System.in);
		System.out.print("\nNumber of Account Create: ");
		int newAccount = scan.nextInt();
		for(int i=0;i<newAccount;i++)
		{
			System.out.println("\n===== Opening New Account =====");
			System.out.print("\nAccount Number: ");
			accNumber = scan.nextInt();
			System.out.print("Customer Name: ");
			customerName = scan.next();
			hm.put(accNumber,customerName);
		}
		System.out.println("\nHashMap One:"+hm);

		System.out.println("\nSearch an Account Details");
		int search = scan.nextInt();
		System.out.println("\n"+hm.get(search));
	}
}  
  