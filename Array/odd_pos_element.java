
public class odd_pos_element {
  public static void main(String[] args){
    int arr[] = new int[]{1,2,3,4,5,6,7,8};
    System.out.print("Original array: ");
    for (int i = 0; i < arr.length ; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();

    System.out.print("The Element at Odd pos: ");
    for (int i = 0; i < arr.length ;i++){
      if (i % 2 == 0){
        System.out.print(arr[i] + " ");
      }
    }
  }
  
}
