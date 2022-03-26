//Kevin Zhao, 114368032
package home;

import java.util.Arrays;

public class MyString1 {
	public static void main(String[] args) {
		MyString1 str = new MyString1(new char[] {'1','2','3','4','5','a','b','c','d','E'});
		System.out.println(str.charAt(2));
		System.out.println(str.length());
		System.out.println(str.substring( 0,  2));
		System.out.println(str.toLowerCase());
		System.out.println(str.equals(str));
		System.out.println(MyString1.valueOf(3));
		MyString1[] pr = str.split("4");
		for(MyString1 e : pr) {
			System.out.print(e + " ");
		}
	}
	String str;
	char[] cha;
	public MyString1(char[] chars) {
		str = "";
		cha = chars;
		for(char e: chars)
			str += e;
	}
	public char charAt(int index) {
		return cha[index];
	}
	public int length() {
		return cha.length;
	}
	public MyString1 substring(int begin, int end)
	{
		char[] ret = new char[end-begin];
		for(int i = begin; i < end; i++) {
			ret[i-begin] = cha[i];
		}
		return new MyString1(ret);
	}
	public MyString1 toLowerCase() {
		int temp;
		char[] ret = new char[cha.length];
		for(int i = 0; i < cha.length; i++) {
			temp = (int)(cha[i]);
			if(temp >= 65 && temp <= 90)
				ret[i] = (char)(temp+32);
			else
				ret[i] = cha[i];
		}
		return new MyString1(ret);
	}
	public boolean equals(MyString1 str){
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != this.cha[i])
				return false;
		}
		return true;
	}
	public static MyString1 valueOf(int i) {
		return new MyString1(new char[] {(char)(i + '0')});
	}
	public MyString1[] split(String s) {
		int count = 1;
		int[] splits = new int[str.length()];
		splits[0] = -1;
		for(int i = 0; i < str.length(); i++) {
			if(str.substring(i,i+1).equals(s)) {
				splits[count] = i;
				count++;
			}
		}
		if(count == 0)
			return new MyString1[] {this};
		splits = Arrays.copyOf(splits, count);
		String[] strings = new String[count];
		for(int i = 0;i < count-1; i++) {
			strings[i] = str.substring(splits[i]+1, splits[i+1]);
		}
		strings[count-1] = str.substring(splits[count-1]+1, str.length());
		char[] ret;
		MyString1[] retur = new MyString1[strings.length];
		for(int i = 0; i < strings.length; i++) {
			ret = new char[strings[i].length()];
			for(int j = 0; j < ret.length; j++) {
				ret[j] = strings[i].charAt(j);
			}
			retur[i] = new MyString1(ret);
		}
		return retur;
	}
	public String toString() {
		return str;
	}
}
