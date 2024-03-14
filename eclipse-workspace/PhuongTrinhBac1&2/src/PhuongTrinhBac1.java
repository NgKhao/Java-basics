import java.util.Scanner;

public class PhuongTrinhBac1 {
	public static void main(String[] args) {
		double a, b;
		Scanner sc = new Scanner(System.in);
//		try
//		{
		System.out.println("Nhap a: ");
		a = sc.nextDouble();
		System.out.println("Nhap b: ");
		b= sc.nextDouble();
//		}
//		finally
//		{
		sc.close();
//		}
		if(a == 0)
		{
			if(b == 0)
				System.out.println("Phuong trinh vo so nghiem");
			else
				System.out.println("Phuong trinh vo nghiem");
		}
		else
			System.out.println("Co ngiem: " + -b/a);
	}
}
