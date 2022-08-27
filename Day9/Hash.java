import java.util.*;

class Hash
{
	public static void main(String[] args)
	{
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		List<string> val = new ArrayList<String>();
		val.add("Mohan");
		val.add("9791863210");

		map.put("A",val);
		System.out.println("Fetching Key");
		for(Map.Entry<String,List<String>> entry:map.entrySet())
		{
			String key = entry.getKey();
			List<string> values = entry.getValue();
			System.out.println("Key = "+ key);
			System.out.println("Values = "+ values+ "n");
		}
	}
}





















