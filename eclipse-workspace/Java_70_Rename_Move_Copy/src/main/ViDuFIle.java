package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class ViDuFIle {
	
	public static void copyAll(File f1, File f2) {
		try {
			Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(f1.isDirectory()) {
			// copy folder or file con
			File[] mangCon = f1.listFiles();
			for (File f : mangCon) {
				File f_new = new File(f2.getAbsoluteFile() + "\\" + f.getName());
				copyAll(f, f_new);
			}
		}
	}
	public static void main(String[] args) {
		File f0 = new File("K:\\JavaBasic\\eclipse-workspace\\Java_70_Rename_Move_Copy\\File_1.txt");
		File f1 = new File("K:\\JavaBasic\\eclipse-workspace\\Java_70_Rename_Move_Copy\\File_2.txt");
		File f2 = new File("K:\\JavaBasic\\eclipse-workspace\\Java_70_Rename_Move_Copy\\File_2xyz.txt");

////	1.	Rename file or folder
////		use File to rename
//		f0.renameTo(f1);
//		
////		use Files để thay đổi tên
//		try {
//			Files.move(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
////	2.	Di chuyen file
//		File f2_new = new File("K:\\JavaBasic\\eclipse-workspace\\Java_70_Rename_Move_Copy\\f0\\File_2xyz.txt");
//		try {
//			Files.move(f2.toPath(), f2_new.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//	3.	Copy file
		
		File f_0 = new File("K:\\JavaBasic\\eclipse-workspace\\Java_70_Rename_Move_Copy\\f0");
		File f_0copy = new File("K:\\JavaBasic\\eclipse-workspace\\Java_70_Rename_Move_Copy\\f0_copy");
		
//		// cách này không thể copy thư mục có file con bên trong 
//		try {
//			Files.copy(f_0.toPath(), f_0copy.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		// cách copy có thư mục có file con bên trong
		ViDuFIle.copyAll(f_0, f_0copy);
	}
}
