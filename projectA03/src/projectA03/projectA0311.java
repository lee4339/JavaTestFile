package projectA03;

public class projectA0311 {

	public static void main(String[] args) {
		// 2단부터 시작하고 9단까지 실행하며 반복문이 한번 돌대마다 1씩 증가 시킵니다.
		for(int i=2; i<10; i++) {
			System.out.println(i + "단을 출력 합니다.");
			//위에서 i의 값이 2라면 2x1 ~ 2x9 까지 진행 합니다.
			// 이 반복문(j)이 종료되면 위의 반복문 변수가 i가 1 증가하여
			// 다시 3x1 ~ 3x9까지 진행하는 식으로 9단까지 반복 합니다.
			for(int j=1; j<10; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
				
			}
			System.out.println();
		}

	}

}
