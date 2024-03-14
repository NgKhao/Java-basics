
public class TacGia {
	private String name;
	private BirthDay ngaySinh;
	public TacGia(String name, BirthDay ngaySinh) {
		this.name = name;
		this.ngaySinh = ngaySinh;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BirthDay getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(BirthDay ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	
	
}
