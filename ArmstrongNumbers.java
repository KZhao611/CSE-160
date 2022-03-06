//Kevin Zhao, 114368032
package home;
import java.util.Scanner;
import java.lang.Math;
public class ArmstrongNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the lower limit: ");
		int low = input.nextInt();
		System.out.print("Enter the upper limit: ");
		int up = input.nextInt();
		System.out.print("The Armstrong numbers between " + low + " and " + up + " are: ");
		int n, count=0;
		String str;
		for(int i = low; i <= up; i++){
			str = Integer.toString(i);
			n = str.length();
			for(int j = 0; j < n; j++)
				count += Math.pow(Integer.parseInt(str.substring(j,j+1)), n);
			if(count == i)
				System.out.print(i + " ");
			count = 0;
		}
	}
}
