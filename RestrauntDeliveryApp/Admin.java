package RestrauntDeliveryApp;

import java.util.List;

public class Admin extends Person {

  private int id ;
  ListOfRestaurants list ;
  public Admin (String name , String phoneNumber , String AdhaarNumber  ,int age , int id){
    this.id = id ;
    this.name = name ;
    this.AdharNumber = AdhaarNumber ;
    this.phoneNumber = phoneNumber ;

    list = new ListOfRestaurants();

  }
  public void addRestaurant(Restaurant x){
    
    list.getRestaurant().add(x);
  }

  public void removeRestaurant(Restaurant x){
    
    list.getRestaurant().remove(x);
  }

  public int NumberOfRestaurant(){
    
    return list.getRestaurant().size();
    
  }
  
}
