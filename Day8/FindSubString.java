import java.util.Scanner;

public class FindSubString
{
   public static void findSubString()
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("\nGiven string: ");
      String str=scan.nextLine();
      int count = str.length();

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
      char find = scan.next().charAt(0);
      System.out.println(find);

      for(int i=0;i<count;i++)
      {
         if(originalArray[i] == find)
         {
            System.out.println(str.indexOf(find));
         }
      }

   }

   public static void main(String[] args)
   {
      findSubString();
   }
}