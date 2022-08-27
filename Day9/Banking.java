import java.util.Scanner;
import java.util.*;

class Customer
{
    private String customerName;
    private int accountNumber;
    private int openingBalance;
    public int deposit,withdraw;
    
    public void setAccountNumber(int accountNo)
    {
        accountNumber = accountNo;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public String  getCustomerName()
    {
        return customerName;
    }

    public int getOpeningBalance()
    {
        return openingBalance;
    }

    public void setOpeningBalance(int openBalance)
    {
        openingBalance = openBalance;
    }

    public void deposit(int deposit)
    {
        openingBalance += deposit;
    }

    public void withdraw(int withdraw)
    {
        openingBalance -= withdraw;
    }

}

class Bank
{
    public static void main(String[] args)
    {
        int option,accountNumber,openingBalance,deposit,withdraw;
        String customerName;
        Scanner scan = new Scanner(System.in);
        ArrayList<Customer> array = new ArrayList<Customer>();
        ArrayList values = new ArrayList();

        do
        {
            
            System.out.print("\n******** Banking ********\n");
            System.out.print("\n 1.Account Opening");
            System.out.print("\n 2.Deposit Amount");
            System.out.print("\n 3.Withdrawal Amount");
            System.out.print("\n 4.View all accounts");
            System.out.println();
            System.out.print("\nSelect your option: ");
            option = scan.nextInt();
        
            switch(option)
            {
                case 1:
                            System.out.println("\n===== Opening New Account =====");
                            System.out.print("\nAccount Number: ");
                            accountNumber = scan.nextInt();

                            System.out.print("Customer Name: ");
                            customerName = scan.next();

                            System.out.print("Opening Balance: ");
                            openingBalance = scan.nextInt();
                            Customer op = new Customer();

                            op.setAccountNumber(accountNumber);
                            op.setCustomerName(customerName);
                            op.setOpeningBalance(openingBalance);
                            System.out.print("\nDeposit Amount: ");
                            deposit = scan.nextInt();
                            op.deposit(deposit);                          

                            System.out.print("\nWithdrawal Amount: ");
                            withdraw = scan.nextInt();
                            op.withdraw(withdraw);

                            HashMap hm = new HashMap();
                            values.add(op.getAccountNumber());
                            values.add(op.getCustomerName());
                            values.add(op.getOpeningBalance());
                            hm.put(op.getAccountNumber(),values);
                            System.out.println("\n"+hm.get(op.getAccountNumber()));

                            array.add(op);
                            System.out.println("\nThe number of records: "+ array.size());
                         break;
                case 2:
                    // HashMap depositId = new HashMap();
                    // System.out.print("\nAccount Number: ");
                    // accountNumber = scan.nextInt();
                    // System.out.print("\nDeposit Amount: ");
                    // deposit = scan.nextInt();
                    //op.setDeposit(deposit);
                    break;


                case 3:
                    HashMap withdrawId = new HashMap();
                    System.out.print("\nAccount Number: ");
                    accountNumber = scan.nextInt();
                    
                    System.out.print("Withdrawal Amount: ");
                    withdraw = scan.nextInt();
                   // op.setWithdraw(withdraw);                    
                    
                    break;

                case 4:
                    System.out.println("View all accounts");
                    for(int i=0;i<array.size();i++)
                    {
                        Customer account = /*(Customer)*/ array.get(i);
                        System.out.println(account.getAccountNumber() + "\t" + account.getCustomerName() + "\t" + account.getOpeningBalance());
                    }
                    break;


            }
            
        }while(option<5);
    }
}











