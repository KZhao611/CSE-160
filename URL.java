package home;
import java.util.Scanner;
public class URL {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a URL: ");
		String url = input.nextLine();
		if(url.matches("https*://www..+(.com|.net|.edu|.gov|.web|.org|.io)"))
			System.out.println("Valid URL");
		else
			System.out.println("Invalid URL");
		
	}
}
