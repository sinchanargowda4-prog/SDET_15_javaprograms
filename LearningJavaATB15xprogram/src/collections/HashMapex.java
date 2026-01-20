package collections;

import java.util.*;

public class HashMapex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String ,Integer> mp = new HashMap();
		mp.put("sinchana", 123);
		mp.put("ronald", 456);
		mp.put("john", 789);
		mp.put("sinchana1", 478);
		mp.put("sinchana2", 123);
		System.out.println(mp);
		System.out.println(mp.keySet());
		System.out.println(mp.entrySet());
		System.out.println(mp.values());
		for(String key: mp.keySet()) {
			System.out.println("student details  " + mp.get(key));
		}
		if(mp.containsKey("ronald")) {
			System.out.println("exist");
		}else {
			System.out.println("NO");
		}
		System.out.println(mp.size());
		
		Map<String ,Integer> mp1 = new Hashtable<>();
		mp1.put("sinchana", 123);
		mp1.put("ronald", 456);
		mp1.put("john", 789);
		mp1.put("sinchana1", 478);
		mp1.put("sinchana2", 123);
		System.out.println(mp1);
		System.out.println(mp1.keySet());
		System.out.println(mp1.entrySet());
		System.out.println(mp1.values());
		
		Enumeration<Integer> e =  mp1.keys();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	}
		
}
