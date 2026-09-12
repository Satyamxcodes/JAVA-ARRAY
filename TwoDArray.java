import java.util.*;
public class TwoDArray {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  int row = sc.nextInt();
  int col = sc.nextInt();
  int[][] arr = new int[row][col];
    
    // Taking input in 2D array
    // row
      for(int i=0; i<row; i++){
     // column
        for(int j=0; j<col; j++){
            arr[i][j] = sc.nextInt();
        }
      }
      // output in 2D array
      for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
      }

 }
}