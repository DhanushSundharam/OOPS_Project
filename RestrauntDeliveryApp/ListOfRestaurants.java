package RestrauntDeliveryApp;

import java.util.ArrayList;
import java.util.List;

public class ListOfRestaurants {

  private List<Restaurant> items;
  public ListOfRestaurants(){

    this.items = new ArrayList<>() ;
  

  }

  
  public List<Restaurant> getRestaurant(){
    return items ;
  }
  
}
