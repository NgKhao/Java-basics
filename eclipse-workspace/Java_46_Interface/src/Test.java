
public class Test {
	public static void main(String[] args) {
		System.out.println("Test câu a: ");
		MayTinhCasioFX500 mfx = new MayTinhCasioFX500();
		MayTinhVinacal500 mvn = new MayTinhVinacal500();
		
		System.out.println("5 + 3 = " + mfx.cong(5, 3));
		System.out.println("5 * 3 = " + mvn.nhan(5, 3));
		System.out.println("4 / 0 = " + mvn.nhan(4, 0));
		
		System.out.println("Test cau b: ");
		double[] arr = new double[] { 5, 1, 3, 4, 5, 8, 0};
		double[] arr2 = new double[] { 9, 2, 5, 1, 7, 8};
		SapXepChen sxchen = new SapXepChen();
		SapXepChon sxchon = new SapXepChon();
		
		sxchen.sapXepGiam(arr);
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		sxchon.sapXepTang(arr2);
		for(int i=0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println("Test cau c: ");
		PhanMemMayTinh pt = new PhanMemMayTinh();
		System.out.println("3 + 6 = " + pt.cong(3, 6));
		double[] arr3 = new double[] { 9, 2, 5, 1, 7, 8};
		pt.sapXepTang(arr3);
		for(int i=0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		
	}
}
