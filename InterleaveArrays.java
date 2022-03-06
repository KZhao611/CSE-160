//Kevin Zhao, 114368032
package home;
import home.ArrayUtils;
public class InterleaveArrays {
	public static void main(String[] args) {
		ArrayUtils.print(interleaveArrays(new int[]{1,3,5}, new int[]{2,4,6}));
		ArrayUtils.print(interleaveArrays(new int[]{10,20,30,40,50,60,70,80}, new int[]{2,4,6,8}));
		ArrayUtils.print(interleaveArrays(new int[]{1,3,5}, new int[]{2,4,6,8,10}));
	}
	public static int[] interleaveArrays(int[] array1, int[] array2) {
		int[] ret = new int[array1.length + array2.length];
		for(int i = 0; i < array1.length*2 && i < array2.length*2; i++) {
			if(i % 2 == 0)
				ret[i] = array1[i/2];
			else
				ret[i] = array2[(i-1)/2];
		}
		int count = 0;
		if(array1.length < array2.length) {
			for(int i = array1.length*2; i < ret.length; i++)
				ret[i] = array2[array1.length+count++];
		}
		else if(array2.length < array1.length) {
			for(int i = array2.length*2 ; i< ret.length; i++)
				ret[i] = array1[array2.length+count++];
		}
		return ret;
	}
}