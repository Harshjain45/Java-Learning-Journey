/* Vowel Checker:Declare char ch. Use Switch-Case to check if it's a vowel
   (a, e, i, o, u).Print 'Vowel' or 'Consonant'. */
import java.util.Scanner;
public class VowelChecker {
    public static void main(String[] args) {
        //Importing Scanner.
        Scanner input = new Scanner(System.in);
        //Taking input alphabet from user.
        System.out.print("Please enter an Alphabet to check if its vowel or consonant : ");
        char alphabet = input.next().charAt(0);

        //Converting into lower case.
             alphabet = Character.toLowerCase(alphabet);

        //Checking for vowel.
        switch (alphabet)
        {
            case 'a':
                System.out.println("Its an Vowel");
                break;

            case 'e':
                System.out.println("Its an Vowel");
                break;

            case 'i':
                System.out.println("Its an Vowel");
                break;

            case 'o':
                System.out.println("Its an Vowel");
                break;

            case 'u':
                System.out.println("Its an Vowel");
                break;

            default:
                System.out.println("Its an consonant");
                break;
        }
    }
}
