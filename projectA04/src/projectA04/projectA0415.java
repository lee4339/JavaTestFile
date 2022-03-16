package projectA04;

public class projectA0415 {

	public static void main(String[] args) {
		String[] sr = new String[7];
		sr[0] = new String("Health");
		sr[1] = new String("Healthregen.\n");
		sr[2] = new String("Resource");
		sr[3] = new String("Rescorce regen.");
		sr[4] = new String("Armor");
		sr[5] = new String("Magic resist");
		sr[6] = new String("Move Speed");
		
		int cnum = 0;
		for(int i=0; i<sr.length; i++) {
			cnum += sr[i].length();
		}
		System.out.println("총 문자의 수: "+cnum);

	}

}
