package projectA04;

public class projectA0418 {

	public static void main(String[] args) {
		int[] num1 = {10,20,30}; // 초기화
		int[] num2 = new int[] {10, 20, 30};
		int[] num3 = new int[3];
		num3[0] = 11;
		num3[1] = 22;
		
		System.out.println(num1[0]);
		System.out.println(num1[1]);
		System.out.println(num1[2]);
		
		System.out.println(num3[0]);
		System.out.println(num3[1]);
		System.out.println(num3[2]);
		
		System.out.println("num1의 갯수 : "+num1.length); // num1의 크기를 표현하는
		System.out.println("num3의 갯수 : "+num3.length);
		int i;
		for(i=0; i<num3.length; i++) {
			System.out.println(num3[i]);
		}
		System.out.println();
		
		// 확장 for문(foreadch문)
		for(int x : num3) {
			System.out.println(x);
		}
		System.out.println("==================");
		
		double[] arr = {3.1, 1.234, 0.783, 0.002};
		double[] arr2 = new double[] {3.1, 1.234, 0.783, 0.002};
		double[] arr3 = new double[4];
		arr3[0] = 3.1;
		arr3[1] = 1.234;
		arr3[2] = 0.783;
		arr3[3] = 0.002;
		
		for(i=0; i<arr2.length; i++) {
			System.out.println(arr3[i]);
		}
		System.out.println();
		
		for(double x : arr3) {
			System.out.println(x);
		}
		System.out.println("==================");
		String s1 = "apple", s2 = "banana", s3 = "orange";
		String[] s = {"apple", "banana", "orange"};
		
		for(i=0; i<s.length; i++) {
			System.out.println(s[i]);
		}

	}

}
