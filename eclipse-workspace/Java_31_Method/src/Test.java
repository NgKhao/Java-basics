
public class Test {
	public static void main(String[] args) {
		HoaDonCaPhe cf = new HoaDonCaPhe("Trung Nguyen", 500001, 3);
		HoaDonCaPhe cf1 = new HoaDonCaPhe("Trung Nguyen", 40000, 3);
		System.out.println("Tong hoa don coffee: " + cf.calculateBillSum());
		System.out.println("So sanh khoi luong coffee " + cf.checkMoreWeight(2.2));
		System.out.println("So sanh tong tien voi 500k " + cf.checkBillSumMore500k());
		System.out.println("So tien duoc giam " + cf.calculateSaleMoney(10));
		System.out.println("So tien duoc giam " + cf1.calculateSaleMoney(10));
		System.out.println("So tien sau khi giam " + cf.calculateBillSumAfterSaled(10));
	}
}
