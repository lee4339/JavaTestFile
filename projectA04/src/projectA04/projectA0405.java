package projectA04;

public class projectA0405 {

	public static void main(String[] args) {
		int[] grade = new int[3]; // 길이가 3인 ing형 배열의 선언 및 생성
		grade[0] = 85; // 인덱스를 이용한 배열의 초기화
		grade[1] = 65;
		grade[2] = 90;
		
		System.out.print(grade[2]); // [4]일시 ArrayIndexOutOfBounds 예외 발생

	}

}
