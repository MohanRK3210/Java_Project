import java.util.Scanner;

public class CheckString
{
   public static void checkString()
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("\nGiven string: ");
      String str=scan.nextLine();
      //System.out.println(str);

      System.out.print("\nFind the String: ");
      String find = scan.next();
      System.out.println(find);

      String[] strArray = str.split(" ");
      // int count = strArray.length();
      boolean check= true;
      for(int i=0;i<strArray.length;i++)
      {
         if(find != strArray[i])
         {
            check=false;
            break;
         }
      }
      if(check==true)
      {
         System.out.println(find+" is Find.");
      }
      else
      {
         System.out.println(find+" is Not Find.");
      }
      }

   public static void main(String[] args)
   {
      checkString();
   }
}