package Bank;

public class Department { 

  String name ;
  private static int numberOfDepartments ;
  int noOfempPerDepartment ;
  int budgetPerDepartment ;

  public Department (String name , int numEmp , int budget){
    this.budgetPerDepartment = budget ;
    this.noOfempPerDepartment = numEmp ;
    this.name = name ;
  }

  
}
