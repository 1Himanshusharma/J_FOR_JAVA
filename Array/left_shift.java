
public class left_shift {
  public static void main(String[] args){
    // initialize array
    int[] arr = new int[]{1,2,3,4,5,6};
    // determine the number of times an array sho
    int n = 3;
    System.out.println("Original array: ");
    for (int i = 0 ;i < arr.length;i++){
      System.out.print(arr[i] + " ");
    }

    for (int i = 0;i < n;i++){
      int temp = arr[0];
      for(int j = 0; j < arr.length-1;j++){
        // shift the element of the array
        arr[j] = arr[j+1];
      }
      // first element of array will be added to the end
      arr[arr.length-1] = temp;
    }
    System.out.println();
    // Displays resulting array after rotation
    System.out.println("Array after left rotation: ");
    for (int i = 0; i < arr.length;i++){
      System.out.print(arr[i] + " ");
    }
  }
}
