package SupermarketManagement.Model;

public abstract class Employee {

  protected int ID ;
  protected String firstName ;
  protected String lastName ;
  protected String email ;
  protected String phoneNumber ;
  protected String address ;
  protected double salary ;
  protected Option[] options ;

  public Employee(){

  }

  public Employee(int ID ,String firstName  , String lastname , String email, String phoneNumber , String address , double salary){
    this.ID = ID ;
    this.firstName = firstName ;
    this.lastName = lastname ;
    this.email = email ;
    this.address = address ;
    this.phoneNumber = phoneNumber ;
    this.salary = salary ;

  }

  public int getID(){
    return ID ;
  }

  public void setID(int ID){
    this.ID = ID ;
  }

  public String getfirstName(){
    return firstName ;
  }

  public void setfirstName(String firstName){
    this.firstName = firstName ;
  }

  public String getlastName (){
    return lastName ;
  }

  public void setlastName(String lastName){
    this.lastName = lastName ;
  }

  public String getemail(){
    return email ;
  }

  public void setemail(String email){
    this.email = email ;

  }

  public String getaddress(){
    return address ;
  }

  public void setaddress(String address){
    this.address = address ;
  }

  public String getPhoneNumber(){
    return phoneNumber ;
  }

  public void setPhoneNumber(String phoneNumber){
    this.phoneNumber = phoneNumber ;
  }


  public double getSalary(){
    return salary ;
  }

  public void setSalary(double salary){
    this.salary = salary ;
  }
  
}
