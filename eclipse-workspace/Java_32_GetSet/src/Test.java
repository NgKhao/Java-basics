
public class Test {
	public static void main(String[] args) {
		MyDate md = new MyDate(22, 11, 2004);
		MyDate md1 = new MyDate(01, 5, 1999);
		MyDate md2 = new MyDate(22, 7, 2004);
		md.printDate();
		md.setMonth(13);
		md.printDate();
		md.setMonth(7);
		md.printDate();
		
//		use toString method to print object in console, cái hay là có thể tùy chỉnh để in 1 vài thông số
		System.out.println("Date: " + md);
		
//		use equals() method to compare two objects
		System.out.println("so sanh md va md 1 " + md.equals(md1));
		System.out.println("so sanh md va md 2 " + md.equals(md2));
		
		System.out.println("Hash code md: " + md.hashCode());
		System.out.println("Hash code md1: " + md1.hashCode());
		System.out.println("Hash code md2: " + md2.hashCode());
	}
}
