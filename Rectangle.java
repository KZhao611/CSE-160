//Kevin Zhao, 114368032
package home;

public class Rectangle {
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(4,40);
		Rectangle rect2 = new Rectangle(3.5, 35.9);
		rect1.setColor("red");
		System.out.println(rect1.getWidth());
		System.out.println(rect1.getHeight());
		System.out.println(rect1.getColor());
		System.out.println(rect1.getArea());
		System.out.println(rect1.getPerimeter());
		System.out.println(rect2.getWidth());
		System.out.println(rect2.getHeight());
		System.out.println(rect2.getColor());
		System.out.println(rect2.getArea());
		System.out.println(rect2.getPerimeter());
	}
	private double width;
	private double height;
	private static String color = "white";
	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}
	public Rectangle() {
		this(1,1);
	}
	public double getWidth() { return width;}
	public double getHeight() { return height;}
	public String getColor() { return color;}
	public void setWidth(double w) { width = w;}
	public void setHeight(double h) { height = h;}
	public void setColor(String c) { color = c;}
	public double getArea() {
		return width * height;
	}
	public double getPerimeter() {
		return 2* width + 2 * height;
	}
}
