/*11.Printer Polymorphism
Create an interface Printer with a method print().
Implement this interface in TextPrinter and ImagePrinter classes.Write a method:
void startPrinting(Printer p).*/

//interface Printer.
interface Printer{
    //print() method.
    void print();
}

//TextPrinter class implement interface.
class TextPrinter implements Printer{
    //Overriding method.
    @Override
    public void print(){
        System.out.println("Printing Text.");
    }
}

//ImagePrinter class implement interface.
class ImagePrinter implements Printer{
    //Overriding method.
    @Override
    public void print(){
        System.out.println("Printing Image.");
    }
}


public class PrinterPolymorphism {
    static void startPrinting(Printer p){
        p.print();
    }
    public static void main(String[] args) {

        Printer tp = new TextPrinter(); //Object Creation.
        Printer ip = new ImagePrinter(); //Object Creation.

        System.out.println("Printing Jobs:");

        //Calling Method.
        startPrinting(tp);
        startPrinting(ip);

    }
}
