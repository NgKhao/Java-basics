package view;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_GridLayout extends JFrame{
	public ViDu_GridLayout() {
		this.setTitle("ViDu_FlowLayout");
		this.setSize(600, 400);
//		căn giữa cửa sổ chương trình
		this.setLocationRelativeTo(null);
		
		
//		Set Layout
		GridLayout gridLayout = new GridLayout();
		GridLayout gridLayout_1 = new GridLayout(4, 4);
		GridLayout gridLayout_2 = new GridLayout(4, 4, 25, 25);
//		this.setLayout(gridLayout);
//		this.setLayout(gridLayout_1);
		this.setLayout(gridLayout_2);
		
		for(int i = 0; i < 16; i++) {
			JButton jButton = new JButton(i + ""); //jbutton chỉ nhận value text
			this.add(jButton);
		}
		
//		JButton jButton_1 = new JButton("1");
//		JButton jButton_2 = new JButton("2");
//		JButton jButton_3 = new JButton("3");
//		
////		add thanh phan
//		this.add(jButton_1);
//		this.add(jButton_2);
//		this.add(jButton_3);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ViDu_GridLayout();
	}
}

