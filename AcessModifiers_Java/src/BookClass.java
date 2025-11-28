//4.Create a class Book with title, author, and price. Write a constructor that sets all attributes. Add a display() method.
public class BookClass {
    //Book Class.
    static class Book{
        String title;
        String author;
        float price;
        //Constructor.
        Book(String title , String author , float price){
           this.title = title;
           this.author = author;
           this.price = price;
        }
        //display method.
        public void display(){
            System.out.println("Title of book : " + title);
            System.out.println("Author of book : " + author);
            System.out.println("Price of book : " + "$" + price);
        }
    }
    public static void main(String[] args) {
        Book book1 = new Book("Rich Dad Poor Dad","Robert T.Kiyosak",10.99f);
        book1.display();
    }
}
