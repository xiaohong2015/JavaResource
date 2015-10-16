package testmap;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	public static void main(String [] srgs){
		Map m1 = new HashMap();
		Map m2 = new HashMap();
		
		m1.put("one", new Integer(1));
		m1.put("two", new Integer(2));
		m1.put("three", new Integer(3));
		

		m2.put("A", new Integer(1));
		m2.put("B", new Integer(2));
		
		System.out.println(m1.size());
		System.out.println(m1.containsKey("one"));
		if(m1.containsKey("two")){
			int i = ((Integer)m1.get("two"));
			System.out.println(i);
		}
		
		Map m3 = new HashMap(m1);
		m3.putAll(m2);
		System.out.println(m3);	
	}
}
