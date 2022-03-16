package projectA02;

public class projectA0212 {

	public static void main(String[] args) throws InterruptedException {
		while(true) {
			int num = (int)(Math.random()*6) +1;
			System.out.println(num);
			Thread.sleep(1000);
			if(num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");

	}

}
