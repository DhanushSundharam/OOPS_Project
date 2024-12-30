public class Main {

  public static void main(String[] args) {

    User elonmusk = new User("elonmusk","elomusk@gmail.com");
    User billgates = new User("BillGates","billgates@gmail.com");
    User rock = new User("Rock","rock129@gmail.com");

    elonmusk.createPost("nature", "nature is beatifull").comment("super...",rock);
    elonmusk.createPost("elonmusk", "i'm in Tesla");
    billgates.createPost("microsft launches windows 10", "windows 10 new User Interface minimalitic");
    rock.createPost("The fenwick", "New Movie Adventure");

    elonmusk.following(rock);
    System.out.println(rock.Countfollowers());

    
  }
  
}
