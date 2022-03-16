package projectA04;

import java.util.Scanner;

public class projectA0423 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("숫자"+(i+1)+":");
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
