package test;

import java.io.File;
import java.util.Scanner;

import main.Student;
import main.StudentsList;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentsList sl = new  StudentsList();
		int choice = 0;
		do {
			System.out.println("MENU ----------");
			System.out.println("Vui lòng chọn chức năng: ");
			System.out.println(
					"1. Thêm sinh liên vào danh sách.\n"
				+	"2. In danh sách sinh viên ra màn hình.\n"
				+	"3. Kiểm tra danh sách sinh viên có rỗng hay không?\n"
				+ 	"4. Lấy số lượng sinh viên trong danh sách.\n"
				+	"5. Làm rỗng danh sách sinh viên.\n"
				+	"6. Kiểm tra sinh viên có tồn tại trong danh sách không, dựa trên mã sinh viên.\n"
				+ 	"7. Xóa 1 một sinh viên khỏi danh sách dựa trên mã sinh viên.\n"
				+ 	"8. Tìm kiểm tất cả sinh viên dụa trên Tên nhập từ bàn phím.\n"
				+	"9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"
				+ 	"10.Luu danh sách sinh viên xuông tập tin.\n"
				+	"11.Doc danh sách sinh viên xuông tập tin.\n"
				+	"0. Thoát khỏi chương trình."
				+ 	"");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
			case 1: {
				System.out.println("Nhập mã sinh viên: "); String id = sc.nextLine();
				System.out.println("Nhập họ và tên: "); String fullName = sc.nextLine();
				System.out.println("Nhập năm sinh: "); int birthYear = sc.nextInt();
				System.out.println("Nhập điểm trung bình: "); float GPA = sc.nextFloat();
				Student stu = new Student(id, fullName, birthYear, GPA);
				sl.addStudent(stu);
				break;
			}
			case 2: {
				sl.printStudentList();
				break;
			}
			case 3: {
				System.out.println(sl.checkEmptyList() ? "Danh sách đang rỗng" : "Danh sách đang chứa sinh viên");
				break;
			}
			case 4: {
				System.out.println("Số lượng sinh viên hiện tại: " + sl.numberOfStudents());
				break;
			}
			case 5: {
				sl.createEmptyList();
				System.out.println("Danh sách sinh viên đã được làm rỗng.");
				break;
			}
			case 6: {
				System.out.println("Nhập mã sinh viên: "); String id = sc.nextLine();
				Student s = new Student(id);
				System.out.println("Kiểm tra sinh viên có trong danh sách: " + sl.checkExsitStudentID(s));
				break;
			}
			case 7: {
				System.out.println("Nhập mã sinh viên: "); String id = sc.nextLine();
				Student s = new Student(id);
				System.out.println("Xóa 1 một sinh viên khỏi danh sách: " + sl.removeStudent(s));
				break;
			}
			case 8: {
				System.out.println("Nhập họ và tên: "); String fullName = sc.nextLine();
				System.out.println("Kết quả tìm kiếm: ");
				sl.findStudent(fullName);
				break;
			}
			case 9: {
				sl.sortDescendingStudent();
				sl.printStudentList();
				break;
			}
			case 10:{
				System.out.println("Nhap ten file: ");
				String tenFile = sc.nextLine();
				File f = new File(tenFile);
				sl.ghiDuLieuXuongFile(f);
				break;
			}
			case 11:{
				System.out.println("Nhap ten file: ");
				String tenFile = sc.nextLine();
				File f = new File(tenFile);
				sl.docDuLieuXuongFile(f);
				break;
			}
//			default:
//				throw new IllegalArgumentException("Unexpected value: " + key);
			}
		}while(choice != 0);
	}
}
