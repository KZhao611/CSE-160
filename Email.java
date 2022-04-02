package home;
import java.util.Scanner;
public class Email {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter email: ");
		String email = input.nextLine();
		//email = "kevinzhao611@gmail.com";
		if(email.matches(".+[@]\\w+.com"))
			System.out.println("Valid email");
		else
			System.out.println("Invalid email");
	}
}
