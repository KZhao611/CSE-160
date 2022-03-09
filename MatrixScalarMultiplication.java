package home;

public class MatrixScalarMultiplication {
	public static void main(String[] args) {
		double[][] y = new double[][] {{1,2,3,4},{5,6,7},{8,9}};
		y = scalarMultiplication(2,y);
		for(int i = 0; i < y.length; i++) {
			for(int j = 0; j < y[i].length; j++) {
				System.out.print(y[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static double[][] scalarMultiplication(double x, double[][]y){
		for(int i = 0; i < y.length; i++) {
			for(int j = 0; j < y[i].length; j++) {
				y[i][j] *= x;
			}
		}
		return y;
	}
}