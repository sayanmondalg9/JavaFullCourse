public class LXS_33_Ch7_Variable_arguments {
  static int sum(int x,int... arr) {
    // Available as int [] arr;
    int result = x;
    for (int a : arr) {
      result += a;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println("5 + 6 = " + sum(5, 6));
    System.out.println("4 + 5 + 6 = " + sum(4, 5, 6));
    System.out.println("3 + 4 + 5 + 6 = " + sum(3, 4, 5, 6));
    System.out.println("2 + 3 + 4 + 5 + 6 = " + sum(2, 3, 4, 5, 6));
    System.out.println("1 + 2 + 3 + 4 + 5 + 6 = " + sum(1, 2, 3, 4, 5, 6));
  }
}
