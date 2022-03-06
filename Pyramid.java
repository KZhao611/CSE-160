//Kevin Zhao, 114368032
package home;
import java.util.Scanner;
import java.lang.Math;
public class Pyramid {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int lin = input.nextInt();
		int count = lin*2-2;
		int j = 0;
		for(int i = 0; i < lin; i++) {
			while(j < count) {
				System.out.print(" ");
				j++;
			}
			j =0;
			count -= 2;
			for(int k = 1; k <= Math.pow(2, i); k*= 2) {
				System.out.print(k);
				System.out.print(" ");
			}
			for(int k = (int)(Math.pow(2, i-1)); k >= 1; k /= 2) {
				System.out.print(k);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
