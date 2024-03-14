import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ViDuGhiText {
	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter("K:\\JavaBasic\\eclipse-workspace\\Java_71_Ghi_du_lieu_file\\file.txt", "UTF-8");
			pw.println("Xin chao, minh la titv");
			pw.print("Du lieu: ");
			pw.print(3.14);
			pw.print(' ');
			pw.println();
			pw.println(" la so PI");
			
			Student st = new Student(100, "Nguyen A");
			pw.println(st);
			pw.println();
			
			pw.flush();
			pw.close();
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
