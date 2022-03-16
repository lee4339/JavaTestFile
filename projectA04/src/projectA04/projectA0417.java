package projectA04;

import java.awt.desktop.SystemEventListener;
import java.util.Arrays;

public class projectA0417 {

	public static void main(String[] args) {
		System.out.println("[System.arraycopy 배열 복사] ");
		int read = 0;
		byte one[] =new byte[10]; // 10 바이트 길이 배열 생성
		one[0] = 75; // 0번지 데이터 삽입
		one[1] = 71; // 1번지 데이터 삽입
		one[2] = 72; // 2번지 데이터 삽입
		
		for(int i=0; i<one.length; i++) {
			if(one[i] != 0) {
				read ++;
			}
		}
		
		byte two[] = new byte[read];
		System.arraycopy(one, 0, two, 0, read);
		System.out.println("원본 : "+Arrays.toString(one));
		System.out.println("실데이터 : "+Arrays.toString(two));

	}

}
