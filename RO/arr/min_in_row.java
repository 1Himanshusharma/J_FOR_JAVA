package J_FOR_JAVA.ROW.arr;
public class min_in_row {
  public static void main(String[] args) {
      int[][] arr = {{3, -5, 9}, {-1, 2, 7}, {-8, -7, 1}};
      int i, j;
      for (i = 0; i < 3; i++) {
          int min = Integer.MAX_VALUE;
          for (j = 0; j < 3; j++) {
              if (min > arr[i][j]) {
                  min = arr[i][j];
              }
          }
          System.out.println("The min in " + i + " row is: " + min);
      }
  }


}
