
public class Book {
	private String bookName;
	private double cost;
	private int namXuatBan;
	private TacGia tacGia;
	public Book(String bookName, double cost, int namXuatBan, TacGia tacGia) {
		this.bookName = bookName;
		this.cost = cost;
		this.namXuatBan = namXuatBan;
		this.tacGia = tacGia;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getNamXuatBan() {
		return namXuatBan;
	}
	public void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}
	public TacGia getTacGia() {
		return tacGia;
	}
	public void setTacGia(TacGia tacGia) {
		this.tacGia = tacGia;
	}
	public void printBookName() {
		System.out.println(getBookName());
	}
	public boolean checkCungNamXuatBan( Book otherBook) {
		return getNamXuatBan() == otherBook.getNamXuatBan();
	}
	public double giaSauGiam(double x) {
		return getCost() * (1 - x / 100);
	}
}
