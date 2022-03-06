//Kevin Zhao, 114368032
package home;
import java.util.Scanner;
import java.lang.Math;
public class Geometry {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
		double[][] coords = new double[3][2];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 2; j++) {
				coords[i][j] = input.nextDouble();
			}
		}
		double area = getTriangleArea(coords);
		if(!Double.isNaN(area))
			System.out.println("The area of the triangle is: " + area);
		else
			System.out.println("The three points are on the same line.");
	}
	public static double getTriangleArea(double[][] points) {
		double side1, side2, side3;
		side1 = Math.pow(Math.pow(points[0][0] - points[1][0], 2) + Math.pow(points[0][1] - points[1][1], 2),.5);
		side2 = Math.pow(Math.pow(points[1][0] - points[2][0], 2) + Math.pow(points[1][1] - points[2][1], 2),.5);
		side3 = Math.pow(Math.pow(points[0][0] - points[2][0], 2) + Math.pow(points[0][1] - points[2][1], 2),.5);
		double asquare = Math.pow(side1, 2);
		double bsquare = Math.pow(side2, 2);
		double csquare = Math.pow(side3, 2);
		return .25 * Math.pow(4 * asquare * bsquare - Math.pow(asquare + bsquare - csquare, 2), .5);
	}
}
