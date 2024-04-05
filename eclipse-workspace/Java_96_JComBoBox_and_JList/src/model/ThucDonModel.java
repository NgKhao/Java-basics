package model;

import java.util.StringTokenizer;

public class ThucDonModel {
	private String luaChon_MonChinh;
	private String luaChon_Phu;
	private double tongTien;
	public ThucDonModel() {
		super();
		this.luaChon_MonChinh = "";
		this.luaChon_Phu = "";
		this.tongTien = 0;
	}
	public String getLuaChon_MonChinh() {
		return luaChon_MonChinh;
	}
	public void setLuaChon_MonChinh(String luaChon_MonChinh) {
		this.luaChon_MonChinh = luaChon_MonChinh;
	}
	public String getLuaChon_Phu() {
		return luaChon_Phu;
	}
	public void setLuaChon_Phu(String luaChon_Phu) {
		this.luaChon_Phu = luaChon_Phu;
	}
	public double getTongTien() {
		return tongTien;
	}
	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}
	public void tinhTongTien() {
		// TODO Auto-generated method stub
		this.tongTien = 0;
		if(this.luaChon_MonChinh.equals("CƠM")) 
			tongTien += 25000;
		else if(this.luaChon_MonChinh.equals("PHỞ"))
			tongTien += 30000;
		else if(this.luaChon_MonChinh.equals("BÁNH MÌ"))
			tongTien += 15000;
		
		StringTokenizer stk = new StringTokenizer(this.luaChon_Phu, ",");
		while(stk.hasMoreElements()) {
			String monPhu = stk.nextToken();
			monPhu = monPhu.trim(); // loại bỏ các dấu các sau dấu phẩy
			if(monPhu.equals("TRÀ SỮA"))
				tongTien += 20000;
			else if(monPhu.equals("COCA"))
				tongTien += 10000;
			else if(monPhu.equals("BÁNH"))
				tongTien += 5000;
			else if(monPhu.equals("GỎI"))
				tongTien += 50000;
		}
				
	}

}
