import java.util.Scanner;

public class CountString
{
   public static void countString()
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter your Sentence: ");
      String str=scan.nextLine();
      int count = str.length();
      char[] ch = new char[count];
      int vowels=0,words=0,specialChar=0,digit=0;

      for(int i=0;i<count;i++)
      {
         ch[i] = str.charAt(i);

         if((ch[i]>='a' && ch[i]<='z')||(ch[i]>='A' && ch[i]<='Z'))
         {
            ch[i] = Character.toLowerCase(ch[i]);
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')
            {
               ++vowels;
            }
            else
            {
               ++words;

            }
         }
         else if(ch[i] >= '0' && ch[i]<='9')
         {
            ++digit;
         }
         else
         {
            ++specialChar;
         }
        
         }
         int character = (vowels+words);
         System.out.println("Number of Character: "+ character);
         System.out.println("Number of words: "+ words);
         System.out.println("Number of vowels: "+ vowels);
         System.out.println("Number of digit: "+ digit);
         System.out.println("Number of specialChar: "+ specialChar);
      }

   public static void main(String[] args)
   {
      countString();
   }
}