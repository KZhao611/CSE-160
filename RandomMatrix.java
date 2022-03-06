//Kevin Zhao, 114368032
package home;
import java.lang.Math;
public class RandomMatrix {
	public static void main(String[] args) {
		int[][] arr = new int[8][8];
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				arr[i][j] = (int) (Math.random()*2);
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		boolean che = false;
		boolean che2 = false;
		int check,check4 = arr[7][0],check3 = arr[0][0];
		int check2;
		boolean che3 = true, che4 = true;
		for(int r = 0; r < 8; r++) {
			check = arr[r][0];
			check2 = arr[0][r];
			che = true;
			che2 = true;
			for(int c = 0; c < 8; c++) {
				if(arr[r][c] == check && che) {
					if(c == 7)	
						System.out.println("Row " +  (r +1) + " is all " + check + "'s");
				}
				else
					che = false;
				if(arr[c][r] == check2 && che2) {
					if(c == 7)
						System.out.println("Column " +  (r +1)  + " is all " + check2 + "'s");
				}
				else
					che2 = false;
			}
			if(arr[r][r] == check3 && che3) {
				if(r == 7)
					System.out.println("The major diagonal is all " + check3 + "'s");
			}
			else
				che3 = false;
			if(arr[r][7-r] == check4 && che4) {
				if(r == 7)
					System.out.println("The minor diagonal is all " + check4 + "'s");
			}
			else
				che4 = false;
		}
		
		
		
	}
}
