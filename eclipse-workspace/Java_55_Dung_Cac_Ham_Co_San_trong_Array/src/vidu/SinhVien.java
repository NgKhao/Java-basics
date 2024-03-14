package vidu;

public class SinhVien implements Comparable<SinhVien>{
	

	private int idSinhVien;
	private String hoTen;
	private String tenLop;
	private double dtb;
	
	public SinhVien(int idSinhVien, String hoTen, String tenLop, double dtb) {
		this.idSinhVien = idSinhVien;
		this.hoTen = hoTen;
		this.tenLop = tenLop;
		this.dtb = dtb;
	}

	public int getIdSinhVien() {
		return idSinhVien;
	}

	public void setIdSinhVien(int idSinhVien) {
		this.idSinhVien = idSinhVien;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public double getDtb() {
		return dtb;
	}

	public void setDtb(double dtb) {
		this.dtb = dtb;
	}

	public String getTen() {
		String s = this.hoTen.trim();
		if(s.indexOf(" ") >= 0) { // tim thay khoang trang
			int vt = s.lastIndexOf(" "); // lay khoang trang cuoi cung
			return s.substring(vt + 1);
		}else {
			return s;
		}
	}
	@Override
	public int compareTo(SinhVien o) {
//		< 0
//		= 0
//		> 0
//		so sanh ten
		String tenThis = this.getTen();
		String ten0 = o.getTen();
		return tenThis.compareTo(ten0);
//		return this.idSinhVien - o.idSinhVien;
	}
	
	@Override
	public String toString() {
		return "SinhVien [idSinhVien=" + idSinhVien + ", hoTen=" + hoTen + ", tenLop=" + tenLop + ", dtb=" + dtb + "]";
	}
	
}
