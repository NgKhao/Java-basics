
public class Computer {
	private HangSanXuat hangSX;
	private SanXuatDate ngaySX;
	private double cost;
	private double baoHanhTime;
	public Computer(HangSanXuat hangSX, SanXuatDate ngaySX, double cost, double baoHanhTime) {
		this.hangSX = hangSX;
		this.ngaySX = ngaySX;
		this.cost = cost;
		this.baoHanhTime = baoHanhTime;
	}
	public HangSanXuat getHangSX() {
		return hangSX;
	}
	public void setHangSX(HangSanXuat hangSX) {
		this.hangSX = hangSX;
	}
	public SanXuatDate getNgaySX() {
		return ngaySX;
	}
	public void setNgaySX(SanXuatDate ngaySX) {
		this.ngaySX = ngaySX;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getBaoHanhTime() {
		return baoHanhTime;
	}
	public void setBaoHanhTime(double baoHanhTime) {
		this.baoHanhTime = baoHanhTime;
	}
	
	public boolean checkLessCost(Computer otherComputer) {
		return this.cost < otherComputer.cost;
	}
	
	public String nationalName() {
		return this.hangSX.nationalName();
	}
}
