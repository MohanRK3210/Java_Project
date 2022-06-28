import java.util.Scanner;

class ArmStrongRange
{
	public static void armStrongRange()
	{
	int multiply, check, starting,ending;

	Scanner scan = new Scanner(System.in);
	System.out.print("\nStarting Range Value (100-999): ");
	starting = scan.nextInt();

	System.out.print("\nEnding Range Value (100-999): ");
	ending = scan.nextInt();
	
	System.out.println("Armstrong numbers from "+starting+" to "+ending+" are: ");
	
	for(int i = starting; starting <= ending; starting++)
	{
		int compare = starting;//154
		check = 0;
		while(compare > 0)
		{
			//(154>0)->true,(15>0)->true,(1>0)->true
			multiply = compare%10;//154%10=4,15%10=5,1%10=1
			check = check + (multiply * multiply * multiply);//(0+(4*4*4)=64),64+(5*5*5)=189,189+(1*1*1*)=190,
			compare=compare/10;//154/10=15,15/10=1,1/10=0.
		}
		if(check==starting)
			{
				System.out.println(starting+" ");
			}
		}		
	}

	public static void main(String args[])
	{
		System.out.println("\n===== Arm Strong Range =====");
		armStrongRange();
	}
}