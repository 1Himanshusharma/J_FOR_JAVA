package J_FOR_JAVA.ROW;
class traingle {
  public static void main(String[] args) {
      int i, j;
      int num = 1; 
      for (i = 0; i < 3; i++) {
          
          for (j = 0; j < 3; j++) {
              if (i <= j) {
                  System.out.print(num);
              } else {
                  System.out.print("  "); 
              }
              
          }
          num++;
          System.out.println("\n");
      }
  }
}
