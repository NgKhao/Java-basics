package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

import controller.MenuExampleController;
import controller.MenuExampleMouseListener;

public class MenuExampleView extends JFrame{
	private JLabel jLable;
	public JPopupMenu jPopupMenu;
	private JToolBar jToolBar;
	public JCheckBoxMenuItem jCheckBoxMenuItem_toolbar;

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
		this.setLayout(new BorderLayout());

		
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

		
//		Menu view
		JMenu jMenu_view = new JMenu("View");
		jCheckBoxMenuItem_toolbar = new JCheckBoxMenuItem("Toolbar");
		jCheckBoxMenuItem_toolbar.addActionListener(menuExampleController);
		jMenu_view.add(jCheckBoxMenuItem_toolbar);
		
//		Menu help
		JMenu jMenu_help = new JMenu("Help");
//		dùng ALT + H để mở jmenuItem
		jMenu_help.setMnemonic(KeyEvent.VK_H);
		JMenuItem jMenuItem_welcome = new JMenuItem("Welcome");
//		jMenu_help.setMnemonic(KeyEvent.VK_C);
		jMenuItem_welcome.addActionListener(menuExampleController);
		jMenu_help.add(jMenuItem_welcome);
		
//		Add JMenu
		jMenuBar.add(jMenu_file);
		jMenuBar.add(jMenu_view);
		jMenuBar.add(jMenu_help);
		
//		thêm thanh menu vào chương trình
		this.setJMenuBar(jMenuBar);
		
//		Tạo ToolBar thanh công cụ
		jToolBar = new JToolBar();
		JButton jButton_Undo = new JButton("Undo");
//		chú thích thao tác nhận vào
		jButton_Undo.setToolTipText("Nhấn vào đây để quay lại thao tác vừa rồi");
		jButton_Undo.addActionListener(menuExampleController);
		JButton jButton_Redo = new JButton("Redo");
		jButton_Redo.setToolTipText("Hoàn tác thao tác vừa rồi");
		jButton_Redo.addActionListener(menuExampleController);
		JButton jButton_Copy = new JButton("Copy");
		jButton_Copy.setToolTipText("Sao chép");
		jButton_Copy.addActionListener(menuExampleController);
		JButton jButton_Cut = new JButton("Cut");
		jButton_Cut.setToolTipText("Cắt ");
		jButton_Cut.addActionListener(menuExampleController);
		JButton jButton_Paste = new JButton("Paste");
		jButton_Paste.setToolTipText("Dán");
		jButton_Paste.addActionListener(menuExampleController);
		jToolBar.add(jButton_Undo);
		jToolBar.add(jButton_Redo);
		jToolBar.add(jButton_Copy);
		jToolBar.add(jButton_Cut);
		jToolBar.add(jButton_Paste);
		

//		Tạo menu chuột phải JPopupMenu
		jPopupMenu = new JPopupMenu();
		
		JMenu jMenuPopupFont = new JMenu("Font");
		JMenuItem jMenuItemType = new JMenuItem("Type");
		jMenuItemType.addActionListener(menuExampleController);
		JMenuItem jMenuItemSize = new JMenuItem("Size");
		jMenuItemSize.addActionListener(menuExampleController);
		jMenuPopupFont.add(jMenuItemType);
		jMenuPopupFont.add(jMenuItemSize);
		
		JMenuItem jMenuItemCut = new JMenuItem("Cut");
		jMenuItemCut.addActionListener(menuExampleController);
		JMenuItem jMenuItemCopy = new JMenuItem("Copy");
		jMenuItemCopy.addActionListener(menuExampleController);
		JMenuItem jMenuItemPaste = new JMenuItem("Paste");
		jMenuItemPaste.addActionListener(menuExampleController);

		jPopupMenu.add(jMenuPopupFont);
		jPopupMenu.addSeparator();
		jPopupMenu.add(jMenuItemCut);
		jPopupMenu.add(jMenuItemCopy);
		jPopupMenu.add(jMenuItemPaste);
		
		this.add(jPopupMenu);
		
		MenuExampleMouseListener menuExampleMouseListener = new MenuExampleMouseListener(this);
		this.addMouseListener(menuExampleMouseListener);

//		tao JLabel
		Font font = new Font("Arial", Font.BOLD, 50);
		jLable = new JLabel();
		
		this.add(jLable, BorderLayout.CENTER);
		
		this.setVisible(true);
	}
	
	public void setTextJlabel(String s) {
		this.jLable.setText(s);
	}
	
	public void enableToolbar() {
		this.add(jToolBar, BorderLayout.NORTH);
//		cập nhật lại giao diện
	    this.revalidate();
	    this.repaint();

	}
	
	public void disableToolbar() {
		this.remove(jToolBar);
//		cập nhật lại giao diện
	    this.revalidate();
	    this.repaint();
	}
}
