import java.util.Scanner;

class Voting
{
	public static void voting()
	{
		System.out.println("\n===== Voter Identification =====");

		Scanner scan = new Scanner(System.in);
		int voterAge,candidate=0,maleGenderCount=0,femaleGenderCount=0,overAllEligible=0,maleEligible=0,femaleEligible=0;
		String validate,category,name;
		char gender,rentry;

		
		do{
			System.out.print("Name: ");
			name = scan.next();

			System.out.print("Age: ");
			voterAge = scan.nextInt();
			
			if(voterAge>=18)
			{
				overAllEligible++;
			}
			else
			{
				overAllEligible = overAllEligible;
			}

			System.out.print("Gender (M/F): ");
			gender = scan.next().charAt(0);

			if(('M' == gender) ||('m' == gender))
			{
				maleGenderCount++;
				if(voterAge>=18)
				{
					maleEligible++;
				}
				else
				{
					maleEligible = maleEligible;
				}
			}
			else if(('F' == gender)||('f' == gender))
			{
				femaleGenderCount++;
				if(voterAge>=18)
				{
					femaleEligible++;
				}
				else
				{
					femaleEligible = femaleEligible;
				}
			}
			else
			{
				do{
					System.out.println("Invalid Gender.");
					System.out.print("\nGender (M/F): ");
					gender = scan.next().charAt(0);
					if(('M' == gender) ||('m' == gender))
					{
						maleGenderCount++;
						if(voterAge>=18)
					{
						maleEligible++;
					}
					else
					{
						maleEligible = maleEligible;
				}
					}
			else if(('F' == gender)||('f' == gender))
			{
				femaleGenderCount++;
				if(voterAge>=18)
				{
					femaleEligible++;
				}
				else
				{
					femaleEligible = femaleEligible;
				}
			}
		}while(('M' != gender) && ('m' != gender)&&('F' != gender) && ('f' != gender));
	}
			
			candidate++;//0+1=1,2

			category = ('M' == gender || 'm' == gender) ? "Mr":"Mrs";
			validate = (voterAge >=18) ? "Eligible" : "Not Eligible";
			System.out.println((category + " " + name)+" is "+ validate +" for Voting");
			System.out.print("\nContinue the Voting Process[Y/N]:");	//y	
			rentry = scan.next().charAt(0);
			
		}
		while((rentry =='Y') ||(rentry == 'y'));//n

			System.out.println("\n===== Voting Report =====");
			System.out.println("Candidated Visited = " + candidate);
			System.out.println("Male Count = " + maleGenderCount);
			System.out.println("Female Count = " + femaleGenderCount);
			System.out.println("over All Eligible = " + overAllEligible);
			System.out.println("Male Eligible = " + maleEligible);
			System.out.println("Female Eligible = " + femaleEligible);
	}

	public static void main(String[] args)
	{
		voting();
	}
}