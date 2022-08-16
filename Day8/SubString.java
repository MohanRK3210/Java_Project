import java.util.Scanner;

public class SubString
{
   public static void subString()
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("\nEnter your String: ");
      String str=scan.nextLine();

      System.out.println("Starting Position: ");
      int start = scan.nextInt();

      System.out.println("Ending Position: ");
      int end = scan.nextInt();

      System.out.println("The Given String is: "+str);
      System.out.println("\nSubString is: "+str.substring(start,end));
      }

   public static void main(String[] args)
   {
      subString();
   }
}