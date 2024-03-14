package main;

import java.util.Scanner;
import java.util.Stack;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<String> stackChuoi = new Stack<String>();
		
//		stackChuoi.push(value) => đưa value vào stack
//		stackChuoi.pop() => lấy value ra và xóa khỏi stack
//		stackChuoi.peek() => lấy value ra, nhưng ko xóa khỏi stack
//		stackChuoi.clear() => xóa all ptu trong stack
//		stackChuoi.contains(value) => xác dịnh value có tồn tại trong tack ko
//		stackChuoi.size() => độ lớn stack
		
//		reverse String
		System.out.println("Nhap vao chuoi: ");
		String s = sc.nextLine();
		for(int i=0; i<s.length(); i++) {
			stackChuoi.push(s.charAt(i) + ""); //ban đầu là char + "" thành String	
		}
		
		for(int i=0; i<s.length(); i++) {
			System.out.print(stackChuoi.pop());
		}
		System.out.println();
		
//		chuyen thap phan sang nhi phan
		System.out.println("Nhap so nguyen duong:");
		int x = sc.nextInt();
		Stack<Integer> stackSoDu = new Stack<Integer>();
		while(x != 0) {
			int soDu = x % 2;
			stackSoDu.push(soDu);
			x = x/2;
		}
		int n = stackSoDu.size();
		for(int i=0; i < n; i++) {
			System.out.print(stackSoDu.pop());
		}
	}
}
