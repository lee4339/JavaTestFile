package projectA03;

public class projectA0310 {

	public static void main(String[] args) {
		for(int i=1; i<=3; i++) { // 괄호{} 안의 문장을 3번 반복
			System.out.println("Hello");
		}
		
		int array[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for(int i: array) {
			//array 배열에 있는 값을 순서대로 i에 입력 후 {}을 반복
			System.out.println("i값은 :"+i);
		}

	}

}
