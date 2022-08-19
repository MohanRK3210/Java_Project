import java.util.Scanner;
import java.util.Arrays;

public class EqualString
{
   public static void equalString()
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("\nFirst String sentences: ");
      String str1 = scan.nextLine();
      int count1 = str1.length();
      //char[] original = str.toCharArray();
      char[] firstArray = new char[count1];
      for(int i=0;i<count1;i++)
      {
         firstArray[i]=str1.charAt(i);
      }
      System.out.print("\nFirst String: ");
      for(int i=0;i<count1;i++)
      {
         System.out.print(firstArray[i]);
      }
      System.out.println();
      
      System.out.print("\nSecond sentences: ");
      String str2 = scan.nextLine();
      int count2 = str2.length();
      //char[] original = str.toCharArray();
      char[] secondArray = new char[count2];
      for(int i=0;i<count2;i++)
      {
         secondArray[i]=str2.charAt(i);
      }
      System.out.print("\nSecond String: ");
      for(int i=0;i<count2;i++)
      {
         System.out.print(secondArray[i]);
      }
      System.out.println();
      boolean check=true;
      if(count1 == count2)
      {
         for(int i=0;i<count1;i++)
         {
           if(firstArray[i] != secondArray[i])
           {
            check=false;
            //System.out.println("\nGiven String is Not Palindrome String");
            break;
            }
         }
      }
      else
      {
         check=false;
      }
      if(check == true)
      {
         System.out.println("\nGiven String is Equal.");
      }
      else
      {
         System.out.println("\nGiven String is Not Equal.");
      }
   }

   public static void main(String[] args)
   {
      equalString();
   }
}