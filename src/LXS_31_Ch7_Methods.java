public class LXS_31_Ch7_Methods {

  // Static Method -
  static int logic(int x, int y) {
    int z;
    if (x > y) {
      z = x + y;
    } else {
      z = (x + y) * 5;
    }
    return z;
  }

  // Non-static method -
  // int logic(int x, int y) {
  // int z;
  // if (x > y) {
  // z = x + y;
  // } else {
  // z = (x + y) * 5;
  // }
  // return z;
  // }

  public static void main(String[] args) {
    int a = 5, b = 6;
    // LXS_31_Methods obj = new LXS_31_Methods();
    // int c = obj.logic(a, b);
    int c = logic(a, b);
    System.out.println(c);
  }
}
