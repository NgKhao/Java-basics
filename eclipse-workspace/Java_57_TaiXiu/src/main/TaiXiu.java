package main;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*
 * một người chơi sẽ có 1 tài khoản, người chơi có quyền đặt cược ít hơn hoặc bằng
 * số tiền đang có
 * Luật chơi:
 * có 3 viên xúc xắc. Mỗi viên có 6 mặt từ 1 đến 6.
 * Mỗi lần lắc sẽ ra 1 kết quả. Kết quả = giá trị xx1 + xx2 + xx3
 * 1. Nếu tổng = 3 or 18=> cái ăn hết, người chơi thua.
 * 2. Nếu tổng = 4 -> 10 (Xỉu) => đặt xỉu win, ngược lại thua
 * 3. Nếu tổng  = 11 -> 17 (Tài) => đặt tài win, ngược lại thua
 */
public class TaiXiu {
	public static void main(String[] args) {
		double  account = 5000000.99;
		
//		Locale lc = new Locale("vi", "VN");
		Locale lc = new Locale("en", "US");
//		NumberFormat numf = NumberFormat.getInstance(lc);
		NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
		
		Scanner sc = new Scanner(System.in);
		int choice = 1;
		do {
			System.out.println("------------- MỜI BẠN LỰA CHỌN -----------");
			System.out.println("Chọn (1) để tiếp tục chơi.");
			System.out.println("Chọn (phím bất kỳ) để thoát.");
			choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("*** BẮT ĐẦU CHƠI: ");
				System.out.println("****** Tài Khoản của bạn: " + numf.format(account) + ", bạn muốn cược bao nhiêu?");
				double datCuoc = 0;
				do {
					System.out.println("****** Đặt cược (0< số tiền cược <= " + numf.format(account) + ": ");
					datCuoc = sc.nextDouble();
				}while(datCuoc <= 0 || datCuoc > account);
				
				int choiceTaiXiu = 0;
				do {
					System.out.println("****** Chọn 1<->Tài hoặc 2<->Xỉu");
					choiceTaiXiu = sc.nextInt();
				}while(choiceTaiXiu != 1 && choiceTaiXiu != 2);
				
//				tung xuc xac
				Random xucXac1 = new Random();
				Random xucXac2 = new Random();
				Random xucXac3 = new Random();
				
//				nextInt(max) trả về số ngâu nhiên từ 1 -> n-1
				int value1 = xucXac1.nextInt(5) + 1;
				int value2 = xucXac2.nextInt(5) + 1;
				int value3 = xucXac3.nextInt(5) + 1;
				int sum = value1 + value2 + value3;
				
//				ket qua
				System.out.println("Kết quả: " + value1 + " - "+ value2 + " - " + value3);
				if(sum == 3 || sum == 18) {
					account -= datCuoc;
					System.out.println("****** Tổng là: " + sum + " => Nhà cái ăn hết, bạn đã thua!!");
					System.out.println("****** Tài khoản của bạn là: " + numf.format(account));
				}else if(sum >= 4 && sum <= 10) {
					System.out.println("****** Tổng là: " + sum + " => Xỉu");
					if(choiceTaiXiu == 2) {
						System.out.println("****** Bạn đã thắng cược");
						account += datCuoc;
						System.out.println("****** Tài khoản của bạn là: " + numf.format(account));
					}else {
						System.out.println("****** Bạn đã thua cược");
						account -= datCuoc;
						System.out.println("****** Tài khoản của bạn là: " + numf.format(account));
					}
				}else {
					System.out.println("****** Tổng là: " + sum + " => Tài");
					if(choiceTaiXiu == 1) {
						System.out.println("****** Bạn đã thắng cược");
						account += datCuoc;
						System.out.println("****** Tài khoản của bạn là: " + numf.format(account));
					}else {
						System.out.println("****** Bạn đã thua cược");
						account -= datCuoc;
						System.out.println("****** Tài khoản của bạn là: " + numf.format(account));
					}
				}
			}
		}while(choice == 1);
	}
}
