public class LXS_28_Ch6_Multidim_array {
  public static void main(String[] args) {
    int[] arr1d; // 1-D array
    int[][] arr2d; // 2-D array
    arr2d = new int[2][3];
    arr2d[0][0] = 100;
    arr2d[0][1] = 101;
    arr2d[0][2] = 102;
    arr2d[1][0] = 200;
    arr2d[1][1] = 201;
    arr2d[1][2] = 202;
    for (int i = 0; i < arr2d.length; i++) {
      for (int j = 0; j < arr2d[i].length; j++) {
        System.out.print(arr2d[i][j]);
        System.out.print(" ");
      }
      System.out.println("");
    }
  }
}
