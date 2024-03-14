package vidu;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		String s = "Xin chao cac ban, tui la Key!";
		
//		split: cat chuoi
		String[] a = s.split(" ");
		System.out.println(Arrays.toString(a));
		
		String[] b = s.split(",");
		System.out.println(Arrays.toString(b));

//		split nhiều dấu
		String s2 = "Xin chao, minh la Peter. Minh la lap trinh vien";
		String[] c = s2.split("\\.|\\,");
		System.out.println(Arrays.toString(c));

//		vi du lay ra name
		String s3 = "Nguyen Van B";
		String[] d = s3.split(" ");
		System.out.println(d[d.length - 1]);
	}
}
