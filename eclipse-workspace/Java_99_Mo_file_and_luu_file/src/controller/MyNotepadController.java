package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

import javax.swing.JFileChooser;

import view.MyNotepadView;

public class MyNotepadController implements ActionListener{
	private MyNotepadView myNotepadView;
	
	public MyNotepadController(MyNotepadView myNotepadView) {
		this.myNotepadView = myNotepadView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command = e.getActionCommand();
		JFileChooser fc = new JFileChooser();//cho phép user chọn 1 file từ hệ thống
		
		if(command.equals("OPEN")) {
//			hiển thị 1 hộp thoại để chọn file mở
			int returnVal = fc.showOpenDialog(this.myNotepadView);
			if(returnVal == JFileChooser.APPROVE_OPTION) {  // chọn một file và xác nhận chọn
				File file = fc.getSelectedFile();
				String fileName = file.getName();
				this.myNotepadView.model.setFileName(file.getAbsolutePath());
				this.myNotepadView.lblNewLabel.setText(this.myNotepadView.model.getFileName());
				if(fileName.endsWith(".txt")) {
					try {
						List<String> allText = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
						String result = "";
						boolean isFirstLine = true;
						for(String line : allText) {
							if(!isFirstLine)
								result += "\n";
							else
								isFirstLine = false;
							result += line;
//							bỏ \n ở cuối file 
//							nếu for thì có thể so sánh với size
//							còn for each thì dùng flag(cờ hiệu)
						}
						this.myNotepadView.model.setContent(result);
						this.myNotepadView.textArea.setText(this.myNotepadView.model.getContent());
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
			}
		}else if(command.equals("SAVE")){
//			nếu file đã tồn tại
			if(this.myNotepadView.model.getFileName().length() > 0) {
				save(this.myNotepadView.model.getFileName());
			}else  { // nếu file chưa tồn tại sẽ tạo file mới
				int returnVal = fc.showSaveDialog(this.myNotepadView);
				if(returnVal == JFileChooser.APPROVE_OPTION) {
					File file = fc.getSelectedFile();
					save(file.getAbsolutePath());
				}
			}
		}
		
	}
	public void save(String fileName) {
		try {
			PrintWriter pw = new PrintWriter(fileName, StandardCharsets.UTF_8);
			String data = this.myNotepadView.textArea.getText();
			pw.print(data);
			pw.flush();
			pw.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
