package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.tools.Tool;

public class MainView extends JFrame{
	
	private JMenuBar mb;
	private JMenu menu, subMenu;
	private JMenuItem i1, i2, i3, i4, i5;
	private JButton jButton;

	public MainView() {
		this.setTitle("TITV");
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
//		Set Icon => JFrame
		
//		gắn và window
		URL url_iconNotepad = MainView.class.getResource("icon_Notepad.png");
		Image img = Toolkit.getDefaultToolkit().createImage(url_iconNotepad);
		this.setIconImage(img);
		
//		JmenuBar
		mb = new JMenuBar();
		menu = new JMenu("Menu");
		subMenu = new JMenu("Sub Menu"); 
		
//		gắn icon vào menu
		i1 = new JMenuItem("New"); 
		i1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("icon_new.png"))));
		i2 = new JMenuItem("Save"); 
		i2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("icon_save.png"))));
		i3 = new JMenuItem("Save As"); 
		i3.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("icon_save_as.png"))));
		i4 = new JMenuItem("Exit"); 
		i4.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("icon_exit.png"))));
		i5 = new JMenuItem("Test"); 
		
		subMenu.add(i4);
		subMenu.add(i5);
		
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		menu.addSeparator();
		menu.add(subMenu);
		mb.add(menu);
		
//		JLabel
		JLabel jLabel = new JLabel();
		jLabel.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("image.png"))));
		
//		Button
		jButton = new JButton("Button");
//		gắn icon vào button
		jButton.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("icon_button.png"))));
		jButton.setFont(new Font("Arial", Font.BOLD, 50));
		
		
		this.setJMenuBar(mb);
		this.add(jLabel, BorderLayout.CENTER);
		this.add(jButton, BorderLayout.SOUTH);
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MainView();
	}
}
