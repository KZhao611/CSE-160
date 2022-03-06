//Kevin Zhao, 114368032
package home;
import java.util.Scanner;
public class ReversedString {	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string to be reversed: ");
		String str = input.nextLine();
		for(int i = str.length()-1; i>=0; i--)
			System.out.print(str.charAt(i));
	}
}
