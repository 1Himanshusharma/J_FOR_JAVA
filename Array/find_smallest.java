
public class find_smallest {
  public static void main(String[] args){
    int arr[] = new int[]{1,3,4,5,6,87,5};
    int min = Integer.MAX_VALUE;
    for (int i = 0 ; i < arr.length;i++){
      if (arr[i] <  min){
        min = arr[i];
      }
    }
    System.out.println("The mininum value is: " + min);
  }
  
}
