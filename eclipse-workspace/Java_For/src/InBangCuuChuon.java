//import java.util.Scanner;

public class InBangCuuChuon {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n;
		System.out.println("Nhap bang cuu chuong thu: ");
//		n = sc.nextInt();
		for(int i = 2; i <= 9; i++)
		{
			for(int j=1; j <= 10; j++)
			{
				System.out.println(i + " x  " + j + " = " + (i*j));
			}
			System.out.println("--------------------------");
		}

//		sc.close();
	}
}
