//Kevin Zhao, 114368032
package home;
import java.util.Scanner;
public class MultiplyMatrices {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter matrix 1: ");
		double[][] matrix1 = new double[3][3];
		double[][] matrix2 = new double[3][3];
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++) {
				matrix1[i][j] = input.nextDouble();
			}
		}
		System.out.println("Enter matrix 2: ");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++) {
				matrix2[i][j] = input.nextDouble();
			}
		}
		double[][] matrix3 = multiplyMatrices(matrix1,matrix2);
		/*
		double[][] matrix1 = new double[][]{{1,2,3},{4,5,6}};
		double[][] matrix2 = new double[][]{{10,11},{20,21},{30,31}};
		double[][] matrix = multiplyMatrices(matrix1, matrix2); returns {{140, 146} {320, 335}}
		*/
		for(double[] e:matrix3) {
			for(double i: e) {
				System.out.print(i + " ");
			}
			System.out.println(); 
		}
	}
	public static double[][] multiplyMatrices(double[][] a, double[][] b){
		double[][] c = new double[a.length][b[0].length];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b[0].length; j++) {
				for(int d = 0; d < a[0].length; d++) {
					c[i][j] += a[i][d] * b[d][j]; 
				}
			}
		}
		return c;
	}
}
