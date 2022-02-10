package mapConcept;

import java.util.HashMap;

public class Employee {

	public static void main(String[] args) {


		HashMap<String, String> emp = new HashMap<String, String>();
		emp.put("UN", "Parashu");
		emp.put("LN", "Rama");
		
		System.out.println(emp.get("UN"));
		
		emp.forEach ((k,v) -> System.out.println(k + ":" + v));

	}
}
