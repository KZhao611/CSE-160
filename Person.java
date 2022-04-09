package home;

public class Person {
	private String name, address, emailAddress, phoneNumber;
	private int age;
	public static void main(String[] args) {
		Person per = new Person("Kevin Zhao", "123 Kevin Road", "kevinzhao611@gmail.com", "6317425302", 19);
		Student stu = new Student("Kevin Zhao", "123 Kevin Road", "kevinzhao611@gmail.com", "6317425302", 19, Student.FRESHMAN);
		Employee emp = new Employee("Kevin Zhao", "123 Kevin Road", "kevinzhao611@gmail.com", "6317425302", 19, 20, new MyDate(5,5,2003));
		Faculty fac = new Faculty("Kevin Zhao", "123 Kevin Road", "kevinzhao611@gmail.com", "6317425302", 19, 20, new MyDate(5,5,2003), "Monday 3-4PM", 1);
		Staff sta = new Staff("Kevin Zhao", "123 Kevin Road", "kevinzhao611@gmail.com", "6317425302", 19, 20, new MyDate(5,5,2003), "Professor");
		System.out.println(per);
		System.out.println(stu);
		System.out.println(emp);
		System.out.println(fac);
		System.out.println(sta);
	}
	public int getAge() {return age;}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public Person(String name, String address, String emailAddress, String phoneNumber, int age) {
		this.name = name;
		this.address = address;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.age = age;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", emailAddress=" + emailAddress + ", phoneNumber="
				+ phoneNumber + ", age=" + age + "]";
	}
	
	
}
