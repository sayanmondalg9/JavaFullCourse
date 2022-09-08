public class LXS_32_Ch7_MethodOverloading {
  // static void telljoke() {
  //   System.out.println("Hello world");
  // }

  // static void chng1(int a) {
  //   a = 45;
  // }

  // static void chng2(int[] a) {
  //   a[0] = 45;
  // }
    static void ol(){
      System.out.println("hi");
    }
    static void ol(int a){
      System.out.println("Love you " + a);
    }
    static void ol(int a, int b){
      System.out.println("Love you " + a + " to Iron man" + b);
    }
  public static void main(String[] args) {
    // telljoke();
    // // Case 1: Trying to change an integer
    // int x = 56;
    // chng1(x);
    // System.out.println("After change x is : " + x);
    // // Case 2: Trying to change an array
    // int[] arr = { 79, 76, 86, 85, 76, 72, 84 };
    // chng2(arr);
    // System.out.println("After change arr[0] is : " + arr[0]);

    // Method overloading - Two or more methods can have same name but
    // different parameters. Such methods are called Overloaded methods.
    ol();
    ol(3000);
    ol(3000, 10000);
  }
}
 