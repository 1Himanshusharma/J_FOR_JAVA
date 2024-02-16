import java.util.Scanner;
public class lower_triangle {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    for (int i = 0 ;i < num  ;i++){
      for (int j = 0; j < num; j++){
        if (i >= j){
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
  
}
