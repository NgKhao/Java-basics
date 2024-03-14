package test;

import code.Infor;

public class Sub_Infor2 extends Infor{
	public void method() {
//		super.b => ko truy cap dc vi khac goi
		super.c = 3; //dc vi la con 
		super.d = 4;
	}
}
