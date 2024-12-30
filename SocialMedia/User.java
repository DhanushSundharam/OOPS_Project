import java.util.ArrayList;
import java.util.HashMap;

public class User{

  private int userID ;
  private String name ;
  private String email ;
  private ArrayList<User> followers ;
  private ArrayList<User> following ;
  private ArrayList<Post> post ;
  private int like ;
  private HashMap<String,Integer> hs = new HashMap<>() ;
  private static int postcount ;
  
  


  
  

  public User(){

  }

  public User(String name , String email){
    this.userID = userID++ ;
    this.name = name ;
    this.email = email ;
    post = new ArrayList<Post>();
    followers = new ArrayList<User>() ;
    following = new ArrayList<User>() ;
  }

  public int getUserID(){
    return userID ;
  }

  public void setUserID(int userID){
    this.userID = userID ;
  }

  public String getName(){
    return name ;
  }

  public void setName(String name){
    this.name = name ;
  }

  public String getEmail (){
    return email ;
  }

  public void setEmail(){
    this.email = email ;
  }

  public Post  createPost(String content , String description){

    post.add(new Post(content,description));

    hs.put(content,postcount+1);

    return post.get(hs.get(content));

       

  }

  public int getLike(){
    return like ;
  }

  public void setLike(int like){
    this.like = like ;
  }

  public void following(User user){
    following.add(user);
    user.followers.add(this);

  }

  public int Countfollowers(){
    return followers.size() ;
  }

 


}