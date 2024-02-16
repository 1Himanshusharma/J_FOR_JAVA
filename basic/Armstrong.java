import java.util.Scanner;

public class Armstrong {
  public static boolean isArmstrong(int n){
    //function to check if the number is armstrong or not
    int temp, digits = 0,last = 0, sum = 0;
    // assigning n into a temp variable
    temp = n;
    // loop execute until the condition become false
    while (temp>0){
      temp = temp/10;
      digits++;
    }
    // again take n into temp and assign it into last
    temp = n;
    while (temp > 0){
      // determines the last digit from the number
      last = temp%10;
      // calculates the power of a number up to digit times and add the res
      sum += (Math.pow(last,digits));
      // removes the last digit
      temp = temp/10;
    }
    // compares the sum with n
    if (n == sum){
      return true;
    }
    else{
      return false;
    }
  }
  public static void main(String args[]){
    int num;
    Scanner s = new Scanner(System.in);
    // reads the limit from the user
    System.out.print("Enter the limit: ");
    num = s.nextInt();
    System.out.println("ArmStrong Number up to " + num + "are: ");
    for (int i= 0; i <= num; i++){
      // function calling
      if (isArmstrong(i)){
        System.out.print(i + ",");

      }
    }
  }
  
}
