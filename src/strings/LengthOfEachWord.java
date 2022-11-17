package strings;

public class LengthOfEachWord {
public static void main(String[] args) {
	String names[] = {"Prem", "Siva", "Mahesh", "Srinath"};
	
	// count the length of each word
	
	
//	for(int i=0;i<names.length;i++) {
//		
//		String word = names[i];
//		System.out.println("Word : "+word + " Length : "+word.length());
//		
//	}
	
	for(String word : names) {
		System.out.println("Word : "+word + " Length : "+word.length());
	}

}
}
