package collections;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue LHS = new PriorityQueue();
		LHS.add("apple");
		LHS.add("banana");
		LHS.add("chikkoo");
//		LHS.add(null);
//		LHS.add(123);
		System.out.println(LHS);
		Iterator LHS1 = LHS.iterator();
		while(LHS1.hasNext()) {
			System.out.println(LHS1.next());
		}
		
		
//		linkedlist queue
		Queue LQ = new LinkedList();
		LQ.add("apple");
		LQ.add("banana");
		LQ.add("chikkoo");
		LQ.add(null);
		LQ.add(123);
		System.out.println(LHS);
		Iterator LHS2 = LQ.iterator();
		while(LHS2.hasNext()) {
			System.out.println(LHS2.next());
		}
		
		
//		arrayDequeue queue
		ArrayDeque DQ = new ArrayDeque();
		DQ.push("apple");
		DQ.push("banana");
		DQ.push("chikkoo");
		DQ.poll();
//		DQ.add(null);
//		DQ.add(123);
		System.out.println(LHS);
		Iterator LHS3 = DQ.iterator();
		while(LHS3.hasNext()) {
			System.out.println(LHS3.next());
		}


	}

}
