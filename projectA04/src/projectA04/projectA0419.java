package projectA04;

public class projectA0419 {

	public static void main(String[] args) {
		int [] score = {52, 44, 64, 75, 56, 36};
		int sum=0;
		int max, min;
		for(int i=0; i<score.length; i++) {
			System.out.print(score[i]+"\t");
			sum+=score[i];
		}
		System.out.println();
		System.out.println("sum="+sum);
		System.out.println("average="+sum/score.length);
		
		max=score[0];
		min=score[0];
		for(int i=1; i<score.length; i++) {
			max = max>score[i] ? max : score[i];
			min = min<score[i] ? min : score[i];
		}
		System.out.println("가장 큰 수 : "+max	);
		System.out.println("가장 작은 수 : "+min);
		

	}

}
