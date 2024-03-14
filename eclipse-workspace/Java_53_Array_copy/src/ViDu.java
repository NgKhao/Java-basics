import java.util.Arrays;

public class ViDu {
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3};
		
//		copy arr cach 1 bang gán: làm thay đổi gtri gốc
		int[] arr1_a = arr1;
		arr1_a[0] = 100;
		
		System.out.println("Mang 1: " + Arrays.toString(arr1));
		System.out.println("Mang 1_a: " + Arrays.toString(arr1_a));

//		copy arr cach 2 - use clone: ko lam thay doi arr goc, them vung nho de copy
		int[] arr1_b = arr1.clone();
		arr1_b[0] = 50;
		System.out.println("Mang 1_b: " + Arrays.toString(arr1_b));

//		copy arr cach 3 - usu System.arraycopy: copy dc 1 đoạn
		int[] arr1_c = new int[arr1.length];
		System.arraycopy(arr1, 0, arr1_c, 0, arr1.length);
		arr1_c[0] = 90;
		System.out.println("Mang 1_c: " + Arrays.toString(arr1_c));
		
		String[] arr_doi_tuong = {"TITV", ".VN"};
		String[] arr_dt_a = arr_doi_tuong;
		arr_dt_a[1] = ".com";
		System.out.println("Mang dt: " + Arrays.toString(arr_doi_tuong));
		System.out.println("Mang dt a: " + Arrays.toString(arr_dt_a));
		
		String[] arr_dt_b = arr_doi_tuong.clone();
		arr_dt_b[1] = ".CC"; 
		System.out.println("Mang dt b: " + Arrays.toString(arr_dt_b));

		String[] arr_dt_c = new String[arr_doi_tuong.length];
		System.arraycopy(arr_doi_tuong, 0, arr_dt_c, 0, arr_doi_tuong.length);
		arr_dt_c[1] = ".html";
		System.out.println("Mang dt c: " + Arrays.toString(arr_dt_c));
		System.out.println("Mang dt: " + Arrays.toString(arr_doi_tuong));

		
	}
}
