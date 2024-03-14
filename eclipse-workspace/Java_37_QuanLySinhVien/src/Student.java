
public class Student {
	private String id, fullName;
	Birthday birthDay;
	double dtb;
	Class classs;
	
	public Student(String id, String fullName, Birthday birthDay, double dtb, Class classs) {
		this.id = id;
		this.fullName = fullName;
		this.birthDay = birthDay;
		this.dtb = dtb;
		this.classs = classs;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Birthday getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Birthday birthDay) {
		this.birthDay = birthDay;
	}

	public double getDtb() {
		return dtb;
	}

	public void setDtb(double dtb) {
		this.dtb = dtb;
	}

	public Class getClasss() {
		return classs;
	}

	public void setClasss(Class classs) {
		this.classs = classs;
	}
	
	public String printKhoa() {
		return this.classs.getKhoa();
	}
	
	boolean checkDau() {
		return this.dtb >= 5;
	}
	
	public boolean checkBirthDay(Student ortherStudent) {
		return this.birthDay.equals(ortherStudent.birthDay);
	}
}
