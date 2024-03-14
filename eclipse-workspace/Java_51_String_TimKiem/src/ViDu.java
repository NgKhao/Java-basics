
public class ViDu {
	public static void main(String[] args) {
		String s1 = "Xin chào cô chú, xin chào các bạn, Xin chào!";
		String s2 = "Xin chào";
		String s3 = "Xin chào 123";
		char c1 = 'ô';
//		indexOf tim kiem chuoi trai sang phai tra ve vi tri dau tien
		System.out.println("Vi tri cua s2 trong s1: " + s1.indexOf(s2));
		System.out.println("Vi tri cua s3 trong s1: " + s1.indexOf(s3));
		
		
//		su dung vi tri bat dau
		System.out.println("Vi tri cua s2 trong s1: " + s1.indexOf(s2,2));
		
//		tim kiem char
		System.out.println("Vi tri cua c1 trong s1: " + s1.indexOf(c1));
		System.out.println("Vi tri cua c1 trong s1: " + s1.indexOf(c1, 20));
		
//		lastIndexOf : tim kiem nguoc tra ve chi so cuoi
		System.out.println("Vi tri cua s2 trong s1 tu phai sang trai: " + s1.lastIndexOf(s2));
		System.out.println("Vi tri cua s2 trong s1 tu phai sang trai: " + s1.lastIndexOf(s2, 10));
	
		// tenFile = "Bai tap.excel.lop 12.xls";
	}
}
