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
		
		if(button.equals("Open"))
			this.menuExampleView.setTextJlabel("ban da click jmenuItem Open");
		else if(button.equals("Exit"))
//			this.menuExampleView.setTextJlabel("ban da click jmenuItem Exit");
			System.exit(0);
		else if(button.equals("Welcome"))
			this.menuExampleView.setTextJlabel("ban da click jmenuItem Welcome");

	}

}
