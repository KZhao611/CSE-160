//Kevin Zhao, 114368032
package home;
import java.util.Scanner;
public class LengthConversions {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("A – convert inches to centimeters\r\n"
				+ "B – convert centimeters to inches\r\n"
				+ "C – convert kilometers to miles\r\n"
				+ "D – convert miles to kilometers\r\n"
				+ "E – Exit\n"
				+ "Enter your option: ");
		char option = input.next().charAt(0);
		switch (option) {
			case 'A':{
				System.out.print("Enter inches: ");
				double in = input.nextDouble();
				System.out.println("Length in centimeters is " + inchesToCentimeters(in));
				break;
			}
			case 'B':{
				System.out.print("Enter centimeters: ");
				double in = input.nextDouble();
				System.out.println("Length in inches is " + centimetersToInches(in));
				break;
			}
			case 'C':{
				System.out.print("Enter kilometers: ");
				double in = input.nextDouble();
				System.out.println("Length in miles is " + kmToMiles(in));
				break;
			}
			case 'D':{
				System.out.print("Enter miles: ");
				double in = input.nextDouble();
				System.out.println("Length in kilometers is " + milesToKm(in));
				break;
			}
			case 'E':{
				System.out.println("Now Exiting");
			}
		}
		
		
		
	}
	public static double inchesToCentimeters(double inches){ 
		return inches * 2.54;
	}
	public static double centimetersToInches (double centimeters){  
		return centimeters / 2.54;
	} 
	public static double kmToMiles(double km){ 
		return km * .621;
	}
	public static double milesToKm(double miles){
		return miles / .621;
	}
}
