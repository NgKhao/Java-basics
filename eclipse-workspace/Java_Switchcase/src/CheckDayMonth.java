import java.util.Scanner;

public class CheckDayMonth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month, year;
		System.out.println("Nhap thang: ");
		month = sc.nextInt();
		System.out.println("Nhap nam");
		year = sc.nextInt();
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: 
		{
			
			System.out.println("Co 31 ngay");
			break;
		}
		case 4:
		case 6:
		case 9:
		case 11:
		{
			System.out.println("Co 30 ngay");
			break;
		}
		case 2:
		{
			if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				System.out.println("Co 29 ngay");
			else
				System.out.println("Co 28 ngay");
			break;	
		}
		default:
			System.out.println("Du lieu sai");
		}
		sc.close();
	}
}
