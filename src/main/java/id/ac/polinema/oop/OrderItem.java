package id.ac.polinema.oop;

public class OrderItem {
    MenuItem menuItem;
    int quantity;

   public OrderItem(MenuItem menuItem, int quantity){
    this.menuItem = menuItem;
    this.quantity = quantity;
   }

   
   public int getquantity(){
    return quantity;
   }

   public MenuItem getmenuItem(){
    return menuItem;
   }

   public double getSubtotal(){
    return menuItem.getPrice()*quantity;
   }
   
}
