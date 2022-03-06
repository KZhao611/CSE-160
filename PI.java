//Kevin Zhao, 114368032
package home;
import java.lang.Math;
public class PI {
	public static void main(String[] args) {
		double sum = 0;
		int count = 10000;
		for(int i = 1; i <= 100000; i++) {
			sum += (double)(Math.pow(-1, i+1)) / (2*i - 1);
			if(i == count) {
				System.out.println("i = " + i + " PI approximate: " + 4*sum);
				count += 10000;
			}
		}
	}
}