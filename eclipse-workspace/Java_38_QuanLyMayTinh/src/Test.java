
public class Test {
	public static void main(String[] args) {
		SanXuatDate d1 = new SanXuatDate(15, 12, 1998);
		SanXuatDate d2 = new SanXuatDate(1, 2, 2000);
		SanXuatDate d3 = new SanXuatDate(7, 12, 1977);
		
		National n1 = new National("USA", "My");
		National n2 = new National("CN", "China");
		National n3 = new National("JP", "Japan");
		
		HangSanXuat h1 = new HangSanXuat("ASUS", n2);
		HangSanXuat h2 = new HangSanXuat("Apple", n1);
		HangSanXuat h3 = new HangSanXuat("Dell", n3);
		
		Computer c1 = new Computer(h1, d2, 750,  24);
		Computer c2 = new Computer(h2, d1, 2500,  36);
		Computer c3 = new Computer(h3, d3, 1500,  24);
		
		System.out.println("so gia c1, c3: " + c1.checkLessCost(c3));
		System.out.println("so gia c2, c3: " + c2.checkLessCost(c3));
		
		System.out.println("quoc gia cua c1: " + c1.nationalName());
		System.out.println("quoc gia cua c3: " + c3.nationalName());
	}
}
