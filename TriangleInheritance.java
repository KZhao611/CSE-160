package home;
import java.lang.Math;
public class TriangleInheritance extends GeometricObject {
	public static void main(String[] args) {
		TriangleInheritance test = new TriangleInheritance("Yellow", true, 1.0, 1.5, 1.0);
		System.out.println(test.getArea());
		System.out.println(test.getPerimeter());
		System.out.println(test);
	}
	private double side1, side2, side3;
	public TriangleInheritance() {
		side1 = 1;
		side2 = 1;
		side3 = 1;
	}
	public TriangleInheritance(double s1, double s2, double s3) {
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}
	public TriangleInheritance(String color, boolean filled, double s1, double s2, double s3) {
		super(color, filled);
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	public double getArea() {
		double a = side1 * side1;
		double b = side2 * side2;
		double c = side3*side3;
		return .25*Math.pow(4*a*b-Math.pow(a+b-c, 2), .5);
	}
	public double getPerimeter() {
		return side1+side2+side3;
	}
	public String toString() {
		return this.getColor() + " triangle " + (this.isFilled() ? "filled in " : "not filled in ") + "with sides of length " + side1 + " " + side2 + " " +side3
				+ " created on " + this.getDateCreated();
	}
}
