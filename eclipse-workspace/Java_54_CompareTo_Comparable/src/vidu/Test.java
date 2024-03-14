package vidu;

public class Test {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(100, "TITV Hung", "Lop 1", 9);
		SinhVien sv2 = new SinhVien(150, "Tran Nguyen Toa", "Lop 2", 8);
		SinhVien sv3 = new SinhVien(199, "TITV Bo", "Lop 2", 3);

		System.out.println(sv1.compareTo(sv2));
		System.out.println(sv1.compareTo(sv3));

	}
}
