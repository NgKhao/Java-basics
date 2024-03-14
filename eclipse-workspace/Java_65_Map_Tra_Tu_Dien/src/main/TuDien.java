package main;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TuDien {
	private Map<String, String> data = new TreeMap<String, String>();
	
	public String themTu(String key, String value) {
		return this.data.put(key, value);
	}
		
	public String xoaTu(String key) {
		return this.data.remove(key);
	}
	
	public String traTu(String key) {
		return this.data.get(key);
	}
	

	public void inTuKhoa() {
		Set<String> tapHopTuKhoa = this.data.keySet();
		System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
//		System.out.println(this.data.toString());
	}
	
	public int laySoLuong() {
		return this.data.size();
	}
	
	public void xoaALL() {
		this.data.clear();
	}
	
	public static void main(String[] args) {
		TuDien tuDien = new TuDien();
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("---------------------");
			System.out.println("MENU: ");
			System.out.println("1. Them tu(tu khoa, y nghia)");
			System.out.println("2. Xoa tu");
			System.out.println("3. Tim y nghia cua tu khoa - Tra tu");
			System.out.println("4. In ra danh sach tu khoa");
			System.out.println("5. In ra so luong tu");
			System.out.println("6. Xoa tat ca cac tu khoa");
			System.out.println("0. Thoat");
			
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1: {
				System.out.println("Nhap vao tu khoa: ");
				String key = sc.nextLine();
				System.out.println("Nhap vao y nghia: ");
				String value = sc.nextLine();
				tuDien.themTu(key, value);
				break;
			}
			case 2,3:{
				System.out.println("Nhap vao tu khoa: ");
				String key = sc.nextLine();
				if(choice == 2)
					tuDien.xoaTu(key);
				else 
					System.out.println("Y nghia: " + tuDien.traTu(key));
					
				break;
			}
			case 4:{
				tuDien.inTuKhoa();
				break;
			}
			case 5:{
				System.out.println("so luong tu khoa: " + tuDien.laySoLuong());
				break;
			}
			case 6:{
				tuDien.xoaALL();
				break;
			}
			}
		}while (choice != 0);
	}
}
