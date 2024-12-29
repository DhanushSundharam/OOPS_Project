package Bank;

public class DepositeDepartment extends Department{

  User user ;
  int amount_deposited ;

  public DepositeDepartment(User user , int amount){
    super("depositDepartment",5 , 1000000);
    
    this.user = user ;
    this.amount_deposited = amount ;
    addMoney(); 
    
  }

  public void addMoney(){
    user.b1.AddMoney(this.amount_deposited);
  }
  

  
}
