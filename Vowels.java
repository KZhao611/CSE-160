//Kevin Zhao,114368032
package home;

public class Vowels {
	public static void main(String[] args) {
		String str = "aepaoisdpukdlqj";
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.substring(i, i+1).matches("[aeiou]"))
				count++;
		}
		System.out.print(count);
	}
}
