package projectA03;

public class projectA0321 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(sum > 100)
				break;
			++i;
			sum += i;
		} // end of while
		
		System.out.println("i=" + i);
		System.out.println("sun="+ sum);

	}

}
