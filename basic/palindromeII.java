
public class palindromeII {
  String original,reverse = "";
  Scanner s = new Scanner(System.in);
  System.out.println("Enter a string: ");
  original = s.nextLine();
  int length = original.length();
  for (int i = length - 1;i >= 0;i--){
    reverse = reverse + original.charAt(i);
  }
  if (original.equals(reverse)){
    System.out.println("Entered String is a palidrome");
  }
  else{
    System.out.println("Entered string is not a palindrome.");
  }
  
}
