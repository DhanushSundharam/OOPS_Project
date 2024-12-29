package RestrauntDeliveryApp;

import java.util.*;

public class Menu {
  private List<MenuItem> items ;

  public Menu (){
    this.items = new ArrayList<MenuItem>() ;
  }

  public void addItems(MenuItem item){
    this.items.add(item);
  }
  
}
