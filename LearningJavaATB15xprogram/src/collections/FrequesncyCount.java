package collections;

import java.util.*;

public class FrequesncyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Programming";
		Map<Character,Integer> FreqMap = new HashMap<>();
		for(char c :input.toCharArray()){
			FreqMap.put(c, FreqMap.getOrDefault(c, 0)+1);
			//p ->1
			//r->1+1
			//o->1
			//g->1+1
			//a->1
			//m->1+1
			//i->1
			//n->1
			
			
		}
		System.out.println(FreqMap);

	}

}
