//Kevin Zhao, 114368032
package home;
import java.util.Scanner;
public class Gasoline {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter then number of minutes: ");
		double minutes = input.nextDouble();
		System.out.print("Enter the constant speed of the car (m/h): ");
		double speed = input.nextDouble();
		System.out.print("Enter the fuel efficiency of the car (m/g): ");
		double mpg = input.nextDouble();
		System.out.print("Consume gas for the period (in gallons): " + (minutes/60 * speed * 1/mpg));
	}
}
