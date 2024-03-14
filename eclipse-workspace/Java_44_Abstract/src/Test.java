
public class Test {
	public static void main(String[] args) {
		ToaDo td1 = new ToaDo(4, 3);
		ToaDo td2 = new ToaDo(3, 2);
		ToaDo td3 = new ToaDo(1, 3);
		
//		Shape s = new Shape(td1); => lỗi biên dịch 
		
		Shape s1 = new Point(td1);
		
		Shape s2 = new Circle(td2, 2.5);
		
		Shape s3 = new Rectangle(td3, 2, 3);
		
		System.out.println(s1.area());
		
		System.out.println(s2.area());
		
		System.out.println(s3.area());
	}
}
