//Kevin Zhao, 114368032
package home;
public class Kgs_pounds {
	public static void main(String[] args) {
		System.out.println("Kilograms\tPounds\tPounds\tKilograms");
		int kg,lbs;
		for(int i = 0; i < 100; i++) {
			kg = 1+2*i;
			lbs = 20 + 5*i;
			System.out.println(kg + "\t\t" + String.format("%.1f",(2.2*kg)) + "\t" + lbs + "\t" + String.format("%.2f",(lbs/2.2))); 
		}
	}
}
