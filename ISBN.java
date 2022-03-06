//Kevin Zhao, 114368032
package home;
import java.util.Scanner;
import java.lang.Math;
public class ISBN {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first 9 digits of ISBN number: ");
		int sum = 0, ISBN = input.nextInt();
		int[] numbers = new int[10];
		for(int i = 0; i < 9; i++) {
			numbers[i] = ISBN/(int)(Math.pow(10, 8 - i)) % 10;
			sum += numbers[i] * (i+1);
			System.out.println(numbers[i]);
		}
		numbers[9] = sum % 11;
		for(int e: numbers)
			System.out.print(e);
	}
}