import java.lang.Math;
public class random {
  public static void main(String args[]){
    // Generating random numbers
    System.out.println("1st Random Number: " + Math.random());
    System.out.println("2nd Random Number: " + Math.random());
    System.out.println("3rd Random Number" + Math.random());

    double a = Math.random()*(max - min + 1) + min;
    int x = random.nextInt(50);
    int y = random.nextInt(1000);
  }
  
}
