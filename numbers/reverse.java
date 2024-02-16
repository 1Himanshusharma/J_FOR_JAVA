import java.util.Scanner;
public class reverse {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    int reverse = 0;
    while (num > 0){
      int rem = num%10;
      reverse = reverse * 10 + rem;
      num = num/10;
    }
    System.out.print("Reverse of number: " + reverse);
  }
  
}
