package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class setdiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hash set will not follow order
		//it can store one null value
		//data will b stored in hash mechanism , unique key will b given 
		//Hashset will not allow duplicates
		Set HS = new HashSet();
		HS.add("apple");
		HS.add("banana");
		HS.add("chikkoo");
		HS.add(null);
		System.out.println(HS);
		Iterator HSlist = HS.iterator();
		while(HSlist.hasNext()) {
			System.out.println(HSlist.next());
		}
		
//		Linkedhash
		Set LHS = new LinkedHashSet();
		LHS.add("apple");
		LHS.add("banana");
		LHS.add("chikkoo");
		LHS.add(null);
		LHS.add(123);
		System.out.println(HS);
		Iterator LHS1 = LHS.iterator();
		while(LHS1.hasNext()) {
			System.out.println(LHS1.next());
		}
		
//		Tree set
		Set TS = new TreeSet();
		TS.add("watermelon");
		TS.add("apple");
		TS.add("banana");
		TS.add("chikkoo");
//		TS.add(null);
//		TS.add(123);
		System.out.println(TS);
		Iterator TS1 = TS.iterator();
		while(TS1.hasNext()) {
			System.out.println(TS1.next());
		}

	}

}
