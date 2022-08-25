import java.util.Scanner;
import java.util.*;

class Hash
{
	public static void main(String[] args)
	{
		HashMap hm = new HashMap();
		hm.put(1,"Mohan");
		hm.put(2,"Raj");
		System.out.println("\nHashMap One:"+hm);
		hm.put(1,"MohanRaj");
		System.out.println("\nHashMap One:"+hm);

		HashMap hm2 = new HashMap();
		hm2.putAll(hm);
		System.out.println("\nHashMap Two:"+hm2);
		System.out.println("\n"+hm2.get(1));

		System.out.println("\n"+hm2.containsKey(2));

		System.out.println("\n"+hm2.containsValue("MohanRaj"));
		hm2.remove(2);
		System.out.println("\nHashMap Two:"+hm2);
		System.out.println("\nSize of HashMap: "+hm2.size());

		System.out.println("\nHashMap is Empty or Not: "+hm2.isEmpty());
		hm2.clear();

		System.out.println("\nHashMap is Empty or Not: "+hm2.isEmpty());			
	}
}  
  