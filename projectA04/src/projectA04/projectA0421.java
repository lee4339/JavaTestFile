package projectA04;

public class projectA0421 {

	public static void main(String[] args) {
		int[] arr = {30, 85, 35, 12, 70};
		int sum=0; double avg=0.0;
		int maxnum = 0, maxEmpNum = 0; // 점수제일큰... 최대값과 최대값의 인덱스
		int minnum = 100, minEmpNum = 0; // 최소값과 최소값의 인덱스.
		for(int i=0; i<arr.length; i++) {
			System.out.println("사원("+(i+1)+")"+arr[i]);
			sum += arr[i]; // 총점
			if(maxnum < arr[i]) { // 실적 0부터 비교하며 큰 것을 차례로 대입
				maxnum = arr[i]; maxEmpNum=i+1; // 인덱스는 0부터니 1더함
			}
		}
		avg = sum/arr.length; // 평균
		System.out.println("총점 = "+sum);
		System.out.println("평균 = "+avg);
		System.out.println("최대실적 = "+maxnum+" , 실적 = "+maxEmpNum); 
		System.out.println("최소실적 = "+minnum+" , 실적 = "+minEmpNum);

	}

}
