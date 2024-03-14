
public class Test {
	public static void main(String[] args) {
		Birthday b1 = new Birthday(9, 5, 2004);
		Birthday b2 = new Birthday(26, 6, 2004);
		Birthday b3 = new Birthday(9, 5, 2004);
		
		Class c1 = new Class("CN1", "IT");
		Class c2 = new Class("DL2", "Logictic");
		Class c3 = new Class("TD3", "Dien");
		
		Student s1 = new Student("01", "Trung", b1, 7.4, c1);
		Student s2 = new Student("02", "Hoang", b2, 5.9, c2);
		Student s3 = new Student("03", "Diep", b3, 9.0, c3);
		
		System.out.println("khoa cua sv1: " + s1.printKhoa());
		
		System.out.println("Kt cung ngay sinh s1 va s2: " + s1.checkBirthDay(s2));
		System.out.println("Kt cung ngay sinh s1 va s2: " + s1.checkBirthDay(s3));
	}
}
