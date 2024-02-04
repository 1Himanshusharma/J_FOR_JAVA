import java.util.Scanner;
public class input_integer {
  public static void main(String args[]){
    System.out.println("Please enter the numbers: ");
    Scanner t = new Scanner(System.in);

    int a, b;
    a = t.nextInt();
    b = t.nextInt();

    System.out.println("The sum: " + (a + b));
  }
}
