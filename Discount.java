//Kevin Zhao, 114368032
package home;
import java.util.Scanner;
public class Discount {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Fixed price: $");
		double price = input.nextDouble();
		System.out.print("Quantity: ");
		int quant = input.nextInt();
		double discount;
		if(quant >= 100)
			discount = .5;
		else if(quant >= 50)
			discount = .4;
		else if (quant >= 20)
			discount = .3;
		else if(quant >= 10)
			discount = .2;
		else
			discount = 0;
		System.out.println("Discount: " + (discount*100) + "%");
		System.out.println("Discounted price: $" + (price*(1-discount)));
		System.out.println("Discounted amount per unit: $" + (discount * price));
		System.out.println("Total price: $" + (price*(1-discount)) + " * " + quant + " = " + "$" + (price*quant*(1-discount)));
	}
}
