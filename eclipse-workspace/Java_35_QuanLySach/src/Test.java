
public class Test {
	public static void main(String[] args) {
		BirthDay bd1 = new BirthDay(2, 6, 1999);
		BirthDay bd2 = new BirthDay(3, 5, 2000);
		BirthDay bd3 = new BirthDay(5, 7, 2002);
		
		TacGia tg1 = new TacGia("Hoang Trung", bd1);
		TacGia tg2 = new TacGia("Trieu Thong", bd2);
		TacGia tg3 = new TacGia("Truong Hoanh", bd3);
		
		Book b1 = new Book("C++", 5.8, 2020, tg1);
		Book b2 = new Book("Java", 7.9, 2022, tg2);
		Book b3 = new Book("Kolin", 6.8, 2020, tg3);
		
		b1.printBookName();
		b2.printBookName();
		b3.printBookName();
		
		System.out.println("So sanh NXB cua sach 1 va sach 3: " + b1.checkCungNamXuatBan(b3));
		System.out.println("So sanh NXB cua sach 2 va sach 3: " + b2.checkCungNamXuatBan(b3));
		
		System.out.println("gia ban sau khi giam sach 1: " + b1.giaSauGiam(10));
		System.out.println("gia ban sau khi giam sach 2: " + b2.giaSauGiam(10));

	}
}
