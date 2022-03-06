//Kevin Zhao, 114368032
package home;
import java.util.Scanner;
public class TicTacToe {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int row, col;
		int[][] board = new int[3][3];
		for(int i = 0; i < 9; i++){
			
			if(i % 2 == 0) {
				System.out.print("Player 1: ");
				row = input.nextInt();
				col = input.nextInt();
				board[row][col] = 1;
			}
			else {
				System.out.print("Player 2: ");
				row = input.nextInt();
				col = input.nextInt();
				board[row][col] = 2;
			}
			print(board);
			for(int j = 0; j < 3; j++) {
				if(board[j][0] == board[j][1] && board[j][1] == board[j][2] && board[j][0] != 0) {
					win(i);
					System.exit(0);
				}
				if(board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != 0) {
					win(i);
					System.exit(0);
				}
			}
			if(board[0][0] == board[1][1] && board[2][2] == board[1][1] && board[0][0] != 0) {
				win(i);
				System.exit(0);
			}
			if(board[0][2] == board[1][1] && board[2][0] == board[1][1] && board[0][2] != 0) {
				win(i);
				System.exit(0);
			}
			if(i == 8)
				System.out.println("Tie");
		}
	}
	public static void print(int[][] arr) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(arr[i][j] == 1)
					System.out.print("X ");
				else if(arr[i][j] == 2)
					System.out.print("O ");
				else
					System.out.print("- ");
			}
			System.out.println();
		}
	}
	public static void win(int i) {
		if(i % 2 == 0)
			System.out.println("Player 1 Wins");
		else
			System.out.println("Player 2 Wins");
	}
}