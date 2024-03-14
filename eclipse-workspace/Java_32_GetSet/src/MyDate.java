import java.util.Objects;

public class MyDate {
	private int day;
	private int month;
	private int year;

	public MyDate(int day, int month, int year) {
		this.day = (day >= 1 && day <= 31) ? day : 1;
		this.month = (month >= 1 && month <= 12) ? month : 1;
		this.year = (year >= 1) ? year : 1;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = (day >= 1 && day <= 31) ? day : this.day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = (month >= 1 && month <= 12) ? month : this.month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = (year >= 1) ? year : this.year;
	}
	public void printDate()
	{
		System.out.println("Date: " + this.day + " - " + this.month + " - " + this.year);
	}
	
//	use toString method to print object in console, cái hay là có thể tùy chỉnh để in 1 vài thông số
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.day + "/" + this.month + "/" + this.year;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + month;
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	
	
	
}
