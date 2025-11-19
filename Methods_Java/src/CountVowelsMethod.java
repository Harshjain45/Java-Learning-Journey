//7.Create a method countVowels(String str) that returns the number of vowels.
import java.util.Locale;
import java.util.Scanner;
public class CountVowelsMethod {

    static int countvowels(String text) {
         int count  = 0; //Storing the count.
         text = text.toLowerCase();//Converts the text to lower case.
        char[] vowels = {'a' , 'e' , 'i' , 'o' , 'u'}; //Array of vowels.

        for(int i = 0; i < vowels.length; i++){
            for (int j = 0; j < text.length(); j++){
                if(vowels[i] == text.charAt(j)){
                    count++;
                }
            }
        }
         return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //User input.
        System.out.print("Please enter your name : ");
        String name = sc.next();

        //Calling vowel count method.
        System.out.println("Total number of vowels in your name are : " + countvowels(name));
    }
}
