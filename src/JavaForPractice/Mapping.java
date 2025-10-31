package JavaForPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Mapping {

	public static void main(String[] args) {
		HashMap <Integer,String>hm = new HashMap();
		hm.put(101, "he");
		System.out.println(hm);
		
		LinkedHashMap <String,Integer>lhm = new LinkedHashMap();
		lhm.put("hello",109);
		System.out.println(lhm);
		
	}

}
