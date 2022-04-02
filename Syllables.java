//Kevin Zhao, 114368032
package home;

public class Syllables {
	public static void main(String[] args) {
		String str = "aepaoisdpukdlqj";
		int count = 0;
		String[] split = str.split("[aeiou][^aeiou]");
		System.out.println("Length: " + split.length);
		for(String e: split)
			System.out.println(e);
	}
}
