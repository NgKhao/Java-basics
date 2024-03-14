import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a;
//		try
//		{
			System.out.println("Nhap a: ");
			a = sc.nextDouble();
//		}finally {
			sc.close();
//		}

		System.out.println("ceil a = " + Math.ceil(a));
		System.out.println("floor a = " + Math.floor(a));
	}
}
