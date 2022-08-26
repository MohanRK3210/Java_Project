import java.util.Scanner;
import java.util.*;

class OpenAccount
{
	private int accountNumber;
	private String customerName;
	private int openingBalance;
	
	public void setAccountNumber(int accNumber)
	{
		this.accountNumber = accNumber;
	}

	public int getAccountNumber()
	{
		return accountNumber;
	}

	public String  getCustomerName()
	{
		return customerName;
	}

	public void setCustomerName(String customer)
	{
		this.customerName = customer;
	}

	public int getOpeningBalance()
	{
		return openingBalance;
	}

	public void setOpeningBalance(int balance)
	{
		this.openingBalance = balance;
	}

}

class Banking
{
	public static void main(String[] args)
	{
		int choice,accountNumber,openingBalance;
		String customerName;

		do
		{
			Scanner scan = new Scanner(System.in);
			System.out.print("\n===== Banking Process =====\n");
			System.out.print("\n 1. Account Opening");
			System.out.print("\n 2. Loan Apply");
			System.out.print("\n 3. Closing the Application");
			System.out.println();
			System.out.print("\nSelect your choice: ");
			choice = scan.nextInt();

		
			switch(choice)
			{
				case 1:
						HashMap hm = new HashMap();
						
						for(int i=0;i<1;i++)
						{
							System.out.println("\n===== Opening New Account =====");
							System.out.print("\nAccount Number: ");
							accountNumber = scan.nextInt();
							System.out.print("Customer Name: ");
							customerName = scan.next();
							System.out.print("Opening Balance: ");
							openingBalance = scan.nextInt();
							OpenAccount op = new OpenAccount();
							op.setAccountNumber(accountNumber);
							op.setCustomerName(customerName);
							op.setOpeningBalance(openingBalance);
							// System.out.println("\nAccount Number: "+ op.getAccountNumber());
							hm.put(op.getAccountNumber(),op.getCustomerName(),op.getOpeningBalance());
							System.out.println("\nSearch an Account Details");
							int search = scan.nextInt();
							System.out.println("\n"+hm.get(search));
						}
						break;
				case 2:
						break;
				case 3:
					System.out.println("\nThe Banking Application will be closed...");
					break;
			}
			
		}while(choice<3);
	}
}  
  




















