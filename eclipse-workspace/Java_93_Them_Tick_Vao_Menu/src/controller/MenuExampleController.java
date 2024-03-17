package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JCheckBoxMenuItem;

import view.MenuExampleView;

public class MenuExampleController implements ActionListener{

	private MenuExampleView menuExampleView;
	
	
	public MenuExampleController(MenuExampleView menuExampleView) {
		this.menuExampleView = menuExampleView;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String button = e.getActionCommand();
		
		if(button.equals("Exit"))
//	this.menuExampleView.setTextJlabel("ban da click jmenuItem Exit");
			System.exit(0);
		else if(button.equals("Toolbar")) {
//			AbstractButton checkBox = (AbstractButton) e.getSource();
//			boolean check = checkBox.getModel().isSelected();
			boolean check = this.menuExampleView.jCheckBoxMenuItem_toolbar.isSelected();
			if(check)
				this.menuExampleView.enableToolbar();
			else
				this.menuExampleView.disableToolbar();
		}
			
		else
			this.menuExampleView.setTextJlabel("ban da click " + button);


	}

}
