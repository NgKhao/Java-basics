package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipMultipleFiles {
	public static void main(String[] args) throws IOException{
		List<String> srcFiles = Arrays.asList("K:\\JavaBasic\\eclipse-workspace\\Java_76_Nen_Giai_Nen_file\\Test3.txt", "K:\\JavaBasic\\eclipse-workspace\\Java_76_Nen_Giai_Nen_file\\Test2.txt");
		FileOutputStream fos = new FileOutputStream("K:\\JavaBasic\\eclipse-workspace\\Java_76_Nen_Giai_Nen_file\\multiCompressed.zip");
		ZipOutputStream zipOut = new ZipOutputStream(fos);
		for(String srcFile : srcFiles) {
			File fileToZip = new File(srcFile);
			FileInputStream fis = new FileInputStream(fileToZip);
			ZipEntry zipEnTry = new ZipEntry(fileToZip.getName());
			zipOut.putNextEntry(zipEnTry);
			byte[] bytes = new byte[1024];
			int length;
			while((length = fis.read(bytes)) >= 0) {
				zipOut.write(bytes, 0, length);
			}
			fis.close();
		}
		zipOut.close();
		fos.close();
		
	}
}
