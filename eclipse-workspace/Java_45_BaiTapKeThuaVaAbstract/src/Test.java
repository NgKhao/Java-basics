
public class Test {
	public static void main(String[] args) {
		HangSanXuat h1 = new HangSanXuat("Hang 1", "VietNam");
		HangSanXuat h2 = new HangSanXuat("Hang 2", "USA");
		HangSanXuat h3 = new HangSanXuat("Hang 3", "Japan");
		
		PhuongTienDiChuyen p1 = new XeDap(h1);
		PhuongTienDiChuyen p2 = new XeOTo(h3, "Dien");
		MayBay p3 = new MayBay(h2, "Xang");
		
		System.out.println("Lay Hang SX p1: " + p1.layTenHangSanXuat());
		
		p2.batDau();
		p2.dungLai();
		System.out.println("Van toc: ");
		System.out.println(p1.layVanToc());
		System.out.println(p2.layVanToc());
		System.out.println(p3.layVanToc());
		
		System.out.println("Cat Canh: ");
		p3.catCanh();
	}
}
