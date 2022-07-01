import java.util.Scanner;

class Factorial
{
	public static void factorial()
   {
      int number,split,factorial=1,check,compare;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("\nFactorial Number: ");
      number = scan.nextInt();
      
      check = number;//145
      compare = 0;
      
      while(check>=1)//(145>=1),(14>=1)(1>=1)
      {
      	split = check%10;//(145%10=5),(14%10=4)(1%10=1)
      	for(int i=1;i<=split;i++)
      	{
      		//(1<=5,2),(2<=5,3),(3<=5,4)(4<=5,5)(5<=5,6)
      		//(1<=4,2)(2<=4,3),(3<=4,4),(4<=4,5)
      		//(1<=1,2)
        	factorial = factorial*i;
        	//(1*1=1),(1*2=2)(2*3=6)(6*4=24)(24*5=120)
        	//(1*1=1),(1*2=2)(2*3=6)(6*4=24)
        	//(1*1=1)
        }
        check = check/10;//(145/10=14)(14/10=1)(1/10=0)
        compare = compare+(factorial);//(0+120=120)(120+24=144)(144+1=145)
        factorial = factorial/factorial;//(120/120=1),(24/24=1)(1/1=1)
      }
      if(number==compare)
      {
        System.out.println("\nThe Given Number is "+number+ " and the Factorial  of"+compare+" is an Factorial Number.");
      }
      else
      {
        System.out.println("\nThe Given Number is "+number+ " and the Factorial of "+compare+" is Not an Factorial Number.");
      }
    }

    public static void main(String[] args)
    {
      System.out.println("\n===== Find the Factorial =====");
      factorial();
    }
}