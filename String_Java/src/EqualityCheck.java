/* Check Equality: Compare two strings: "Java" and "java" using
  .equals() and .equalsIgnoreCase().Print both results.*/
public class EqualityCheck {
    public static void main(String[] args) {
        //First String.
        String text1 = "Java";
        System.out.println("First String : " + text1);

        //Second String.
        String text2 = "java";
        System.out.println("Second String : " + text2);

        //Checking Equality: using .equals().
        System.out.println("Checking Equality: using.equals() = " + text1.equals(text2));

        //Checking Equality: using .equalsIngoreCase().
        System.out.println("Checking Equality: using.equalsingorelowercase() = " + text1.equalsIgnoreCase(text2));
    }
}
