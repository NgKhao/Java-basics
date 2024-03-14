
public class HangSanXuat {
	private String hangName;
	private National national;
	public HangSanXuat(String hangName, National national) {
		this.hangName = hangName;
		this.national = national;
	}
	public String getHangName() {
		return hangName;
	}
	public void setHangName(String hangName) {
		this.hangName = hangName;
	}
	public National getNational() {
		return national;
	}
	public void setNational(National national) {
		this.national = national;
	}
	public String nationalName() {
		// TODO Auto-generated method stub
		return this.national.getName();
	}
	
	
	
}
