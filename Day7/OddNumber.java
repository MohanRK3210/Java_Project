import java.util.Scanner; 
 
class OddNumber
{
	public static void oddNumber()
	{
		int firstNumber,secondNumber,check,numberOfOdd =0;
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
    			numberOfOdd++;
    			check++;
    		}
    		else
    		{
    			numberOfOdd =  numberOfOdd;
    			check++;
    		}
    	}
    	System.out.println("Number of Odd Number for Given Range: " +numberOfOdd);
	}
  public static void main(String args[]) 
 {
 	oddNumber();
 }
}
