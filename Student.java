package home;

public class Student extends Person{
	private int classStatus;
	final static int FRESHMAN = 0, SOPHOMORE = 1, JUNIOR = 2, SENIOR = 3;
	
	public Student(String name, String address, String emailAddress, String phoneNumber, int age, int classStatus) {
		super(name, address, emailAddress, phoneNumber, age);
		this.classStatus = classStatus;
	}
	public int getClassStatus() {
		return classStatus;
	}
	public void setClassStatus(int classStatus) {
		this.classStatus = classStatus;
	}
	@Override
	public String toString() {
		return "Student ["+ super.toString() + ", classStatus=" + classStatus + "]";
	}
	
}
