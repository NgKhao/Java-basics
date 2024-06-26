package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.MiniCalculatorListener;
import model.MiniCalculatorModel;

public class MiniCalculatorView extends JFrame{
	private MiniCalculatorModel miniCalculatorModel;
	private JTextField jTextField_firstValue;
	private JTextField jTextField_secondValue;
	private JTextField jTextField_answer;

	public MiniCalculatorView() throws HeadlessException {
		this.miniCalculatorModel = new MiniCalculatorModel();
		this.init();
	}

	private void init() {
		this.setTitle("Mini Calculator");
		this.setSize(600, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		Font font = new Font("Arial", Font.BOLD, 40);
		
		JLabel jLable_firstValue = new JLabel("1st Value");
		jLable_firstValue.setFont(font);
		JLabel jLable_secondValue = new JLabel("2nd Value");
		jLable_secondValue.setFont(font);
		JLabel jLable_answer = new JLabel("Answer");
		jLable_answer.setFont(font);
		
		jTextField_firstValue = new JTextField(50);
		jTextField_firstValue.setFont(font);
		jTextField_secondValue = new JTextField(50);
		jTextField_secondValue.setFont(font);
		jTextField_answer = new JTextField(50);
		jTextField_answer.setFont(font);
		
		JPanel jPanelIO = new JPanel();
		jPanelIO.setLayout(new GridLayout(3, 2, 10, 10));
		jPanelIO.add(jLable_firstValue);
		jPanelIO.add(jTextField_firstValue);
		jPanelIO.add(jLable_secondValue);
		jPanelIO.add(jTextField_secondValue);
		jPanelIO.add(jLable_answer);
		jPanelIO.add(jTextField_answer);
		
		MiniCalculatorListener miniCalculatorListener = new MiniCalculatorListener(this);
		JButton jButton_plus = new JButton("+");
		jButton_plus.setFont(font);
		jButton_plus.addActionListener(miniCalculatorListener);
		JButton jButton_minus = new JButton("-");
		jButton_minus.setFont(font);
		jButton_minus.addActionListener(miniCalculatorListener);
		JButton jButton_multiply = new JButton("*");
		jButton_multiply.setFont(font);
		jButton_multiply.addActionListener(miniCalculatorListener);
		JButton jButton_divide = new JButton("/");
		jButton_divide.setFont(font);
		jButton_divide.addActionListener(miniCalculatorListener);
		JButton jButton_pow = new JButton("^");
		jButton_pow.setFont(font);
		jButton_pow.addActionListener(miniCalculatorListener);
		JButton jButton_mod = new JButton("%");
		jButton_mod.setFont(font);
		jButton_mod.addActionListener(miniCalculatorListener);
		
		JPanel jPanelButtons = new JPanel();
		jPanelButtons.setLayout(new GridLayout(2, 3, 10, 10));
		jPanelButtons.add(jButton_plus);
		jPanelButtons.add(jButton_minus);
		jPanelButtons.add(jButton_multiply);
		jPanelButtons.add(jButton_divide);
		jPanelButtons.add(jButton_pow);
		jPanelButtons.add(jButton_mod);
		
		
		this.setLayout(new BorderLayout(10, 10));
		this.add(jPanelIO, BorderLayout.CENTER);
		this.add(jPanelButtons, BorderLayout.SOUTH);
		this.setVisible(true);
	}

	public void plus() {
		// TODO Auto-generated method stub
		double firstValue = Double.valueOf(jTextField_firstValue.getText());
		double secondValue = Double.valueOf(jTextField_secondValue.getText());
		this.miniCalculatorModel.setFirstValue(firstValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.plus();
//		this.miniCalculatorModel.setAnswer(firstValue + secondValue); 
		this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
	}
	
	public void minus() {
		// TODO Auto-generated method stub
		double firstValue = Double.valueOf(jTextField_firstValue.getText());
		double secondValue = Double.valueOf(jTextField_secondValue.getText());
		this.miniCalculatorModel.setFirstValue(firstValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.minus();;
		this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
	}
	
	public void multiply() {
		// TODO Auto-generated method stub
		double firstValue = Double.valueOf(jTextField_firstValue.getText());
		double secondValue = Double.valueOf(jTextField_secondValue.getText());
		this.miniCalculatorModel.setFirstValue(firstValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.multiply();;
		this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
	}
	
	public void divide() {
		// TODO Auto-generated method stub
		double firstValue = Double.valueOf(jTextField_firstValue.getText());
		double secondValue = Double.valueOf(jTextField_secondValue.getText());
		this.miniCalculatorModel.setFirstValue(firstValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.divide();
		this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
	}
	
	public void pow() {
		// TODO Auto-generated method stub
		double firstValue = Double.valueOf(jTextField_firstValue.getText());
		double secondValue = Double.valueOf(jTextField_secondValue.getText());
		this.miniCalculatorModel.setFirstValue(firstValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.pow();
		this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
	}
	
	public void mod() {
		// TODO Auto-generated method stub
		double firstValue = Double.valueOf(jTextField_firstValue.getText());
		double secondValue = Double.valueOf(jTextField_secondValue.getText());
		this.miniCalculatorModel.setFirstValue(firstValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.mod();
		this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
	}
}
