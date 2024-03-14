package view;

import javax.swing.JFrame;

public class ViDu {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setTitle("Vi Du JFrame");
		jf.setSize(600, 400);

		
//		while(true) {
//			System.out.println("CHuong trinh dang chay");
//		}
		
//		Gắn vị trí hiển thị
		jf.setLocation(300, 300);
		
//		thoát ra khỏi chương trình khi đóng cửa sổ JFrame
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// mở cửa sổ nếu true
		jf.setVisible(true);
	}	
}
