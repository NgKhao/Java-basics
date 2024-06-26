package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.LastButtonListener;
import model.LastButtonModel;

public class LastButtonView extends JFrame{
	private LastButtonModel lastButtonModel;
	private JLabel jLable;
	
	public LastButtonView() {
		this.lastButtonModel = new LastButtonModel();
		this.init();
		
	}
	
	private void init() {
		this.setTitle("Last Button");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel jpannel_Center = new JPanel();
		jpannel_Center.setLayout(new GridLayout(2,2));
		
//		tao Listener
		ActionListener lastButtonListener = new LastButtonListener(this);
		
//		tạo font chữ
		Font font = new Font("Arial", Font.BOLD, 40);
		
		JButton jButton_1 = new JButton("1");
		jButton_1.setFont(font);
		jButton_1.addActionListener(lastButtonListener);
		JButton jButton_2 = new JButton("2");
		jButton_2.setFont(font);
		jButton_2.addActionListener(lastButtonListener);
		JButton jButton_3 = new JButton("3");
		jButton_3.setFont(font);
		jButton_3.addActionListener(lastButtonListener);
		JButton jButton_4 = new JButton("4");
		jButton_4.setFont(font);
		jButton_4.addActionListener(lastButtonListener);
		
		jpannel_Center.add(jButton_1);
		jpannel_Center.add(jButton_2);
		jpannel_Center.add(jButton_3);
		jpannel_Center.add(jButton_4);

		JPanel jpannel_Footer = new JPanel();
		jLable = new JLabel("----------");
		jLable.setFont(font);
		jpannel_Footer.add(jLable);
		
		this.setLayout(new BorderLayout());
		
		this.add(jpannel_Center, BorderLayout.CENTER);
		this.add(jpannel_Footer, BorderLayout.SOUTH);
		
		this.setVisible(true);
		
	}
	
	public void changeTo_1() {
		this.lastButtonModel.setValue_1();
		jLable.setText("Last button: " + this.lastButtonModel.getValue());
	}
	
	public void changeTo_2() {
		this.lastButtonModel.setValue_2();
		jLable.setText("Last button: " + this.lastButtonModel.getValue());
	}
	
	public void changeTo_3() {
		this.lastButtonModel.setValue_3();
		jLable.setText("Last button: " + this.lastButtonModel.getValue());
	}
	
	public void changeTo_4() {
		this.lastButtonModel.setValue_4();
		jLable.setText("Last button: " + this.lastButtonModel.getValue());
	}
}
