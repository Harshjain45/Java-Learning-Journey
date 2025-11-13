public class ReversingAnArray {
    public static void main(String[] args) {

        //Declaring an array of 4 names.
        String[] names = {"Harsh", "Aditi" , "Anshu" , "Siddhant"};

        //Revering it using for loop.
        System.out.println("Reversing an array using for loop : ");
        for(int reverse = names.length-1; reverse >= 0 ; reverse-- ){
            System.out.println(names[reverse]);
        }
    }
}
