import java.util.HashMap;

public class hashmap {
	public static void main (String[] args)
	{
		HashMap<String, String> H1 = new HashMap<String, String>();
		H1.put("BMW", "Diesal");
		H1.put("Ferrari", "Diesal");
		H1.put("AUDI", "Gas");
		H1.put("Tesla", "Electric");
		H1.put("Ford", "Hybrid");
		//System.out.println(H1);
	for (String i : H1.keySet())
	{
		for (String j : H1.values())
		{
		System.out.println(i+j);
	}
	}
	}
	

}
