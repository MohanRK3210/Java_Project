import java.util.Scanner;

public class ArmStrong
{
   public static void armStrong()
   {
      int number, check, compare, multiply;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("\nEnter the Number: ");
      number = scan.nextInt();
      
      compare = 0;
      check = number;//370

      while(check>0)//370>0,37>0,3>0,0>0;
      {
         multiply = check%10;//370%10=0,37%10=7,3%10=3;
         compare = compare + (multiply*multiply*multiply);//0+(0)=0,0+(343)=343,343+(27)=370;
         check = check/10;//370/10=37,37/10=3,3/10=0;
      }
      
      if(number==compare)
         System.out.println("\n"+number+ " is Armstrong Number.");
      else
         System.out.println("\n"+number+ " is Not an Armstrong Number.");
   }

   public static void main(String[] args)
   {
      System.out.println("\n===== Find ArmStrong Number Or Not =====");
      armStrong();
   }
}