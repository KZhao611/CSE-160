package home;

public class Employee extends Person{
	private double salary;
	private MyDate dateHired;
	
	public Employee(String name, String address, String emailAddress, String phoneNumber, int age, double salary,
			MyDate dateHired) {
		super(name, address, emailAddress, phoneNumber, age);
		this.salary = salary;
		this.dateHired = dateHired;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public MyDate getDateHired() {
		return dateHired;
	}
	public void setDateHired(MyDate dateHired) {
		this.dateHired = dateHired;
	}
	@Override
	public String toString() {
		return "Employee [" + super.toString() + ", salary=" + salary + ", dateHired=" + dateHired + "]";
	}
	
}
