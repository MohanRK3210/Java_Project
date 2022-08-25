import java.util.Scanner;
import java.util.ArrayList;

class List
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		System.out.println("\nArrayList is Empty or Not: "+list.isEmpty());
		list.add(10);
		list.add("Mohan");
		list.add(true);
		list.add(2.3f);
		list.add(3,"Raj");
		System.out.println("\nPrint ArrayList: "+list);
		System.out.println("\nLength of ArrayList: "+list.size());
		System.out.println("\nRemove of ArrayList: "+list.remove(4));
		System.out.println("\nLength of ArrayList: "+list.size());
		System.out.println("\nPrint ArrayList: "+list);
		System.out.println("\nFind given Arralist in index: "+list.get(3));
		System.out.println("\nGiven Arralist is "+ list.indexOf(10) +" ,The Value is " +list.get(0)+" here or not: "+list.contains(10));
		System.out.println("\nArrayList is Empty or Not: "+list.isEmpty());


		
	}
}  
  