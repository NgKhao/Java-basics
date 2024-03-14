package main;

import java.io.File;
import java.io.IOException;

public class ViDuTapTinVaThuMuc {
	public static void main(String[] args) {
//		use \\ vì \ biểu trưng cho nhập vào ktu db vi du như \n
		File folder1 = new File("K:\\JavaBasic\\eclipse-workspace\\Java_67_FIle_Foder");
		File folder2 = new File("K:\\JavaBasic\\eclipse-workspace\\Java_68_FIle_Foder");
		
//		check file exist hay ko
		System.out.println("Kiem tra folder1 co ton tai hay ko: " + folder2.exists());
				
//		tạo thư mục
//		phương thức mkdir() => tao 1 folder
		File d1 = new File("K:\\JavaBasic\\eclipse-workspace\\Java_67_FIle_Foder\\Directory_1");
		d1.mkdir();
		
//		phương thức mkdirs() => tao nhieu folder cung 1 luc
		File d2 = new File("K:\\JavaBasic\\eclipse-workspace\\Java_67_FIle_Foder\\Directory_1\\Directory_2\\Directory_3\\Directory_4");
//		d1.mkdir();
		d2.mkdirs();
		
		//Tạo tập tin
		File file1 = new File("K:\\JavaBasic\\eclipse-workspace\\Java_67_FIle_Foder\\Directory_1\\ViDu1.txt");
		try {
			file1.createNewFile();
		} catch (IOException e) {
//			Không có quyền tạo tệp tin
//			Ổ cứng bị đầy
//			Đường dẫn sai
			e.printStackTrace();
		}
	}
}
