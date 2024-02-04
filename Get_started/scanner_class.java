
import java.util.Scanner;

public class scanner_class {
  public static void main(String args[]){
    // now i wanna take input from user
    // soo there is a class called Scanner which is present in utils standard library
    // ok now i will creaete instace
    Scanner s = new Scanner(System.in);
    System.out.println("Enter your name: ");


    // tumhe pta hai naa ki hum log next line kyu use karte  hai
    // for taking a sentence as a input
    // matlab multiword string
    // jaise c++ me getline hota hai
    String name = s.nextLine();


    System.out.println("Hello! My name is " + name);
  }
}
