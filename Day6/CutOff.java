//Biology(200/2),physics(200/4),chemistry(200/4)-MBBS
import java.util.Scanner;

class CutOff
{
	public static void cutOff()
	{
		Scanner scan = new Scanner(System.in);
		int biology,physics,chemistry,cutoff;

		System.out.print("\nBiology Mark(200/200)  : ");
		biology = scan.nextInt();

		System.out.print("Physics Mark(200/200)  : ");
		physics = scan.nextInt();

		System.out.print("Chemistry Mark(200/200): ");
		chemistry = scan.nextInt();

		cutoff = (biology/2)+(chemistry/4)+(physics/4);

		System.out.print("\n---------------------------------------");
		System.out.print("\nYour CutOff Mark is: " + cutoff+"/200");
		System.out.print("\n---------------------------------------");

		if(cutoff >=180)
		{
			System.out.println("\nYou are Eligible for MBBS/BE.");
		}
		else
		{
			System.out.println("\nYou are Not Eligible for MBBS/BE.");
		}
	}
	public static void main(String[] args)
	{
		System.out.println("\n======= MBBS/BE CutOff Mark =======");
		cutOff();
	}
}