//Kevin Zhao, 114368032
package home;
import java.util.Scanner;
public class RothPondRegatta {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter sequence of steps as one String: ");
		String str = input.nextLine();
		int pos = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'F')
				pos++;
			if(str.charAt(i) == 'B' & pos != 0)
				pos--;
			if(str.charAt(i) == 'S')
				pos = 0;
			if(str.charAt(i) == 'T')
				break;
		}
		System.out.println("Position is: " + pos);
	}
}
