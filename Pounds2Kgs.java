//Kevin Zhao, 114368032
package home;
import java.util.Scanner;
public class Pounds2Kgs {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a quantity in pounds: ");
		double lbs = input.nextDouble();
		System.out.println(lbs + " pounds is " + lbs*.454 + " kilograms.");
	}
	
}
