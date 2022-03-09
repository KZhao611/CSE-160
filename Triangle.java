//Kevin Zhao, 114368032
package home;

public class Triangle {
	public static void main(String[] args) {
		triangle(4);
		triangle(13);// only looks good for n<10
	}
	public static void triangle(int n) {
		String print = "";
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < n-i; j++)
				System.out.print("  ");
			print = i + " " + print;
			System.out.println(print);
		}
	}
}
