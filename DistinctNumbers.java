//Kevin Zhao, 114368032
package home;
import java.util.Scanner;
public class DistinctNumbers {
	public static void main(String[] args) {
		System.out.print("Enter numbers with spaces in between: ");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		int[] nums = new int[10];
		for(int i = 0; i < 10; i++) {
			nums[i] = Integer.parseInt(str.substring(2*i, 2*i+1));
			for(int j = 0; j < i; j++) {
				if(nums[i] == nums[j])
					nums[i] = 0;
			}
		}
		System.out.print("Unique numbers: ");
		for(int e: nums) {
			if(e != 0)
				System.out.print(e + " ");
		}
	}
}
