//Kevin Zhao,114368032
package home;

public class Password {
	public static void main(String[] args) {
		boolean num = false, low = false, up = false, spec = false;
		String str = "KevinZhao611!$", current;
		for(int i = 0; i < str.length(); i++) {
			current = str.substring(i,i+1);
			if(current.matches("\\d"))
				num = true;
			if(current.matches("[a-z]"))
				low = true;
			if(current.matches("[A-Z]"))
				up = true;
			if(current.matches("\\D"))
				if(current.matches("\\W"))
					spec = true;
		}
		if(num&&low&&up&&spec)
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");
	}
}
