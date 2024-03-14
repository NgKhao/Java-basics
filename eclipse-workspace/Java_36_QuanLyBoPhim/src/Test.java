
public class Test {
	public static void main(String[] args) {
		NgayChieu n1 = new NgayChieu(15,5, 2022);
		NgayChieu n2 = new NgayChieu(20,1, 2023);
		NgayChieu n3 = new NgayChieu(25,4, 2025);
		
		HangSanXuat h1 = new HangSanXuat("Phuong Nam", "Viet Nam");
		HangSanXuat h2 = new HangSanXuat("DisNey", "Uc");
		HangSanXuat h3 = new HangSanXuat("Tau", "China");
		
		BoPhim b1 = new BoPhim("Sieu Nhan Gao", 2010, h1, 30000, n1);
		BoPhim b2 = new BoPhim("MicKey", 2004, h2, 75000, n2);
		BoPhim b3 = new BoPhim("Tay Du Ki", 1987, h3, 120000, n3);
		
		System.out.println("gia ve bo 1 so voi bo 2: " + b1.checkGiaVeReHon(b2));
		System.out.println("gia ve bo 3 so voi bo 2: " + b3.checkGiaVeReHon(b2));
		
		System.out.println("Ten Hang SX bo 1: " + b2.getHangSanXuatName());
		
		System.out.println("Gia sau khuyen mai 10%: " + b3.ticketCostAfterSale(10));
		System.out.println("Gia sau khuyen mai 10%: " + b3.ticketCostAfterSale(50));
	}
}
