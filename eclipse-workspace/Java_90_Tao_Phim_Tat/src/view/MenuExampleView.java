package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import controller.MenuExampleController;

public class MenuExampleView extends JFrame{
	private JLabel jLable;

	public MenuExampleView() {
		// TODO Auto-generated constructor stub
		this.init();
	}

	private void init() {
		// TODO Auto-generated method stub
		this.setTitle("Menu Example");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MenuExampleController menuExampleController = new MenuExampleController(this);
		
//		tạo 1 thanh Menu
		JMenuBar jMenuBar = new JMenuBar();
//		tạo từng Menu nhỏ thanh ngang
		JMenu jMenu_file = new JMenu("File");
//		tạo 1 menu thanh dọc trong từng menu thanh ngang
		JMenuItem jMenuItem_new = new JMenuItem("New", KeyEvent.VK_N);
//		thêm phím tắt
		jMenuItem_new.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
		jMenuItem_new.addActionListener(menuExampleController);

		JMenuItem jMenuItem_open = new JMenuItem("Open", KeyEvent.VK_O);
		jMenuItem_open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
		jMenuItem_open.addActionListener(menuExampleController);
		JMenuItem jMenuItem_exit = new JMenuItem("Exit", KeyEvent.VK_X);
		jMenuItem_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,	 InputEvent.ALT_DOWN_MASK));
		jMenuItem_exit.addActionListener(menuExampleController);
		jMenu_file.add(jMenuItem_new);
		jMenu_file.add(jMenuItem_open);
		jMenu_file.addSeparator();//chèn thêm thanh ngang
		jMenu_file.add(jMenuItem_exit);

		JMenu jMenu_help = new JMenu("Help");
//		dùng ALT + H để mở jmenuItem
		jMenu_help.setMnemonic(KeyEvent.VK_H);
		JMenuItem jMenuItem_welcome = new JMenuItem("Welcome");
//		jMenu_help.setMnemonic(KeyEvent.VK_C);
		jMenuItem_welcome.addActionListener(menuExampleController);
		jMenu_help.add(jMenuItem_welcome);
		
		jMenuBar.add(jMenu_file);
		jMenuBar.add(jMenu_help);
		
//		thêm thanh menu vào chương trình
		this.setJMenuBar(jMenuBar);
		
//		tao JLabel
		Font font = new Font("Arial", Font.BOLD, 50);
		jLable = new JLabel();
		
		this.setLayout(new BorderLayout());
		this.add(jLable, BorderLayout.CENTER);
		
		this.setVisible(true);
	}
	
	public void setTextJlabel(String s) {
		this.jLable.setText(s);
	}
	
}
