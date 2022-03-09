//Kevin Zhao, 114368032
package home;

public class ReverseInteger {
	public static void main(String[] args) {
		System.out.println(reverse(12345678));
		System.out.println(reverse(11111211));
		System.out.println(reverse(12341245));
	}
	public static int reverse(int number){ 
		String num = Integer.toString(number);
		String ret = "";
		for(int i = num.length()-1; i >= 0; i--) {
			ret += num.substring(i, i+1);
		}
		return Integer.valueOf(ret);
	}
}
