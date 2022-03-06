//Kevin Zhao, 114368032
package home;
import java.util.Scanner;
public class SumColumn {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the dimensions of an n x m matrix: ");
		int n = input.nextInt();
		int m = input.nextInt();
		System.out.println("Enter the matrix of " + n + " x " + m + ": ");
		double[][] arr = new double[n][m];
		for(int r = 0; r < n; r++) {
			for(int c = 0; c < m; c++) {
				arr[r][c] = input.nextDouble();
			}
		}
		System.out.println("The sums of the columns are: ");
		sumColumn(arr, 2);
		/*test contents of array
		 * for(double[] e: arr) {
			for(double i: e)
				System.out.print(i + " ");
			System.out.println();
		}*/
		
		
	}
	public static double sumColumn(double [][] arr, int c) {
		double[] sum = new double[arr[0].length];
		for(int j = 0; j < arr[0].length; j++) {
			for(int i = 0; i < arr.length; i++) {
					sum[j] += arr[i][j];
					//System.out.print(sum[j] + " ");
			}
			//System.out.println();
		}
		for(double e: sum)
			System.out.print(e + " ");
		return 2;
	}
}
