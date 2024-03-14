package main;

import java.util.LinkedList;
import java.util.Queue;

public class ViDuQueue {
	public static void main(String[] args) {
		Queue<String> danhSachSV = new LinkedList<String>();
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
