import java.util.Scanner; 

class BigAndSmall 
{
  public static void bigAndSmall()
  {
    Scanner scan =new Scanner(System.in); 
    int number,biggest,smallest,current;
    
    System.out.print("\nNumber of values:");
    number=scan.nextInt(); 
    
    biggest = Integer.MIN_VALUE;
    smallest = Integer.MAX_VALUE; 
    
    System.out.println("Enter the values:"); 
    for(int i=1;i<=number;i++) 
    { 
      current = scan.nextInt(); 
      if (current > biggest)  
      { 
       biggest = current; 
      }  
      if (current < smallest)  
      {  
       smallest = current; 
 
      } 
  } 
  System.out.println("\nThe Biggest Number is:" + biggest); 
  System.out.println("The Smallest Number is:" +smallest); 
 }

 public static void main(String[] args) 
 {
  bigAndSmall();
 }
} 
 