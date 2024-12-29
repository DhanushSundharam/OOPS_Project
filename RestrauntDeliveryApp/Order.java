package RestrauntDeliveryApp;

import java.util.ArrayList;
import java.util.List;

public class Order {
  private List<MenuItem> orderItems ;
  private int totalPrice ;

  public Order (){
    orderItems = new ArrayList<>();
    
  }

  public int getTotalPrice(){

    for (int i = 0; i < orderItems.size(); i++) {
      this.totalPrice += orderItems.get(i).getPrice();

      
    }

    return totalPrice ;

  }
  
}
