import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class JavaCollection_arrayList {
	
	public static void main(String[] args) {
		HashMap<String, String> H1 = new HashMap<String, String>();
		H1.put("India", "delhi");
		H1.put("USA", "Newyork");
		H1.put("Canada", "Toronto");
	
		for (String i : H1.values())
		{
			System.out.println(i);
		}
	} 

}
