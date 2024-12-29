package RestrauntDeliveryApp;

import java.util.*;

public class Cart {

  private List<MenuItem> CartItems ;
  // private Restaurant restaurant ;

  public Cart(){
    CartItems = new ArrayList<MenuItem>();
    //this.restaurant = restaurant ;
  }

  public void addItemToCart(MenuItem x){
    CartItems.add(x);

  }

  public void  removeItemfromCart(MenuItem x){
    CartItems.remove(x) ;

  }

  public List<MenuItem> getCartItems(){

    return this.CartItems ;
    
  }

  
}
