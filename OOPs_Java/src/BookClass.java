//4.Create a class Book with attribute's title, author, and price. Write a method displayDetails().
public class BookClass {
    //Book class.
    static class Book{
        String title;
        String author;
        float price;
        //display Details method.
        public void displayDistance(){
            System.out.println("Title of Book : " + title + ".");
            System.out.println("Name of Author : " + author + ".");
            System.out.println("Price : " + price + "$");
        }
    }

    public static void main(String[] args) {
        Book book = new Book();//Instantiating of new Book class.
        //Setting Attributes.
        book.title = "The Monk Who Sold His Ferrari";
        book.author = "Robin Sharma";
        book.price = 199.99f;
        //Calling method.
        book.displayDistance();
    }
}