//Kevin Zhao, 114368032
package home;

public class BubbleSort {

	public static void main(String[] args) {
		double[] pri = new double[] {6.0, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5};
		pri = bubbleSort(pri);
		for(double e: pri)
			System.out.print(e + " ");
	}
	public static double[] bubbleSort(double[] arr) {
		boolean changed = true;
		double temp;
		do {
		   changed = false;
		   for (int j = 0; j < arr.length - 1; j++)
		      if (arr[j] > arr[j + 1]) {
		         temp = arr[j];
		         arr[j] = arr[j+1];
		         arr[j+1] = temp;
		         changed = true;
		      }
		} while (changed);
		return arr;
	}
}
