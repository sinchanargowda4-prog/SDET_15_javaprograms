package collections;

import java.util.*;

public class sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set HS = new HashSet();
		Set LHS = new LinkedHashSet();
		Set TS = new TreeSet();
		HS.add("apple");
		HS.add("banana");
		HS.add("chikkoo");
		System.out.println(HS);
		TS.add("apple");
		TS.add("null");
		TS.add("strawberry");
		System.out.println(TS);
		LHS.add("apple");
		LHS.add("moosambi");
		LHS.add("grapes");
		System.out.println(LHS);
		Set allfruites = new HashSet();
		allfruites.addAll(TS);
		allfruites.addAll(HS);
		allfruites.addAll(LHS);
		System.out.println(allfruites);
		for(Object s :allfruites) {
			System.out.println(s);
			
		}
		Iterator IT =  allfruites.iterator();
		while(IT.hasNext()) {
			System.out.println(IT.next());
			
		}
		
		

	}

}
