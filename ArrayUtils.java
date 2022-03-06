//Kevin Zhao, 114368032
package home;
import java.lang.Math;
public class ArrayUtils {
	public static void main(String[] args) {
		int[] pr = randomArray(100,21);
		System.out.print("Array: ");
		print(pr);
		System.out.println("Average: " + (double)(arraySum(pr))/pr.length);
		System.out.println("First index of 12(-1 means it doesn't contain 12): " + contains(pr,12));
		System.out.println("Number of multiples of 7: " + countMultiplesOf(pr,7));
	}
	public static int[] randomArray(int size, int lim) {
		int[] ret = new int[size];
		for(int i = 0; i < ret.length; i++) {
			ret[i] = (int)(Math.random()*lim);
		}
		return ret;
	}
	public static void print(int[] var) {
		System.out.print("[");
		for(int i = 0; i < var.length-1; i++)
			System.out.print(var[i] + " ");
		System.out.println(var[var.length-1]+"]");
	}
	public static int arraySum(int[] var) {
		int ret = 0;
		for(int e: var)
			ret += e;
		return ret;
	}
	public static int contains(int[] arr, int var) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == var) {
				return i;
			}
		}
		return -1;
	}
	public static int countMultiplesOf(int[] arr, int var) {
		int count = 0;
		for(int e: arr) {
			if(e % var == 0)
				count++;
		}
		return count;
	}
}
