
public class sort {
  public static void main(String[] args){
    int arr[] = new int[]{3,5,7,2,4,8,9};
    // display original
    System.out.print("the original arr: ");
    for (int i = 0; i < arr.length ; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.print("The sorted arr: ");
    for (int i =0; i < arr.length ; i++){
      for (int j = i + 1; j < arr.length ;j++){
        if (arr[i] > arr[j]){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    for (int i = 0; i < arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }  
}
