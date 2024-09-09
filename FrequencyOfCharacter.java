public class FrequencyOfCharacter {

	public static void main(String[] args) {
		String input="MY NAME IS SHIVAM BHARDWAJ";
		char Z='A';
		char Z1='H';

		int count=0;
		for(int i=0; i<input.length();i++) {
			//System.out.println(input.charAt(i));
			if(Z == input.charAt(i)) {
				//System.out.println("match found: "+i);
				count++;

			}
		}
		System.out.println();
		System.out.println(Z +" character total frequency : "+count);
	}
}
