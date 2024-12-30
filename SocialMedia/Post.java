public class Post {

  private String content ;
  private String description ;
  private Comment comment ;

  public Post(){

  }

  public Post(String content , String description){
    this.content = content ;
    this.description = description ;
  }


  public void comment(String comment ,User user){
    this.comment = new Comment(comment,user) ;
  }

  


  
}
