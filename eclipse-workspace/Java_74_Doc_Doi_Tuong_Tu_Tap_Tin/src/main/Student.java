package main;

import java.io.Serializable;

public class Student implements Comparable<Student>, Serializable{
	private String ID, fullName;
	private int birthYear;
	private float GPA;
	
	public Student(String iD) {
		ID = iD;
	}
	public Student(String iD, String fullName, int birthYear, float gPA) {
		ID = iD;
		this.fullName = fullName;
		this.birthYear = birthYear;
		GPA = gPA;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public float getGPA() {
		return GPA;
	}
	public void setGPA(float gPA) {
		GPA = gPA;
	}
	
	@Override
	public String toString() {
		return "Student [ID=" + ID + ", fullName=" + fullName + ", birthYear=" + birthYear + ", GPA=" + GPA + "]";
	}
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.ID.compareTo(o.ID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		return true;
	}
	
	
}
