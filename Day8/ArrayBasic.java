import java.util.Scanner;

class ArrayBasic
{
	public static void arrayBasic()
	{
		int array[]=new int[3];
		array[0]=10;
		array[1]=7;
		array[2]=55;
		System.out.println("\n===== One Dimenstional Array =====");
		System.out.println("\nTotal array[] value is: "+ array[0]+"-"+array[1]+"-"+array[2]);
		System.out.println("\narray[0] value is: "+array[0]);
		System.out.println("array[2] value is: "+array[2]);
	}
	public static void main(String[] args)
	{
		arrayBasic();
	}
}