package RestrauntDeliveryApp;
import java.util.*;
public class Main {
  public static void main(String[] args) {
    MenuItem pizza = new MenuItem("Pizza", "Mexican Hot Spicy Pizza", 450);
    MenuItem burger = new MenuItem("burger", "Spicy Chicken Burger", 150);
    MenuItem coolDrink = new MenuItem("coke", "Taste Coke", 100);
    Menu menu = new Menu();
    menu.addItems(pizza);
    menu.addItems(burger);
    menu.addItems(coolDrink);

    Address address = new Address("123 Maple Street", "Apt 4B", "Springfield", "62704", "IIIinois");
    
    Restaurant dominos = new Restaurant(address, menu, "Dominos", 4);
    Admin admin = new Admin("Dhanush","28389201","128378390822",21,1);
    admin.addRestaurant(dominos);
    System.out.println(admin.NumberOfRestaurant());
    admin.removeRestaurant(dominos);
    System.out.println(admin.NumberOfRestaurant());

    User u1 = new User("elonmusk","28389201","128378390822",24,1);
    u1.addIntoCart(coolDrink);
    u1.addIntoCart(burger);

    List<MenuItem> m1 = u1.getCartItems();
    System.out.println(m1.get(0).name);
    System.out.println(m1.get(1).name);
   

    
   

    
  }
  
}
