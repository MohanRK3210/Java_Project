import java.util.Scanner;

class Student
{
	int rollNumber,mark;
	String name;

	public void attendedExam()
	{
		if(mark>=35)
		{
			System.out.println("\nYou are Passed.");
		}
		else
		{
			System.out.println("\nYou are Failed.");
		}
	}
}

class College
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Student student = new Student();

		System.out.println("\n===== Entry of Student Details =====");
		
		System.out.print("\nStudent Roll Number: ");
		student.rollNumber= scan.nextInt();
		
		System.out.print("Student Name: ");
		student.name = scan.next();

		System.out.println("\nThe Student Name is :"+ student.name +" and,here Roll Number is : "+student.rollNumber+" will be Stored in the database.");
		
		System.out.print("\nyou are Exam Mark will be: ");
		int mark = scan.nextInt();
		student.mark = mark;

		student.attendedExam();

	}
}











