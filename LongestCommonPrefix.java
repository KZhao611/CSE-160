//Kevin Zhao, 114368032
package home;
import java.util.Scanner;
public class LongestCommonPrefix {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String one = input.nextLine();
		System.out.print("Enter the second string: ");
		String two = input.nextLine();
		for(int i = 0; i < one.length() && i < two.length();i++) {
			if(one.charAt(i)==two.charAt(i)) {
				if(i == one.length()-1)
					System.out.println("The common prefix is: " + one);
				continue;
			}
			if(i == 0) {
				System.out.println(one + " and " + two + " have no common prefix.");
				break;
			}
			System.out.println("The common prefix is: " + one.substring(0,i));
			break;
		}
	}
}
