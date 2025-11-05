/* Case Conversion: Declare String text = "Hello" and print:
   >text.toUpperCase()
   >text.toLowerCase() */
public class CaseConversion {
    public static void main(String[] args) {
        //Declaring String "Hello".
        String Text = "Hello";
        System.out.println("Text : " + Text);
        //Conversion to UpperCase using .toUpperCase().
        System.out.println("Converting Text to UpperCase = " + Text.toUpperCase());

        //Conversion to LowerCase using .toLowerCase().
        System.out.println("Converting Text to LowerCase = " + Text.toLowerCase());
    }
}
