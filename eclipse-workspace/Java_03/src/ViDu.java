import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap vao ho va ten: ");
		String fullName = sc.nextLine();
		
		System.out.println("Nhap MSSV: ");
		long id = sc.nextLong();
		
		System.out.println("Nhap diem thi: ");
		float score = sc.nextFloat();
		
		System.out.println("--------------------");
		System.out.println("ho ten: " + fullName);
		System.out.println("MSSV: " + id);
		System.out.println("diem thi: " + score);
		sc.close();
	}
}
