package home;
import java.lang.StringBuilder;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = input.nextLine();
		StringBuilder wor = new StringBuilder(word);
		String reverse = wor.reverse().toString();
		if(word.equals(reverse))
			System.out.println("The word is a palindrome");
		else
			System.out.println("The word isn't a palindrome");
	}
}
