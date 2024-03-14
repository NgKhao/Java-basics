import java.util.Scanner;

public class BaiTapHinhTron {
	public static void main(String[] args) {
		
		double r, area, premeter;
		Scanner sc = new Scanner(System.in);
		try 
		{
			System.out.println("Nhap ban kinh: ");
			r = sc.nextDouble();
		} finally
		{
			sc.close();
		}
		area = Math.PI*Math.pow(r,2);
		premeter = 2*r*Math.PI;
		System.out.println("Dien tich hinh tron: " + area);
		System.out.println("Dien tich hinh tron: " + Math.round(area));
//		lam tron bang ham round se tra ve kieu long nen so 100 phai ep kieu double
		System.out.println("Dien tich hinh tron: " + Math.round(area * 100.0) / 100.0);
		
		System.out.println("Chu vi hinh tron: " + premeter);
		System.out.println("Chu vi hinh tron: " + Math.round(premeter));
		System.out.println("Chu vi hinh tron: " + Math.round(premeter * 100.0) / 100.0);
		
	}
}
