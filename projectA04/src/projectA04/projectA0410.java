package projectA04;

public class projectA0410 {

	public static void main(String[] args) {
		//배열
		String[][] arr = {
				{"A", "B", "C"},
				{"D", "E"},
				{"F", "G", "H", "I"}
		};
		// arr 길이
		System.out.println("arr length : "+arr.length);
		// 각 arr[i] 길이
		System.out.println("arr[0] : "+arr[0].length);
		System.out.println("arr[1] : "+arr[1].length);
		System.out.println("arr[2] : "+arr[2].length);
		char[] charArr = new char[] {'C', 'A', 'F', 'E'};
		String str = new String();
		for(int i=0; i<charArr.length; i++) {
			str += charArr[i] + ""; // charArr[i] + ""는 char타입을 String타입으로
		}
		System.out.println(str);

	}

}
