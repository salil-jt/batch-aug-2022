package strings;

public class DiffMethodsStringContinued {
public static void main(String[] args) {
	String s1 = "Welcome to a morning class ";
    String s2 = s1.substring(11);  // LINE A
    System.out.println(s2);
    String s3 = s1.substring(11, 17);  // LINE B
    System.out.println(s3);   

    
    
    
    String sentence = "Moon is bright";
    System.out.println(sentence); // LINE A
    String sentence2 = sentence.replace('M', 'N');
    System.out.println(sentence2); // LINE B
    sentence = sentence + " Moon";
    System.out.println(sentence); // LINE C
    String sentence3 = sentence.replace("Moon", "Sun");
    System.out.println(sentence3); // LINE D    

    
    
    String longString = "Morning         ";
    System.out.println(longString.length());
    longString = longString.trim();
    System.out.println(longString.length());
    System.out.println("no change : "+longString);
    System.out.println("all lower : "+ longString.toLowerCase());
    System.out.println("all upper : "+ longString.toUpperCase());
    
    
    System.out.println(sentence);
   System.out.println("Sentence : "+sentence.contains("the"));
   System.out.println("Sentence : "+sentence.contains("is"));

}
}
