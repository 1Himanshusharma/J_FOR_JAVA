
public class copying {
  public static void main(String[] args){
    // initialize array
    int[] arr1 = new int[]{1,2,4,5,6};
    
    int arr2[] = new int[arr1.length];
    for (int i = 0; i < arr1.length; i++) {
      arr2[i] = arr1[i];
    }
    //Display elements of array 1;
    System.out.println("Elements of original array: ");
    for (int i = 0; i < arr1.length ;i++){
      System.out.print(arr1[i] + " ");
    }
    System.out.println();
    // Displaying elements of array arr2
    for (int i = 0; i < arr2.length;i++){
      System.out.print(arr2[i] + " ");
    }
  }
}
