package Bank;

public class BankDetails {

  String name ;
  String nickname ;
  static int numberOfAccounts ;
  private int accountNumber ;
  String ifscCode ;
  final static String BANK_NAME = "SBI" ;
  private double balance ;
  

  

  public BankDetails(String name , String ifscCode){
    this.name = name ;
    this.ifscCode = ifscCode ;
    numberOfAccounts++ ;
    accountNumber = numberOfAccounts ;

  }

  public BankDetails(String name , String ifscCode , String nickname){
    this.name = name ;
    this.ifscCode = ifscCode ;
    this.nickname = nickname ; 
    numberOfAccounts++ ;
    accountNumber = numberOfAccounts ;

  }

  public  int getAccounNumber(){
    return this.accountNumber ;
  }

  public double totalBalance(){
    
    return this.balance ;
  }

  public  void AddMoney (int submitAmount){

    this.balance = this.balance + submitAmount ;

  }

  public void withDrawMoney(int withdrawAmount){
    if (this.balance < withdrawAmount){
      System.out.println("Insuffient Amount");
      return ;
    }

    this.balance = this.balance - withdrawAmount ;

  }


  
}
