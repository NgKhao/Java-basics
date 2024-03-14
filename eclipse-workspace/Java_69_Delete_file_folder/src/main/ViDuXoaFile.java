package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ViDuXoaFile {
	
	public static void xoaFile(File fx) {
//		xóa nếu là tập tin
		 if(fx.isFile()) {
			 System.out.println("Da Xoa: " + fx.getAbsolutePath());
			 fx.delete();		 
		 }
			 
		 else if(fx.isDirectory()) {
//			 lấy các file con
			 File[]  mangCon = fx.listFiles();
			 for (File f : mangCon) {
//				 Xoá các file con
				xoaFile(f);
			 }
//			 xóa bản thân thư mục sau khi xóa các file con
			 System.out.println("Da Xoa: " + fx.getAbsolutePath());
			 fx.delete();
		 }
	}
	
	public static void xoaFile2(File fx) {
		if(fx.isFile()) {
			Path p =fx.toPath();
			try {
				Files.deleteIfExists(p);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(fx.isDirectory()){
			File[] mangCon = fx.listFiles();
			for (File f : mangCon) {
				xoaFile2(f);
			}
			Path p = fx.toPath();
			try {
				Files.deleteIfExists(p);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		
		
			File f0 = new File("K:\\JavaBasic\\eclipse-workspace\\Java_69_Delete_file_folder\\f0");
			File f0_1 = new File("K:\\JavaBasic\\eclipse-workspace\\Java_69_Delete_file_folder\\f0_1");
			File f_vidu = new File("K:\\JavaBasic\\eclipse-workspace\\Java_69_Delete_file_folder\\Vidu.txt");
	
			
//			***sử dụng class File xóa tập tin hoặc thư mục
//			f0.deleteOnExit(); // xoá ko đc vì có chưa thư mục và tập tin
			f0_1.deleteOnExit(); // xóa đc vì là thư mục rỗng
			f_vidu.deleteOnExit();
			System.out.println(f0_1.delete());
			ViDuXoaFile.xoaFile(f0);
	
			
//			***sử dụng class Files xóa tập tin và thư mục
//			Path p0 = f0.toPath();
//			Path p0_1 = f0_1.toPath();
//			Path p_vidu = f_vidu.toPath();
//			try {
////				Files.deleteIfExists(p0);
//				Files.deleteIfExists(p0_1);
//				Files.deleteIfExists(p_vidu);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
//			ViDuXoaFile.xoaFile2(f0);
			
	}
	
}
