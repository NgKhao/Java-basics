package test;

import code_a.Vidu;

public class TestViDu {
	public static void main(String[] args) {
		Vidu vd = new Vidu(5, 6);
		System.out.println(vd.getB());

//		khong import dc 2 file
		code_b.ViDu vd2 = new code_b.ViDu(1, 2, 3);
		System.out.println(vd2.getC());
	}  
}
