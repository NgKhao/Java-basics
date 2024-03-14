package code;

public class Sub_Infor extends Infor{

	public void method() {
//		super.a => ko truy cap dc
		super.b = 2;// => dc vi chung goi
		super.c = 3;
		super.d = 4;
	}
}
