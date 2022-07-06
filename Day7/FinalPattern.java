//example-6
import java.util.Scanner;

class FinalPattern
{
	public static void finalPattern()
	{
		Scanner scan = new Scanner(System.in);
		
		int rows,increment;
		System.out.println("\n===== Diamond Pattern =====");
		
		System.out.print("\nRows of Value:");
		rows = scan.nextInt();//4

		System.out.print("\nIncrement of Value:");
		increment = scan.nextInt();//2
		
		for(int rowCheck=1;rowCheck<=rows;rowCheck++)
		{
			//(1,1<=4,2),(2,2<=4,3)
			int check=rows;//(4),(4)
			check-=rowCheck;//(4-1=3),(4-2=2)
			for(int invisible=1;invisible<=check;invisible++)
			{
				//(1,1<=3,2),(2,2<=3,3)(3,3<=3,4)(4<=3,5)
				//(1,1<=2,2)(2,2<=2,3)
				System.out.print(". ");// .,.,.;.,.;
			}
			for(int colCheck=rowCheck;colCheck>=1;colCheck--)
			{
				/*
				colcheck=1
				increment=2
				(1,1>=1,0)
				colincrement=(colcheck*increment)-1;
				colincrement=(1*2=2)-1=1;(2*2=4)-1=3,(1*2=2)-1=1;
				colincrement=(3*2=6)-1=5,(2*2=4)-1=3,(1*2=2)-1=1;
				coluncrement=(4*2=8)-1=7,(3*2=6)-1=5,(2*2=4)-1=3,(1*2=2)-1=1;
				*/
				int colincrement=(colCheck*increment)-1;
				System.out.print(colincrement+" ");
			}
			int colincrement1=1;
			for(int colCheck1=1;colCheck1<=rowCheck;colCheck1++)
			{
				System.out.print(colincrement1+" ");
				colincrement1+=increment;
			}
				System.out.println();
			}
			for(int rowCheck=rows;rowCheck>=1;rowCheck--)
			{
				int check=rows;
				check-=rowCheck;
				for(int invisible=1;invisible<=check;invisible++)
				{
					System.out.print(". ");
				}
				for(int colCheck=rowCheck;colCheck>=1;colCheck--)
				{
					int colincrement=(colCheck*increment)-1;
					System.out.print(colincrement+" ");
				}
				int colincrement2=1;
				for(int colCheck1=1;colCheck1<=rowCheck;colCheck1++)
				{
					System.out.print(colincrement2+" ");
					colincrement2+=increment;
				}
				System.out.println();
			}
		}	

	public static void main(String[] args)
	{
		finalPattern();
	}
}