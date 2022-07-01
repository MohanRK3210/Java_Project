import java.util.Scanner;

public class Palindrome {

    public static void palindrome()
    {
        System.out.print("\nEnter a number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int originalNumber = number;//1001
        int reminder = 0;
        int reversedNumber = 0;
        
        while (number != 0) {
           //(1001 != 0)->true,(100 != 0)->true,(10 != 0)->true,(1 != 0)->true,
            reminder = number % 10;//1001%10 = 1,100%10 = 0,10%10=0,1%10=1,
            reversedNumber = reversedNumber * 10 + reminder;//(0*10)+1=1,(1*10)+0=10,(10*10)+0=100,(100*10)+1=1001,
            number = number / 10;//1001/10=100,100/10=10,10/10=1,1/10=0,
        }

        System.out.println("Reversed Number : " + reversedNumber);

        if (originalNumber == reversedNumber) {
            System.out.println("Number " + originalNumber + " is a palindrome");
        } else {
            System.out.println("Number " + originalNumber + " is not a palindrome");
        }
    }

    public static void main(String[] args) 
    {
        System.out.println("\n===== Palindrome Check =====");
        palindrome();   
    }
}