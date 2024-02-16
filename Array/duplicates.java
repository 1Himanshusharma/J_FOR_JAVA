
public class duplicates {
  public static void main(String[] args){
    // initialize array
    int[] arr = new int[]{1,2,3,2,3,4,55,5,4,34,3,2};
    System.out.println("Duplicate elements in given array: ");
    // searches for duplicates element
    for (int i = 0; i < arr.length;i++){
      for (int j = i+1 ; j < arr.length;j++){
        if (arr[i] == arr[j]){
          System.out.println(arr[j]);
        }
      }
    }
  }
  
}
