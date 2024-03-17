package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MenuExampleView;

public class MenuExampleController implements ActionListener{

	private MenuExampleView menuExampleView;
	
	
	public MenuExampleController(MenuExampleView menuExampleView) {
		super();
		this.menuExampleView = menuExampleView;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String button = e.getActionCommand();
		
		if(button.equals("Exit"))
//	this.menuExampleView.setTextJlabel("ban da click jmenuItem Exit");
			System.exit(0);
		else
			this.menuExampleView.setTextJlabel("ban da click " + button);


	}

}
