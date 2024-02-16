
public class reverse_order {
  public static void main(String[] args){

  
  int arr[] = new int[]{1,2,3,4,5,6,7,8};
  System.out.print("The Original arr: ");
  for (int i = 0; i < arr.length ;i++){
    System.out.print(arr[i] + " ");
  }
  System.out.println();
  System.out.print("The reverse order: ");
  for (int i = arr.length - 1;i >= 0; i--){
    System.out.print(arr[i] + " ");
  }}
  
}
