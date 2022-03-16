package projectA03;

public class projectA0314 {

	public static void main(String[] args) {
		int sum1=0; // 짝수합
		int sum2=0; // 홀수합
		
		for(int i=1; i<101; i++) {
			if(i%2==0) {
				sum1 = sum1+i;
			}
			else {
				sum2 =sum2+i;
			}
		}
		System.out.println("짝수합 = "+ sum1);
		System.out.println("홀수합 = "+ sum2);

	}

}
