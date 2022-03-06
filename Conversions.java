//Kevin Zhao, 114368032
package home;
import java.util.Scanner;
public class Conversions {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num;
		System.out.println("A - convert pounds to kilos\r\n"
				+ "B - convert kilos to pounds\n"
				+ "C - convert kilometers to miles\n"
				+ "D - convert miles to kilometers\n"
				+ "E - convert Celsius to Fahrenheit\n"
				+ "F - convert Fahrenheit to Celsius\n"
				+ "G - Exit");
		char conv = input.nextLine().charAt(0);
		switch (conv) {
			case 'A':
				System.out.print("Enter a quantity in pounds: ");
				num = input.nextDouble();
				System.out.print(num + " pounds is " + poundsToKilos(num) + " kgs");
				break;
			case 'B':
				System.out.print("Enter a quantity in kilos: ");
				num = input.nextDouble();
				System.out.print(num + " kilos is " + kilosToPounds(num) + "lbs");
				break;
			case 'C':
				System.out.print("Enter a quantity in kilometers: ");
				num = input.nextDouble();
				System.out.print(num + " kilometers is " + kmToM(num) + " miles");
				break;
			case 'D':
				System.out.print("Enter a quantity in miles: ");
				num = input.nextDouble();
				System.out.print(num + " miles is " + mToKm(num) + " km");
				break;
			case 'E':
				System.out.print("Enter a quantity in celsius: ");
				num = input.nextDouble();
				System.out.print(num + " degrees celsius is " + celsiusTofahrenheit(num) + " degrees fahrenheit");
				break;
			case 'F':
				System.out.print("Enter a quantity in fahrenheit: ");
				num = input.nextDouble();
				System.out.print(num + " degrees fahrenheit " + fahrenheitToCelsius(num) + " degrees celsius");
				break;
			case 'G':
				break;
			default:
				System.out.println("Please run the program again and capitalize your choice.");
				break;
		}
	}
	public static double poundsToKilos(double num) {
		return num * .453592;
	}
	public static  double kilosToPounds(double num) {
		return num * 2.20462;
	}
	public static  double kmToM(double num) {
		return num * .621371;
	}
	public static  double mToKm(double num) {
		return num * 1.60934;
	}
	public static double celsiusTofahrenheit(double num) {
		return num * 9 / 5 + 32;

	}
	public static double fahrenheitToCelsius(double num) {
		return (num - 32) * 5 / 9;
	}
}
