import java.util.Scanner; 

class BigAndSmall 
{
  public static void bigAndSmall()
  {
    Scanner scan =new Scanner(System.in); 
    int number,check,biggest,smallest,current;
    
    biggest = Integer.MIN_VALUE;
    smallest = Integer.MAX_VALUE; 
    
    System.out.print("\nCheck Number of Times: ");
    number=scan.nextInt(); //5

    System.out.println("\nThe Value is: "); 


    for(check=1;check<=number;check++) 
    { 
      //(1<5,2)
      current = scan.nextInt(); 

      if (current>biggest)  
      { 
       biggest = current; 
      }  
      else if(current<smallest)  
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