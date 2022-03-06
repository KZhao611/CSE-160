//Kevin Zhao, 114368032
package home;
import java.util.Scanner;
public class Counting {
	public static void main(String[] args) {
		int num, count =0, total = 0, pos = 0;
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.print("Enter a number (0 means exit): ");
			num = input.nextInt();
			if(num == 0)
				break;
			if(num > 0)
				pos++;
			count++;
			total += num;
			
		}
		System.out.println(pos + " positive numbers, " + (count-pos) + " negative numbers, accounting for a total of " + count + " numbers, a total sum of " + total + " and an average of " + ((double)(total)/count));
	}
}
