import java.util.Scanner;

class Measurement
{
	public static void main(String[] args)
	{

	Scanner scan = new Scanner(System.in);
	long centimeter,kilometer,meter,feet,cms;

	System.out.println("\n===== Measurement ===== ");

	System.out.print("\nCentimeter Value: ");
	centimeter = scan.nextLong();

	kilometer = (centimeter>=10000)? (centimeter/10000):(centimeter*0);
	System.out.println("\nThe kilometer   : " + kilometer); 

	centimeter = centimeter-(kilometer*1000); 
	
	meter = (centimeter>=100)? (centimeter/100):(centimeter*0);
	System.out.println("The Meter \t: " + meter); 

	centimeter = centimeter-(meter*100); // 9876 -(98*100) = 76

	feet = (centimeter>30)? (centimeter/30):(centimeter*0); // 2
	System.out.println("The Feet \t: " + feet); // 2

	centimeter = centimeter-(feet*30); // 70-(2*30)= 
	
	System.out.println(("\n"+ kilometer + " Kilometres ") + ( meter + " Meters ") + ( feet + " Feet ") + ( centimeter + " centimeter "));
	}
}