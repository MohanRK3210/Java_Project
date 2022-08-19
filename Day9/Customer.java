import java.util.Scanner;

class Person
{

	String firstName;
	String lastName;
	int age;

	public void saveDetails()
	{
		System.out.println("\nMy Name is "+ firstName+lastName+" and,my age is "+age+" years Old.");
	}

}

class Programming
{
	String name;
	String languagesName;

	public Programming()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("\nWhich language are you learn: ");
		name = scan.nextLine();
	}
	public Programming(String language)
	{
		languagesName = language;
		System.out.print(" , and also Learn "+ languagesName);
		System.out.println();
	}
}

class Customer
{
	boolean b;

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("\nFirst Name: ");
		String firstName = scan.nextLine();
		System.out.print("Last Name: ");
		String lastName = scan.nextLine();
		System.out.print("Your age: ");
		int age = scan.nextInt();

		Person info = new Person();

		info.firstName = firstName;
		info.lastName = lastName;
		info.age = age;

		info.saveDetails();
		
		Customer bool = new Customer();

		Programming lang = new Programming();
		System.out.print("\nI Learning to "+ lang.name+" Language");
		
		Programming languages = new Programming("Html/Css/JS");
		System.out.println("\ndefault constructor: "+ bool.b);
	}
}