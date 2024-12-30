import java.util.ArrayList;

public class Comment {

  String comments ;
  ArrayList<User> user = new ArrayList<>();

  public Comment (){

  } 

  public Comment(String comments , User user){
    this.comments = comments ;
    this.user.add(user);
  }
  
}
