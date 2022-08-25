import java.util.Scanner;

class Employee
{
	private String name;
	private String category;
	private double money;

	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name = name;
		//return name;
	}

	public String getcategory()
	{
		return category;
	}
	public void setcategory(String category)
	{
		this.category = category;
		//return category;
	}

	public double getmoney()
	{
		return money;
	}
	public void setmoney(double money)
	{
		this.money = money;
		//return money;
	}

	public void account(String name,String category,double money)
	{
		System.out.println("\n ===== New Customer Details =====");
		System.out.println("\nEmployee Name : "+name);
		System.out.println("category : "+ category);
		System.out.println("Salary : "+money);
		
	}
}

class customers
{  
    private String accno;  
    private String name;  
    private String acc_type;  
    private long balance;  
    Scanner scan = new Scanner(System.in);  
    //method to open new account  
    public void openAccount() 
    {
        System.out.println("\n===== New Customer Details Form =====");
        System.out.print("\nAccount Number: ");  
        accno = scan.next();
        System.out.print("Customer Name: ");  
        name = scan.next();  
        System.out.print("Opening Balance: ");  
        balance = scan.nextLong();
        System.out.print("Account type(Current/Saving) : ");  
        acc_type = scan.next(); 
        System.out.println("");  
    }  

    public void showAccount() {  
        System.out.print("\nName of account holder: " + name);  
        System.out.print("Account no.: " + accno);  
        System.out.print("Account type: " + acc_type);  
        System.out.print("Balance: " + balance);  
    }  
    
    public void deposit() {  
        long amt;  
        System.out.print("\nEnter the amount you want to deposit: ");  
        amt = scan.nextLong();  
        balance = balance + amt;  
    }  
    //method to withdraw money  
    public void withdrawal() {  
        long amt;  
        System.out.print("\nEnter the amount you want to withdraw: ");  
        amt = scan.nextLong();  
        if (balance >= amt) {  
            balance = balance - amt;  
            System.out.println("Balance after withdrawal: " + balance);  
        } else {  
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
        }  
    }  
    public boolean search(String ac_no)
    {
        if(accno.equals(ac_no))
        {
            showAccount();
            return true;
        }
        return false;
        
    }
}  
public class Banking 
{  
    public static void main(String arg[]) 
    {  
        
        Scanner scan = new Scanner(System.in);  
        int choose;
        do
        {
        	System.out.println("\n===== category ===== \n  \n 1. Customer \n 2. Employee");
        System.out.print("\nChoose your Option: ");
        choose = scan.nextInt();
        switch(choose)
        {
        	case 1:
        		 System.out.print("\nNumber of customers do you want: ");  
        int number = scan.nextInt();  
        customers array[] = new customers [number];  
        for (int i = 0; i < array.length; i++) 
        {  
            array[i] = new customers();  
            array[i].openAccount();  
        }  
        int ch;  
        do {  
            System.out.println("\n===== Banking System Application=====");  
            System.out.println("\n1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");  
            System.out.print("\nEnter your choice: ");  
            ch = scan.nextInt();  
                switch (ch) {  
                    case 1:  
                        for (int i = 0; i < array.length; i++) 
                        {  
                            array[i].showAccount();  
                        }  
                        break;  
                    case 2:  
                        System.out.print("\nEnter account no. you want to search: ");  
                        String ac_no = scan.next();  
                        boolean found = false;  
                        for (int i = 0; i < array.length; i++) 
                        {  
                            found = array[i].search(ac_no);  
                            if (found) 
                            {  
                                break;  
                            }  
                        }  
                        if (!found)
                         {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 3:  
                        System.out.print("\nEnter Account no. : ");  
                        ac_no = scan.next();  
                        found = false;  
                        for (int i = 0; i < array.length; i++) 
                        {  
                            found = array[i].search(ac_no);  
                            if (found) 
                            {  
                                array[i].deposit();  
                                break;  
                            }  
                        }  
                        if (!found)
                         {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 4:  
                        System.out.print("\nEnter Account No : ");  
                        ac_no = scan.next();  
                        found = false;  
                        for (int i = 0; i < array.length; i++) 
                        {  
                            found = array[i].search(ac_no);  
                            if (found) 
                            {  
                                array[i].withdrawal();  
                                break;  
                            }  
                        }  
                        if (!found)
                         {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 5:  
                        System.out.println("\nSee you soon...");  
                        break;  
                }  
            }  
            	while (ch < 5);
        		break;
        	case 2:
        		 System.out.print("\nEmployee Name: ");
 	             String name = scan.next();
 	             System.out.print("category Work: ");
 	             String category = scan.next();
 	             System.out.print("Salary: ");
 	             double money = scan.nextDouble();

 	             Employee cus = new Employee();
 	             cus.setname(name);
 	             cus.setcategory(category);
 	             cus.setmoney(money);
 	             cus.account(name,category,money);
        		break;
        		case 3:  
                        System.out.println("\nSee you soon...");  
                        break;
        }
        }while(choose<3);

    }
          
    }  






