
public class ViDu {
	public static void main(String[] args) {
		int a = 10;
		int b = 25;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
//		ep kieu ngam dinh, ep data type nho sang data type lon
		float c = a;
		float d = b;
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
//		ep kieu tuong minh, ep data type lon sang data type nho
		float e = 3.5f;
		float f = 11.33333f;
		System.out.println("e = " + e);
		System.out.println("f = " + f);
		
		int g = (int)e;
		int h = (int)f;
		System.out.println("g = " + g);
		System.out.println("h = " + h);
		
//		ep kieu giua bien nguyen thuy va doi tuong
		int x = new Integer(32);
		System.out.println("x = " + x);
	}
}
