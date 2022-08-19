import java.util.Scanner;

public class PalindromeString
{
   public static void palindromeString()
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("\nEnter the String sentences: ");
      String str = scan.nextLine();
      int count = str.length();
      //char[] original = str.toCharArray();
      char[] originalArray = new char[count];
      for(int i=0;i<count;i++)
      {
         originalArray[i]=str.charAt(i);
      }
      System.out.print("\nOriginal String: ");
      for(int i=0;i<count;i++)
      {
         System.out.print(originalArray[i]);
      }
      System.out.println();
      String reverse="";
      for(int i=count-1;i>=0;i--)
      {
         reverse = reverse+str.charAt(i);
      }
      char[] reverseArray = new char[count];
      for(int i=0;i<count;i++)
      {
         reverseArray[i]=reverse.charAt(i);
      }
      System.out.print("\nReverse String: ");
      for(int i=0;i<count;i++)
      {
         System.out.print(reverseArray[i]);
      }
       System.out.println();
       boolean check=true;
       for(int i=0;i<count;i++)
       {
         if(originalArray[i] != reverseArray[i])
         {
            check=false;
            //System.out.println("\nGiven String is Not Palindrome String");
            break;
         }
         else
         {

         }
      }
      if(check == true)
      {
         System.out.println("\nGiven String is Palindrome String");
            
      }
      else
      {
         System.out.println("\nGiven String is Not Palindrome String");
            
      }
        
   }

   public static void main(String[] args)
   {
      palindromeString();
   }
}