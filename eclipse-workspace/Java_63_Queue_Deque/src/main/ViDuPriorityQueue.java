package main;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ViDuPriorityQueue {
	public static void main(String[] args) {
//		PriorityQueue<E> là Queue đã được sắp xếp
		Queue<String> danhSachSV = new PriorityQueue<String>();
		 danhSachSV.offer("TITV 1");
		 danhSachSV.offer("Nguyen B");
		 danhSachSV.offer("Nguyen A");
		 danhSachSV.offer("TITV 2");
		 
		 while(true) {
//			 poll => lay ra va xoa khoi queue
//			 peek => lay ra nhung ko xoa
			 String ten = danhSachSV.poll();
			 if(ten == null)
				 break;
			 System.out.println(ten);
		 } 
	}
}
