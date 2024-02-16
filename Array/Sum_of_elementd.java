
public class Sum_of_elementd {
  public static void main(String[] args){
    int arr[] = new int[]{1,2,3,4,4,5,7};
    int sum = 0;
    // loop through the array to calculate sum of elements
    for (int i = 0;i < arr.length;i++){
      sum = sum + arr[i];
    }
    System.out.println("the Sum of elements: " + sum);
  }
  
}
