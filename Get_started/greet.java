import java.util.*;

class greet{
  public static void main(String args[]){
    System.out.println("May i know you name: ");
    Scanner sc = new Scanner(System.in);

    String name = sc.nextLine();
    // printiing the value
    System.out.println("Hii, nice to meet you " + name + " .");
  }
}