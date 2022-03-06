//Kevin Zhao, 114368032
package home;
import java.util.Scanner;
public class PerfectNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the upper limit: ");
		int upper = input.nextInt();
		int count = 0;
		System.out.print("The perfect numbers below " + upper + " are:");
		for(int i = 6; i <= upper; i++) {
			for(int j = 1; j < i; j++) {
				if(i % j == 0)
					count += j;
				
			}
			if(count == i)
				System.out.print(" " + count);
			count = 0;
		}
		System.out.print(".");
	}
}
