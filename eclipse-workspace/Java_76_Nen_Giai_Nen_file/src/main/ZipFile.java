package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFile {
	public static void main(String[] args) throws IOException{
		// file goc
		String sourceFile = "K:\\JavaBasic\\eclipse-workspace\\Java_76_Nen_Giai_Nen_file\\Test.txt";
//		Tạo một đối tượng FileOutputStream để ghi dữ liệu vào tệp ZIP được tạo
		FileOutputStream fos = new FileOutputStream("K:\\JavaBasic\\eclipse-workspace\\Java_76_Nen_Giai_Nen_file\\compressed.zip");
//		Tạo một đối tượng ZipOutputStream, được sử dụng để ghi dữ liệu nén vào tệp ZIP
		ZipOutputStream zipOut = new ZipOutputStream(fos);
		
		File fileToZip = new File(sourceFile);
		FileInputStream fis = new FileInputStream(fileToZip);
//		Tạo một đối tượng ZipEntry để đại diện cho mỗi tệp trong tệp ZIP
		ZipEntry zipEnTry = new ZipEntry(fileToZip.getName());
//		thêm nó vào tệp ZIP bằng phương thức 
		zipOut.putNextEntry(zipEnTry);
		byte[] bytes = new byte[1024];
		int length;
		while((length = fis.read(bytes)) >= 0) {
			zipOut.write(bytes, 0, length);
		}
		
		zipOut.close();
		fis.close();
		fos.close();
	}
}
