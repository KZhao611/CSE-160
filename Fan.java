//Kevin Zhao, 114368032
package home;

public class Fan {
	public static void main(String[] args) {
		Fan f1 = new Fan();
		Fan f2 = new Fan();
		f1.setSpeed(FAST);
		f1.setRadius(10);
		f1.setColor("Yellow");
		f1.setOn(true);
		f2.setSpeed(MEDIUM);
		f2.setRadius(5);
		f2.setColor("Blue");
		f2.setOn(false);
		System.out.println(f1);
		System.out.println(f2);
	}
	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;
	private int speed;
	private boolean on;
	private double radius;
	private String color;
	public Fan() {
		speed = SLOW;
		on = false;
		radius = 5;
		color = "blue";
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		if(on)
			return color + " fan with radius " + radius + " spinning at speed " + speed;
		else
			return color + " fan with radius " + radius + " that is not spinning";
	}
}
