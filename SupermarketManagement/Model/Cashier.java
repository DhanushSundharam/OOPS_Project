package SupermarketManagement.Model;

public class Cashier extends Employee {

  public Cashier (){
    this.options = new Option[]{};

  }

  public Cashier(int ID ,String firstName  , String lastname , String email, String phoneNumber , String address , double salary){
    this.ID = ID ;
    this.firstName = firstName ;
    this.lastName = lastname ;
    this.email = email ;
    this.address = address ;
    this.phoneNumber = phoneNumber ;
    this.salary = salary ;
    this.options = new Option[]{};

  }
  
}
