package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ViDuGhiDoiTuong {
	public static void main(String[] args) {

			try {
				File file = new File("K:\\JavaBasic\\eclipse-workspace\\Java_73_Luu_Doi_Tuong_Vao_File\\file.data");
				OutputStream os = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(os);
				
				Student st = new Student("001", "TITV", 2000, 9.8f);
				oos.writeObject(st);
				oos.flush();
				oos.close();
			} catch (Exception e) {
				// TODO: handle exception
			}

	}
}
