package Bank;

public class BankDetailUse {

  public static void main(String args[]){

    BankDetails b1 = new BankDetails("Dhanush","IO12MESBI") ;
    BankDetails b2 = new BankDetails("ElonMusk","IO25MEOSI") ;
    User u1 = new User(b1,"Dhanush",21,"8223000671200");
    User u2 = new User(b2,"elonMusk",31,"9887002343410");
    System.out.println(b1.totalBalance());
    DepositeDepartment d1 = new DepositeDepartment(u1, 100000);
    System.out.println(b1.totalBalance());



    

  }

  
  
}
