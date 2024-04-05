package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import controller.ThucDonController;
import model.ThucDonModel;

public class ThucDonView extends JFrame{
	public ThucDonModel thucDonModel;
	public JRadioButton jRadioButton_Com;
	public JRadioButton jRadioButton_Pho;
	public JRadioButton jRadioButton_BM;
	public JCheckBox jCheckBox_TraSua;
	public JCheckBox jCheckBox_CoCa;
	public JCheckBox jCheckBox_Banh;
	public JCheckBox jCheckBox_Goi;
	public JLabel jLabel_ThongTin;
	public ButtonGroup buttonGroup_MonChinh;
	public ArrayList<JCheckBox> list_buttonGroup_MonPhu;
	
	public ThucDonView() {
		this.thucDonModel = new ThucDonModel();
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		this.setTitle("Thực Đơn");
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		Font font = new Font("Arial", Font.BOLD, 40);
		
		JLabel header = new JLabel("THỰC ĐƠN NHÀ HÀNG TITV");
		header.setFont(font);

		JPanel jPanel_TieuDe = new JPanel();
		jPanel_TieuDe.add(header);
		this.add(jPanel_TieuDe, BorderLayout.NORTH);
		
		JPanel jPanel_MonChinh = new JPanel();
		jPanel_MonChinh.setLayout(new GridLayout(1, 3));
//		tạo ra các lựa chọn hình tròn
		jRadioButton_Com = new JRadioButton("CƠM");
		jRadioButton_Com.setFont(font);
		jRadioButton_Pho = new JRadioButton("PHỞ");
		jRadioButton_Pho.setFont(font);
		jRadioButton_BM = new JRadioButton("BÁNH MÌ");
		jRadioButton_BM.setFont(font);
		
//		ButtonGroup(): group lại => chỉ 1 được 1 thứ, ko chọn đồng thời được nhiều thứ
		buttonGroup_MonChinh = new ButtonGroup();
		buttonGroup_MonChinh.add(jRadioButton_Com);
		buttonGroup_MonChinh.add(jRadioButton_Pho);
		buttonGroup_MonChinh.add(jRadioButton_BM);
		jPanel_MonChinh.add(jRadioButton_Com);
		jPanel_MonChinh.add(jRadioButton_Pho);
		jPanel_MonChinh.add(jRadioButton_BM);
		
		JPanel jPanel_MonPhu = new JPanel();
		jPanel_MonPhu.setLayout(new GridLayout(2, 3));
//		tạo ra các lựa chọn hình vuông
		jCheckBox_TraSua = new JCheckBox("TRÀ SỮA");
		jCheckBox_TraSua.setFont(font);
		jCheckBox_CoCa = new JCheckBox("COCA");
		jCheckBox_CoCa.setFont(font);
		jCheckBox_Banh = new JCheckBox("BÁNH");
		jCheckBox_Banh.setFont(font);
		jCheckBox_Goi = new JCheckBox("GỎI");
		jCheckBox_Goi.setFont(font);
		
		list_buttonGroup_MonPhu = new ArrayList<JCheckBox>();
		list_buttonGroup_MonPhu.add(jCheckBox_TraSua);
		list_buttonGroup_MonPhu.add(jCheckBox_CoCa);
		list_buttonGroup_MonPhu.add(jCheckBox_Banh);
		list_buttonGroup_MonPhu.add(jCheckBox_Goi);
		
		jPanel_MonPhu.add(jCheckBox_TraSua);
		jPanel_MonPhu.add(jCheckBox_CoCa);
		jPanel_MonPhu.add(jCheckBox_Banh);
		jPanel_MonPhu.add(jCheckBox_Goi);
		
		JPanel jPanel_LuaChon = new JPanel();
		jPanel_LuaChon.setLayout(new GridLayout(2, 1));
		jPanel_LuaChon.add(jPanel_MonChinh);
		jPanel_LuaChon.add(jPanel_MonPhu);
		this.add(jPanel_LuaChon, BorderLayout.CENTER);
		
		JPanel jPanel_ThanhToan = new JPanel();
		jPanel_ThanhToan.setLayout(new GridLayout(1, 2));
		jLabel_ThongTin = new JLabel("---");
		jLabel_ThongTin.setFont(new Font("Arial", Font.BOLD, 20));
		JButton jButton_ThanhToan = new JButton("Thanh Toán");
		jButton_ThanhToan.setFont(font);
		ActionListener thucDonController = new ThucDonController(this);
		jButton_ThanhToan.addActionListener(thucDonController);
		jPanel_ThanhToan.add(jLabel_ThongTin);
		jPanel_ThanhToan.add(jButton_ThanhToan);
		this.add(jPanel_ThanhToan, BorderLayout.SOUTH);
		
		this.setVisible(true);
		
		
	}

	public void hienThiKetQua() {
		// TODO Auto-generated method stub
		String kq =  "Món chính: " + this.thucDonModel.getLuaChon_MonChinh()
					+ "; Món phụ: " + this.thucDonModel.getLuaChon_Phu()
					+ "; Tổng tiền: " + this.thucDonModel.getTongTien();
		this.jLabel_ThongTin.setText(kq);
	}
}
