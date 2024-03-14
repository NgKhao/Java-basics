package main;

import java.util.ArrayDeque;
import java.util.Deque;

public class ViDuDeque {
	public static void main(String[] args) {
		Deque<String> dsSV = new ArrayDeque<String>();
		
		dsSV.offer("TITV 1");
		dsSV.offer("TITV 3");
		dsSV.offer("Nguyen B");
		dsSV.offerLast("TITV 5");
		dsSV.offerFirst("TITV 0");
		
		while(true) {
//			String ten = dsSV.pollLast();
			String ten = dsSV.pollFirst();
			if(ten == null)
				break;
			System.out.println(ten);
		}
	}
}
