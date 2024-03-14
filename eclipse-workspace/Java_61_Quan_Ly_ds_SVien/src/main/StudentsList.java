package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class StudentsList {
	private ArrayList<Student> ds;

	public StudentsList() {
		this.ds = new ArrayList<Student>();
	}
	public StudentsList(ArrayList<Student> ds) {
		this.ds = ds;
	}

	// them sinh vien
	public void addStudent(Student otherS) {
		this.ds.add(otherS);
	}
	
	// in sv
	public void printStudentList() {
		for (Student student : ds) {
			System.out.println(student);
		}
	}
	
	// check list co rong ko
	public boolean checkEmptyList() {
		return this.ds.isEmpty();
	}
	
	// so luong sinh vien
	public int numberOfStudents() {
		return this.ds.size();
	}
	
	// lam rong ds sinh vien
	public void createEmptyList() {
		this.ds.removeAll(ds);
	}
	
	// check sinh vien co ton tai ko, dua tren id
	public boolean checkExsitStudentID(Student s) {
		return this.ds.contains(s);
	}
	
	// delete 1 sv khoi danh sach
	public boolean removeStudent(Student s) {
		return this.ds.remove(s);
	}
	
	// find all sinh vien dựa trên Tên được nhập từ bàn phím
	public void findStudent(String name) {
		for (Student student : ds) {
			if(student.getFullName().indexOf(name) >= 0) {
				System.out.println(student);
			}
		}
	}
	
//	Xuất ra danh sách sinh viên có điểm từ cao đến thấp
	public void sortDescendingStudent() {
		Collections.sort(this.ds, new Comparator<Student>() {

			@Override
			public int compare(Student sv1, Student sv2) {
				// TODO Auto-generated method stub
//				sv1 < sv2 trả về 1, compare sẽ gợi í cho Collections.sort sv1 đứng sau sv2 
//				vì trả về số âm
				if(sv1.getGPA() < sv2.getGPA())
					return 1;
				else if(sv1.getGPA() > sv2.getGPA())
					return -1;
				else 
					return 0;
			}
		});
	}
}
