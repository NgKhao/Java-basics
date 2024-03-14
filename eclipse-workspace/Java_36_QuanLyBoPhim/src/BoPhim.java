
public class BoPhim {
	private String movieName;
	private int nameSX;
	private HangSanXuat hangSX;
	private double ticketCost;
	private NgayChieu ngayChieu;
	public BoPhim(String movieName, int nameSX, HangSanXuat hangSX, double ticketCost, NgayChieu ngayChieu) {
		this.movieName = movieName;
		this.nameSX = nameSX;
		this.hangSX = hangSX;
		this.ticketCost = ticketCost;
		this.ngayChieu = ngayChieu;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getNameSX() {
		return nameSX;
	}
	public void setNameSX(int nameSX) {
		this.nameSX = nameSX;
	}
	public HangSanXuat getHangSX() {
		return hangSX;
	}
	public void setHangSX(HangSanXuat hangSX) {
		this.hangSX = hangSX;
	}
	public double getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(double ticketCost) {
		this.ticketCost = ticketCost;
	}
	public NgayChieu getNgayChieu() {
		return ngayChieu;
	}
	public void setNgayChieu(NgayChieu ngayChieu) {
		this.ngayChieu = ngayChieu;
	}
	
	public boolean checkGiaVeReHon(BoPhim other) {
		return this.ticketCost < this.ticketCost;
	}
	
	public String getHangSanXuatName() {
		return this.hangSX.getTenHang();
	}
	
	public double ticketCostAfterSale(double x) {
		return this.ticketCost * ( 1 - x / 100);
	}
}
