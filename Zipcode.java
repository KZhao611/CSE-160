package home;
import java.util.Scanner;
public class Zipcode {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a zip code: ");
		String zip = input.nextLine();
		if(zip.matches("\\d{5}"))
			System.out.println("Valid Zip");
		else
			System.out.println("Invalid Zip");
	}
}
