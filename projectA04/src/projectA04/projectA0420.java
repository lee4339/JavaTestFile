package projectA04;

public class projectA0420 {

	public static void main(String[] args) {
		int sum = 0; // 총점을 저장하기 위한 변수
		double average = 0.0; // 평균을 저장하기 위한 변수
		
		int[] score = new int[] {100, 88, 100, 100, 90};
		System.out.println("배열의 길이 : "+score.length);
		System.out.println("배열의 크기(byte) : "+score.length*4);
		
		for(int i=0; i<score.length; i++) {
			sum += score[i]; // 배열의 각 요소들의 값을 누적.
			
		}
		System.out.println("sum의 값: "+sum);
		
		average = (double)sum/score.length; 
		
		System.out.println("총점: "+sum);
		System.out.println("평균: "+average);
		

	}

}
