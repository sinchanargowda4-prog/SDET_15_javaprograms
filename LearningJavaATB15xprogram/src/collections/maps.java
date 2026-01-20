package collections;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.*;

public class maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map mp = new HashMap();
		Map mp1 = new TreeMap();
		Map mp2 = new LinkedHashMap();
		mp.put("rollnum", 123);
		mp.put("name", "Sinchana");
		mp.put("subject", "kannada");
		System.out.println("Hashmap------" +mp);
		mp1.put("rollnum", 456);
		mp1.put("name", "Shivajee");
		mp1.put("subject", "Telugu");
		System.out.println("Treemap------"+mp1);
		mp2.put("rollnum", 789);
		mp2.put("name", "Kushvin");
		mp2.put("subject", "Telugukannada");
		System.out.println("Linkedhashmap--------"+mp2);
		
		
		
		
	}
		
}
