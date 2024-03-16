package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class JPanelDraw extends JPanel{

	public JPanelDraw() {
		// TODO Auto-generated constructor stub
		this.setBackground(Color.WHITE);
	}
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.drawLine(15, 15, 50, 150);
		
		g.setColor(Color.BLUE);
		g.drawOval(255, 255, 50, 50);
		
		g.setColor(Color.GREEN);
		g.drawRect(45, 150, 30, 90);
		
		g.setColor(Color.PINK);
		g.fillOval(400, 300, 50, 50);
		
		g.setColor(Color.GRAY);
		g.fillRect(100, 100, 150, 150);
		
		g.setColor(Color.CYAN);
		g.drawString("Heloo", 100, 400);
	}
	
}
