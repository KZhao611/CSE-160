//Kevin Zhao, 114368032
package home;
import java.util.Scanner;
public class Tokenizer {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the sentence: ");
		String sent = input.nextLine();
		for(int i = 0; i < sent.length(); i++) {
			if(sent.charAt(i) == ' ') {
				sent = sent.substring(0, i) + "\n" + sent.substring(i+1);
			}
		}
		System.out.println(sent);
	}
}
