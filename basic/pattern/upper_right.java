import java.util.Scanner;
public class upper_right{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    for (int i = 0; i < num;i++){
      for (int j = num-1; j >=0  ;j--){
        if (i >= j){
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
  
}
