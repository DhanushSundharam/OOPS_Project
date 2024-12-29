package RestrauntDeliveryApp;

import java.util.*;

public class User extends Person {

  private Cart cart ;
  private Order orders ;
  public User(String name , String phoneNumber , String AdhaarNumber  ,int age,int id){
    this.name = name ;
    this.AdharNumber = AdhaarNumber ;
    this.phoneNumber = phoneNumber ;
    this.cart = new Cart();
    this.orders = new Order() ;
  }

  public void addIntoCart(MenuItem x){
    this.cart.addItemToCart(x);
  }

  public void removeItemFromCart(MenuItem x){
    this.cart.removeItemfromCart(x);
  }

  public List<MenuItem> getCartItems(){
    return this.cart.getCartItems() ;
  }
  
  
  
}
