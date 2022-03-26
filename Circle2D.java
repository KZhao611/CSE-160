//Kevin Zhao, 114368032
package home;
import java.lang.Math;
public class Circle2D {
	public static void main(String[] args) {
		Circle2D circle1 = new Circle2D(1,1,2);
		Circle2D circle2 = new Circle2D(2,2,2);
		System.out.println(circle1.getArea());
		System.out.println(circle1.getPerimeter());
		System.out.println(circle1.contains(1,2));
		System.out.println(circle1.contains(circle2));
		System.out.println(circle1.overlap(circle2));
	}
	private double x;
	private double y;
	private double radius;
	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public Circle2D() {
		this(0,0,1);
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getRadius() {
		return radius;	
	}
	public double getArea() {
		return Math.PI * radius * radius;
	}
	public double getPerimeter() {
		return Math.PI * radius * 2;
	}
	public boolean contains(double x, double y) {
		return Math.pow(Math.pow(this.x-x,2) + Math.pow(this.y-y,2),.5) <= radius;
	}
	public boolean contains(Circle2D circle) {
		return Math.pow(Math.pow(circle.getX()-x,2) + Math.pow(circle.getY()-y,2),.5) + circle.getRadius() <= radius;
	}
	public boolean overlap(Circle2D circle) {
		return Math.pow(Math.pow(circle.getX()-x,2) + Math.pow(circle.getY()-y,2),.5) - circle.getRadius() <= radius;
	}
}
