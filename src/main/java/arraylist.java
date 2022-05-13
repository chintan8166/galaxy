import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
	public static void main(String[] args) {
		/*
		 * ArrayList<String> A1 = new ArrayList<String>();
		 *  A1.add("Batman");
		 * A1.add("Joker"); A1.add("Dare Devil"); A1.add("Ant man");
		 * System.out.println(A1);
		 */
		
		ArrayList<String> C1= new ArrayList<String>();
		C1.add("Toyota");
		C1.add("Acura");
		C1.add("Audi");
		C1.add("Tesla");
		C1.set(3,"Ford");
		//C1.clear();
		for (int i=0; i<C1.size();i++) {
			Collections.sort(C1);
			System.out.println(C1.get(i));
		}
	}

}
