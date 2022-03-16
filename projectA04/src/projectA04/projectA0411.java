package projectA04;

public class projectA0411 {

	public static void main(String[] args) {
		double[] num = new double[10];
		for(int i=0; i<num.length; i++) {
			num[i] = i+1;
		}
		
		System.out.print("짝수인 수 : ");
		for(int i=0; i<num.length; i++) {
			if(num[i] % 2 == 0){ //2로 나눠서 나머지가 0이라면 짝수
				System.out.print(num[i]+" ");
				
			}
		}

	}

}
