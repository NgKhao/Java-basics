
public class Test {
	public static void main(String[] args) {
		MyMath m = new MyMath();
		System.out.println("min(5,6): " + m.timMin(5, 6));
		System.out.println("min(7.5,6.5): " + m.timMin(7.5, 6.5));
		System.out.println("Tinh tong 3.4 4.2: " + m.tinhTong(3.4, 4.2));
		
		double[] arr = new double[] { 1,2,3,4,5};
		System.out.println("tinh tong arr: " + m.tinhTong(arr));
	}
}
