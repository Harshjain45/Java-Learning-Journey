//13. Create class ShoppingItem with name, price, and quantity. Write method totalCost().
import java.util.Scanner;
public class ShoppingItemClass {
    //Shopping Item Class.
    static class ShoppingItem{
        String name;
        double price;
        float quantity;
        //total cost method.
        public double totalcost(){
            return price * quantity;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Shopping Item List");
        ShoppingItem shoppingItem = new ShoppingItem();//Instantaiting new shopping item class.

        //Asking for attributes.
        System.out.print("Please enter the name of Item : ");
        shoppingItem.name = sc.next();
        System.out.print("Please enter the Price of Item : ");
        shoppingItem.price = sc.nextDouble();
        System.out.print("Please enter the Quantity of Item : ");
        shoppingItem.quantity = sc.nextFloat();

        //Calling method.
        double totalMoney = shoppingItem.totalcost();
        System.out.println("Total Cost  : " + totalMoney);
        sc.close();//Closing Scanner.
    }
}
