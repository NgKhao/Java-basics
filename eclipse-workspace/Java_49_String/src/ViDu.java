import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Nhập vào chuỗi: ");
		s = sc.nextLine();
		System.out.println("--------");
		
		System.out.println(s.length());
		int doDai = s.length();
		
//		lay ra 1 ki tu tai mot vi tri trong chuoi
		for(int i = 0; i < doDai; i++) {
			System.out.println("Vi tri " + i + " la: " + s.charAt(i));
		}
		
//		hàm getChars(start index, end index, array, vi tri bat dau lu vao mang)
		char[] arrayChar = new char[100];
		s.getChars(1, 3, arrayChar, 1);
		for(int i=0; i<arrayChar.length; i++)
			System.out.println("Vi tri " + i + " la: " + arrayChar[i]);
		
		byte[] arrBytes = s.getBytes(); 
		for (byte b : arrBytes) {
			System.out.println(b);
		}
	}
}
