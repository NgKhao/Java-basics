package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CounterListener;
import model.CounterModel;

public class CounterView extends JFrame{
	private CounterModel counterModel;
	private JButton jButton_up;
	private JButton jButton_down;
	private JLabel jLabel_value;
	private JButton jButton_reset;
	public CounterView() {
		this.counterModel = new CounterModel();
		this.init();
		this.setVisible(true);
	}
	
	private void init() {
		this.setTitle("Counter");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ActionListener ac = new CounterListener(this);
		
		jButton_up = new JButton("UP");
		jButton_up.addActionListener(ac);
		
		jButton_down = new JButton("DOWN");
		jButton_down.addActionListener(ac);
		
		jButton_reset = new JButton("RESET");
		jButton_reset.addActionListener(ac);
		
//		JLable để hiện thị dữ liệu, chỉ nhận value text
		jLabel_value = new JLabel(this.counterModel.getValue() + "", JLabel.CENTER );
		
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new BorderLayout(15, 15));
		jPanel.add(jButton_up, BorderLayout.EAST);
		jPanel.add(jButton_down, BorderLayout.WEST);
		jPanel.add(jLabel_value, BorderLayout.CENTER);
		jPanel.add(jButton_reset, BorderLayout.SOUTH);
		
		this.setLayout(new BorderLayout());
		this.add(jPanel, BorderLayout.CENTER);
	}
	
	public void increment() {
		this.counterModel.increment();
		this.jLabel_value.setText(this.counterModel.getValue() + "");
		
		}
	
	public void decrement() {
		this.counterModel.decrement();
		this.jLabel_value.setText(this.counterModel.getValue() + "");
		}
	
	public void reset() {
		this.counterModel.reset();
		this.jLabel_value.setText("0");
	}
}
