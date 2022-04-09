package home;

public class MyDate {
	private int year, month, day;
	public MyDate(int y, int m, int d) {
		year = y;
		month = m;
		day = d;	
	}
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	public String toString() {
		return month + "/" + day + "/" + year;
	}
}
