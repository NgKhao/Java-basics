package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ViDuDocDoiTuong {
	public static void main(String[] args) {
		try {
			File file = new File("K:\\JavaBasic\\eclipse-workspace\\Java_74_Doc_Doi_Tuong_Tu_Tap_Tin\\file.data");
			InputStream is = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(is);
			
			Student st = (Student) ois.readObject();
			System.out.println(st.getFullName());
			System.out.println(st);
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
