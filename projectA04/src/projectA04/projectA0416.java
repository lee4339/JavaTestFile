package projectA04;

public class projectA0416 {

	public static void main(String[] args) {
		int[] hong;
		hong = new int[3];
		hong[0] = 70;
		hong[1] = 88;
		hong[2] = 99;
		
		int[] lim = new int[3];
		lim[0] = 80;
		lim[1] = 60;
		lim[2] = 50;
		
		int[] lee = {100, 45, 90};
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0; 
		
		for(int i=0; i<hong.length; i++) {
			sum1 = sum1 + hong[i];
		}
		for(int i=0; i<lim.length; i++	) {
			sum2 = sum2 + lim[i];
		}
		for(int i=0; i<lee.length; i++) {
			sum3 = sum3 + lee[i];
		}
		
		System.out.println("홍진호 ="+sum1/hong.length);
		System.out.println("임요한 ="+sum2/lim.length);
		System.out.println("이영호 ="+sum3/lee.length);
		

	}

}
