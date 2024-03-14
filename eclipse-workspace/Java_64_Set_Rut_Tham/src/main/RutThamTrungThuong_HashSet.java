package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RutThamTrungThuong_HashSet {
	
//	hashset ko sap xep
	Set<String> thungPhieuDuThuong = new HashSet<String>();

	public RutThamTrungThuong_HashSet() {
	}

	public boolean themPhieu(String value) {
		return this.thungPhieuDuThuong.add(value);
	}
	
	public boolean xoaPhieu(String value) {
		return this.thungPhieuDuThuong.remove(value); 
	}
	
	public boolean checkPhieuTonTai(String value) {
		return this.thungPhieuDuThuong.contains(value);
	}
	
	public void xoaAllPhieu() {
		this.thungPhieuDuThuong.clear();
	}
	
	public int laySoLuong() {
		return this.thungPhieuDuThuong.size();
	}
	
	public String rutMotPhieu() {
		String result = "";
		Random rd = new Random();
		int index = rd.nextInt(this.thungPhieuDuThuong.size()); // tu 0 đến size - 1
		
//		chuyển thành array sau đó ép kiểu thàng string
		result = (String)this.thungPhieuDuThuong.toArray()[index];
		return result;
		
	}
	
	public void inAll() {
//		chuyển thành mảng r dùng toString để in ra hết
		System.out.println(Arrays.toString(this.thungPhieuDuThuong.toArray()));
	}
	
	public static void main(String[] args) {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		RutThamTrungThuong_HashSet rt = new RutThamTrungThuong_HashSet();
		do {
			System.out.println("--------------------------------");
			System.out.println("MENU:");
			System.out.println("1. Them ma so du thuong.");
			System.out.println("2. Xoa ma so du thuong.");
			System.out.println("3. Kiem tra ma so du thuong co ton tai hay khong");
			System.out.println("4. Xoa tat ca cac phieu du thuong");
			System.out.println("5. SO luog phieu du thuong.");
			System.out.println("6. Rut tham trung thuong.");
			System.out.println("7. In ra tat ca cac phieu.");
			System.out.println("0. Thoat khoi chuong trinh.");
			
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1,2,3: {
				
				System.out.println("Nhap ma phieu du thuong: ");
				String value = sc.nextLine();
				if(choice == 1)
					rt.themPhieu(value);
				else if(choice == 2)
					rt.xoaPhieu(value);
				else
					System.out.println("Ket qua kiem tra phieu: " + rt.checkPhieuTonTai(value));
				break;
			}
			case 4:
				rt.xoaAllPhieu();
				break;
			case 5:
				System.out.println("so luong phieu: " + rt.laySoLuong());
				break;
			case 6:
				System.out.println("Rut 1 phieu: " + rt.rutMotPhieu());
				break;
			case 7:{
				System.out.println("Cac ma phieu: ");
				rt.inAll();
				break;
			}
			}
		}while(choice != 0);
	}
}
