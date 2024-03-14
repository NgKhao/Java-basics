
public class ViDu {
	public static void main(String[] args) {
		String s1 = "titv.vn";
		String s2 = "TITV.vn";
		String s3 = "titv.vn";
		
//		equals() => so sanh 2 chuoi giong, CO phan biet in hoa
		System.out.println("s1 equals s2: " + s1.equals(s2));
		System.out.println("s1 equals s3: " + s1.equals(s3));
		
//		euqalsIgnoreCase=> so sanh 2 chuoi giong, KHONG phan biet in hoa
		System.out.println("s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s2));
		System.out.println("s1 equalsIgnoreCase s3: " + s1.equalsIgnoreCase(s3));
		
//		compareTo so sanh tuong tu comare trong c++
		String sv1 = "Nguyen Van A"; // khoang trang la 32
		String sv2 = "Nguyen Van C";
		String sv3 = "Nguyen Van"; // tru cho khong co gi deu ra 2
		String sv4 = "Nguyen Van A";
		
		System.out.println("sv1 compareTo sv2: " + sv1.compareTo(sv2));
		System.out.println("sv1 compareTo sv3: " + sv1.compareTo(sv3));
		System.out.println("sv1 compareTo sv4: " + sv1.compareTo(sv4));
		
//		compareToIgnoreCase tuong tu compare nhung ko phan biet inHoa
		
//		regionMatches => so sanh mot doan
//		ham nay co the co hoac ko bo qua in hoa
		String r1 = "TITV.vn";
		String r2 = "TV.v";
		boolean check = r1.regionMatches(2, r2, 0, 4);
		System.out.println(check);
		
		
//		startWith => ham kiem tra chuoi bat dau bang ....
		String nump = "037456789";
		System.out.println(nump.startsWith("037"));
		System.out.println(nump.startsWith("034"));
//		endWith => ham kiem tra chuoi ket thuc bang ..
		String tenFile = "anh.JPG";
		String tenFile2 = "hoc.PDF";
		if(tenFile2.endsWith(".JPG"))
			System.out.println("FIle1 la hinh anh");
		else if(tenFile2.endsWith(".PDF"))
			System.out.println("File1 la file PDF");
	}
}
