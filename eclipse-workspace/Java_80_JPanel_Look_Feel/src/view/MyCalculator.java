package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MyCalculator extends JFrame{
	public MyCalculator() {
		this.setTitle("My Calculator");
		
		this.setSize(300, 300);
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		nơi nhập dữ liệu vào
		JTextField jTextField = new JTextField(50);
		
		JPanel jp_head = new JPanel();
		
		jp_head.setLayout(new BorderLayout());
		jp_head.add(jTextField, BorderLayout.CENTER);
		
		JButton jButton_0 = new JButton("0");
		JButton jButton_1 = new JButton("1");
		JButton jButton_2 = new JButton("2");
		JButton jButton_3 = new JButton("3");
		JButton jButton_4 = new JButton("4");
		JButton jButton_5 = new JButton("5");
		JButton jButton_6 = new JButton("6");
		JButton jButton_7 = new JButton("7");
		JButton jButton_8 = new JButton("8");
		JButton jButton_9 = new JButton("9");
		JButton jButton_cong = new JButton("+");
		JButton jButton_tru = new JButton("-");
		JButton jButton_nhan = new JButton("*");
		JButton jButton_chia = new JButton("/");
		JButton jButton_bang = new JButton("=");
		
		JPanel jp_buttons = new JPanel();
		jp_buttons.setLayout(new GridLayout(5, 3));
		jp_buttons.add(jButton_0);
		jp_buttons.add(jButton_1);
		jp_buttons.add(jButton_2);
		jp_buttons.add(jButton_3);
		jp_buttons.add(jButton_4);
		jp_buttons.add(jButton_5);
		jp_buttons.add(jButton_6);
		jp_buttons.add(jButton_7);
		jp_buttons.add(jButton_8);
		jp_buttons.add(jButton_9);
		jp_buttons.add(jButton_cong);
		jp_buttons.add(jButton_tru);
		jp_buttons.add(jButton_nhan);
		jp_buttons.add(jButton_chia);
		jp_buttons.add(jButton_bang);
//		this.setLayout(new FlowLayout());
//		this.setLayout(new GridLayout(5, 3));
		this.setLayout(new BorderLayout());

		this.add(jp_head, BorderLayout.NORTH);
		this.add(jp_buttons, BorderLayout.CENTER);
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");

			new MyCalculator();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
