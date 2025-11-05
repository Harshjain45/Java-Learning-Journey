/* Contains & IndexOf: Declare String sentence = "Learning Java is fun" and:
   Check if it contains "Java" Find the index of "Java" */
public class IfContains {
    public static void main(String[] args) {
        //Declaring String sentence.
        String sentence = "Learning Java is fun";
        System.out.println("Sentence : " + sentence);

        //Checking if contains "Java".
        System.out.println("Contains Java = " + sentence.contains("Java"));

        //Finding index of "J".
        System.out.println("Index of Java = " + sentence.indexOf("J"));
    }
}
