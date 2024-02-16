
public class find_max {
  public static void main(String[] args){
    int arr[] = new int[]{1,2,3,4,4,7,7,8};
    int max = Integer.MIN_VALUE;
    for (int i = 0;i < arr.length ; i++){
      if (arr[i] > max){
        max = arr[i];
      }
    }
    System.out.print("The maximum value: " + max);
  }
  
}
