import java.util.Scanner;

class StudentGrade
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int tamil,english,math,science,social,average;

		System.out.println("\n===== Checking  Student Grade =====");
		
		System.out.print("\nTamil Mark: ");
		tamil = scan.nextInt();

		System.out.print("English Mark: ");
		english = scan.nextInt();

		System.out.print("Maths Mark: ");
		math = scan.nextInt();

		System.out.print("Social Mark: ");
		social = scan.nextInt();

		System.out.print("Science Mark: ");
		science = scan.nextInt();

		average = (tamil+english+math+science+social)/5;
		System.out.println("\n ------------------------- ");
	
		if(average>=80)
		{
			System.out.println("The Student Grade will be A.");
		}
		else if (average>=60 && average<80)
		{
			System.out.println("The Student Grade will be B.");
		}
		else if (average>=40 && average<60)
		{
			System.out.println("The Student Grade will be C.");
		}
		else
		{
			System.out.println("The Student Grade will be D.");
		}
	}
}