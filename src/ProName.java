import java.util.LinkedHashMap;
import java.util.Set;

public class ProName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<String, Integer> lhm= new LinkedHashMap<String, Integer>();
		
		lhm.put("pen", 10);
		lhm.put("Pencil", 20);
		lhm.put("Paper", 30);
		
		System.out.println(lhm.get("Paper"));
		
		lhm.put("Pencil", 40);
		
		System.out.println(lhm.get("Pencil"));
		
		lhm.remove("pen");
		
		Set<String> keys= lhm.keySet();
		
		for (String key:keys) {
			
			Integer quantity= lhm.get(key);
			
			System.out.println("ProName is "+ key  + " & Quantity is "+ quantity);
		}
		
		
		
	}

}
