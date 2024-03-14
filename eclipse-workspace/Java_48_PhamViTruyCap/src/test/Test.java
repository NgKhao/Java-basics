package test;

import code.Infor;

public class Test {
	private Infor infor;
	public void method() {
//		this.infor.a => ko truy cap dc
//		this.infor.b => ko dc vi khac packet
//		this.infor.c => ko vi khac goi, k phai con
		this.infor.d = 4;
	}
}
