import java.util.Scanner;

public class ViDu {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = 0;
			try {
				System.out.println("Nhap vao so nguyen:");
				n = sc.nextInt();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("DL nhap ko dung");
			} finally { // ngoai le hay ko deu xuat trong finally
				System.out.println("Finally");
			}
			System.out.println("Gia tri nhap :" + n);
			System.out.println("Kt ctr");
	}
}
