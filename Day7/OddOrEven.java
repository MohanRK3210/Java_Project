import java.util.Scanner; 
 
class OddOrEven
{
	public static void oddOrEven()
	{
    int firstNumber,secondNumber,check,sumOfOdd=0,countOfOdd=0,sumOfEven=0,countOfEven=0;
    float averageOfOdd,averageOfEven;
    Scanner scan=new Scanner(System.in);
    System.out.print("\nThe starting range:"); 
    firstNumber=scan.nextInt();//2

    System.out.print("The ending range:"); 
    secondNumber=scan.nextInt();//5

    check = firstNumber;//2

    while(check<=secondNumber)
    {
      //(2<=5),(3<=5),(4<=5),(5<=5)
      if(check%2 != 0)
      {
        // (3%2=1 != 0 ->true),(5%2=1 != 0)
        sumOfOdd = sumOfOdd+check;// (0+3=3),(3+5=8)
        countOfOdd++;//(0->1),(1->2)
        check++;//4,6
      }
      else
      {
        //(2%2= 0 != 0 ->true)(4%2 != 0-> true)
        sumOfEven = sumOfEven+check;// (0+2=2),(2+4=6)
        countOfEven++;//(0->1),(1->2)
        check++;//3,5
      }
    }
    
    averageOfOdd = sumOfOdd/countOfOdd; 
    averageOfEven = sumOfEven/countOfEven; 
    System.out.println("\nTotal of Odd Number: "+sumOfOdd); 
    System.out.println("Total of Even Number: "+sumOfEven); 
    System.out.println("\nAverage of Odd Number: "+countOfOdd); 
    System.out.println("Average of Even Number: "+countOfEven); 
  }
  public static void main(String args[]) 
 {
 	oddOrEven();
 }
}
