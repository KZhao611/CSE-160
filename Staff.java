package home;

public class Staff extends Employee{
	private String title;

	public Staff(String name, String address, String emailAddress, String phoneNumber, int age, double salary,
			MyDate dateHired, String title) {
		super(name, address, emailAddress, phoneNumber, age, salary, dateHired);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Staff [" + super.toString() + ", title=" + title + "]";
	}
}
