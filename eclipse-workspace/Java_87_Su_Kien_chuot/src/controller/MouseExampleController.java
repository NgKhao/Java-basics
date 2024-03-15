package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import view.MouseExampleView;

public class MouseExampleController implements MouseListener, MouseMotionListener{

	private MouseExampleView mouseExempleView;
	
	public MouseExampleController(MouseExampleView mouseExempleView) {
		this.mouseExempleView = mouseExempleView;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		this.mouseExempleView.click();
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		this.mouseExempleView.enter();
		int x = e.getX();
		int y = e.getY();
		this.mouseExempleView.update(x, y);;
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		this.mouseExempleView.exit();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX();
		int y = e.getY();
		this.mouseExempleView.update(x, y);;
	}
	
}
