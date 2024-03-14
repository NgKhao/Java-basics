package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class ViDuDocText {
	public static void main(String[] args) {
		/* cach 1
		File f = new File("K:\\JavaBasic\\eclipse-workspace\\Java_72_Doc_du_lieu_tu_file\\file.txt");
		try {
			BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
			String line = null;
			while(true) {
				line = br.readLine();
				if(line == null) {
					break;
				}else {
					System.out.println(line);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		/* cach 2 */
		File f2 = new File("K:\\\\JavaBasic\\\\eclipse-workspace\\\\Java_72_Doc_du_lieu_tu_file\\\\file.txt");
		try {
			List<String> allText = Files.readAllLines(f2.toPath(), StandardCharsets.UTF_8);
			for(String line : allText) {
				System.out.println(line);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
