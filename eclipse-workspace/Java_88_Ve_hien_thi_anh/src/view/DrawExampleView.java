package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.border.Border;

public class DrawExampleView extends JFrame{

	public DrawExampleView() {
		this.setTitle("Draw Example");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanelDraw jPanelDraw = new JPanelDraw();
		this.setLayout(new BorderLayout());
		this.add(jPanelDraw, BorderLayout.CENTER);
				
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new DrawExampleView();
	}
	
}
