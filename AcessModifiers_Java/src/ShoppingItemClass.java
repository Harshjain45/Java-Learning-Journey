/*11.Create a class ShoppingItem with name, price, quantity.
Use constructor to initialize all
totalCost() method.*/
public class ShoppingItemClass {
    //Shopping Item Class.
    static class ShoppingItem{
        String name;
        float price;
        float quantity;
        //Constructor.
        ShoppingItem(String name,float price, float quantity){
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }
        //totalCost method.
        public float totalCost(){
            return price*quantity;
        }
        //Displaying details.
        public void displayDetails(){
            System.out.println("Item Name : " + name);
            System.out.println("Item Price : " + "RS " + price + "/KG");
            System.out.println("Item Quantity : " + quantity + "KG");
        }
    }
    public static void main(String[] args) {
        ShoppingItem items = new ShoppingItem("Atta",45,2);
        items.displayDetails();//Calling displayDetails method.
        System.out.println("Total cost of item : " + items.totalCost() + "RS");//Calling totalCost method.
    }
}
