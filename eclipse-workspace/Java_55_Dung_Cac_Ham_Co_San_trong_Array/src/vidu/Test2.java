package vidu;

import java.util.Arrays;

public class Test2 {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(100, "TITV Hung", "Lop 1", 9);
		SinhVien sv2 = new SinhVien(150, "Tran Nguyen Toa", "Lop 2", 8);
		SinhVien sv3 = new SinhVien(199, "TITV Bo", "Lop 2", 3);
		SinhVien sv0 = new SinhVien(199, "TITV Bi", "Lop 2", 3);

		
		SinhVien[] arr_sv = {sv1, sv2, sv3};
		
		System.out.println("Ban dau: " + Arrays.toString(arr_sv));
		// ham sort
		Arrays.sort(arr_sv);
		System.out.println("sau khi sort: " + Arrays.toString(arr_sv));
		
//		search
		System.out.println("search Toa: " + Arrays.binarySearch(arr_sv, sv0));
	}
}
