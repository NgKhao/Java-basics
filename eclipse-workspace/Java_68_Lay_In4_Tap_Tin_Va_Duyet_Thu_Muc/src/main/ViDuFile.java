package main;

import java.io.File;
import java.util.Scanner;

public class ViDuFile {
	File file;
	
	public ViDuFile(String tenFile) {
		this.file = new File(tenFile);
	}
	
//	check file co the thuc thi 
	public boolean checkThucThi() {
		return this.file.canExecute();
	}

	public boolean checkRead() {
		return this.file.canRead();
	}
	
	public boolean checkWrite() {
		return this.file.canWrite();
	}
	
	public void inDuongDan() {
		System.out.println(this.file.getAbsolutePath());
	}
	
	public void Inten() {
		System.out.println(this.file.getName());
	}
	
//	check file la thư mục hay tập tin
	public void checkLaThuMucHayTapTin() {
		if(this.file.isDirectory())
			System.out.println("Day la thu muc");
		else if(this.file.isFile())
			System.out.println("Day la tap tin");
	}
	
	public void inDanhSachCacFileCon() {
		if(this.file.isDirectory()) {
			System.out.println("Cac tap tin con/ thu muc con la: ");
			File[] mangCon = this.file.listFiles();	
			for (File file : mangCon) {
				System.out.println(file.getAbsolutePath());
			}
		}else if(this.file.isFile())
			System.out.println("Day la tap tin, khong co duw lieu con ben trong");
	}
	
	public void inCayThuMuc() {
		this.inChiTietCayThuMuc(this.file, 1);
	}
	public void inChiTietCayThuMuc(File f, int level) {
		for (int i = 0; i < level; i++) {
			System.out.print("\t");
		}
		System.out.print("|_");
		System.out.println(f.getName());
//		nếu là thư muc thì mới được đi vào
		if(f.canRead() && f.isDirectory()) {
			File[] mangCon = f.listFiles();
			for (int j = 0; j < mangCon.length; j++) {
				inChiTietCayThuMuc(mangCon[j], level + 1);
//				
//			for (File fx : mangCon) {
//				inChiTietCayThuMuc(fx, level + 1);
//			}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		System.out.println("Nhap ten file: ");
		String tenFile = sc.nextLine();
		ViDuFile vdf = new ViDuFile(tenFile);
		do {
			System.out.println("MENU-------------");
			System.out.println("1. Kiem tra file co the thuc thi: ");
			System.out.println("2. Kiem tra file co the read: ");
			System.out.println("2. Kiem tra file co the write: ");
			System.out.println("4. In duong dan: ");
			System.out.println("5. In ten file: ");
			System.out.println("6. Kiem tra file la thu muc hoac tap tin: ");
			System.out.println("7. In ra danh sach cac file con: ");
			System.out.println("8. In ra cay thu muc: ");
			System.out.println("0. Thoat");
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println(vdf.checkThucThi());
				break;
			}
			case 2: {
				System.out.println(vdf.checkRead());
				break;
			}
			case 3:{
				System.out.println(vdf.checkWrite());
				break;
			}
			case 4:{
				vdf.inDuongDan();
				break;
			}
			case 5:{
				vdf.Inten();
				break;
			}
			case 6:{
				vdf.checkLaThuMucHayTapTin();
				break;
			}
			case 7:{
				vdf.inDanhSachCacFileCon();
				break;
			}
			case 8:{
				vdf.inCayThuMuc();
				break;
			}
			default:
				break;
			}
			
			sc.nextLine();
		}while(choice != 0);
	}
}
