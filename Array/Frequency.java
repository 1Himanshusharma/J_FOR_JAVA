public class Frequency {
  public static void main(String[] args){
    int[] arr = new int[]{1,2,3,4,5,6,67,7,8,3};
    // Array will store frquencei of element
    int[] fr = new int[arr.length];
    int visited = -1;
    for (int i = 0; i < arr.length;i++){
      int count = 1;
      for (int i = 0; i < arr.length;i++){
        if (arr[i] == arr[j]){
          count++;
          // To avoid counting same element again
          fr[j] = visited;
        }
      }
      if (fr[i] != visited){
        fr[i] = count;
      }
    }
  }
  
}
