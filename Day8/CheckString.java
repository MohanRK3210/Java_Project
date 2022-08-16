import java.util.Scanner;

public class CheckString
{
   public static void checkString()
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter your Sentence: ");
      String str=scan.nextLine();

      System.out.println("Find String: ");
      String found=scan.nextLine();

      boolean check = str.contains(found);
      if(check)
      {
      	System.out.println(found+" is preset in the Sentence.");
      }
      else
      {
      	System.out.println(found+" is not present.");
      }
      
      }

   public static void main(String[] args)
   {
      checkString();
   }
}