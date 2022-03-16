package projectA01;

public class projectA0104 {

	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		int c = 3;
		a = a+3;
		b = b*3;
		c = c%2;
		System.out.println("a="+a+",b="+b+",c="+c);
		
		int d = 3;
		a = d++;
		System.out.println("a="+a+",d="+d);
		a = ++d;
		System.out.println("a="+a+",d="+d);
		a = d--;
		System.out.println("a="+a+",d="+d);
		a = --d;
		System.out.println("a="+a+",d="+d);
		
	}

}
