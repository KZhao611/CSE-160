//Kevin Zhao, 114368032
package home;
import java.util.Scanner;
public class Interests {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the loan amount: ");
		double amount = input.nextDouble();
		System.out.print("Enter the number of years the loan is for: ");
		int years = input.nextInt();
		System.out.println("Interest Rate\tMonthly Payment\tTotal Payment");
		double month, total;
		for(double i = 5; i <= 8;i += .125) {
			month =  amount * (i/1200) / (1 - (Math.pow(1 / (1 + (i/1200)), years * 12)));
			total = month * years * 12; 
			System.out.println(i + "% \t\t$" + String.format("%.2f",month) + "\t\t$" + String.format("%.2f",total));
		}
	}
}
