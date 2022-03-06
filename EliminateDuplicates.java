//Kevin Zhao, 114368032
package home;

public class EliminateDuplicates {
	public static void main(String[] args) {
		System.out.println(eliminateDuplicates("abracadabra"));
		System.out.println(eliminateDuplicates("Stony Brook University"));
		System.out.println(eliminateDuplicates("This is a test sentence."));
		System.out.println(eliminateDuplicates("aaaaaaaaaaaa"));
		System.out.println(eliminateDuplicates("abcdefg!!"));
	}
	public static String eliminateDuplicates(String str) {
		String ret = "";
		String[] st = new String[str.length()];
		for(int i = 0; i < str.length(); i++) {
			st[i] = str.substring(i,i+1);
			for(int k = 0; k < i; k++) {
				if(st[k].equals(st[i]) && st[k]!=(""))
					st[i] = "";
			}
		}
		for(String e: st)
			if(e!="")
				ret += e;
		return ret;
	}
}
