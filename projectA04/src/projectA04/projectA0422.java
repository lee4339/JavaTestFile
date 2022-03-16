package projectA04;

import java.util.Arrays;

public class projectA0422 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = a;
		
		int[] a1 = { 1, 2, 3, 4};
		int[] b1 = new int[a.length];
		for(int i=0; i<a1.length; i++) {
			b1[i] = a1[i];
		}
		int[] a2 = { 1, 2, 3, 4 };
		int[] b2 = a2.clone();
		
		int[] a3 = { 1, 2, 3, 4 };
		int[] b3 = Arrays.copyOf(a3, a.length);
		
		int[] a4 = { 1, 2, 3, 4 };
		int[] b4 = Arrays.copyOfRange(a4, 1, 3);
		
		int[] a5 = { 1, 2, 3, 4 };
		int[] b5 = new int[a5.length];
		System.arraycopy(a5, 0, b, 0, a5.length);
				

	}

}
