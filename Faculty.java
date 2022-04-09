package home;

public class Faculty extends Employee{
	private String officeHours;
	private int rank;
	
	public Faculty(String name, String address, String emailAddress, String phoneNumber, int age, double salary,
			MyDate dateHired, String officeHours, int rank) {
		super(name, address, emailAddress, phoneNumber, age, salary, dateHired);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	public int salaryRange() {
		int years = 2022 - this.getDateHired().getYear();
		if(rank * years < 10)
			return 1;
		else if(rank * years < 20)
			return 2;
		else
			return 3;
	}
	public String getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "Faculty [" + super.toString() + ", salaryRange()=" + salaryRange() + ", officeHours="
				+ officeHours + ", rank=" + rank + "]";
	}
	
}
