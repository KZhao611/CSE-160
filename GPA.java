//Kevin Zhao, 114368032
package home;
public class GPA {
	public static void main(String[] args) {
		System.out.println(gpaCalculator(new String[]{"A", "F", "C", "B"}));
		System.out.println(gpaCalculator(new String[]{"A-", "B-", "C-", "F"}));
		System.out.println(gpaCalculator(new String[]{"F", "C+", "D+", "A+"}));
	}
	public static double gpaCalculator(String[] str) {
		double count =0;
		for(String e: str) {
			if(e.equals("A"))
				count += 4;
			else if(e.equals("A-"))
				count += 3.67;
			else if(e.equals("B+"))
				count += 3.33;
			else if(e.equals("B"))
				count += 3;
			else if(e.equals("B-"))
				count += 2.67;
			else if(e.equals("C+"))
				count += 2.33;
			else if(e.equals("C"))
				count += 2;
			else if(e.equals("C-"))
				count += 1.67;
			else if(e.equals("D+"))
				count += 1.33;
			else if(e.equals("D"))
				count += 1;
			else if(e.equals("F"))
				count += 0;
			else
				return -1;
		}
		return count/str.length;
	}
}