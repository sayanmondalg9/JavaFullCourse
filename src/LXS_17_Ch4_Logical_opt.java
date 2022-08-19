public class LXS_17_Ch4_Logical_opt {
  public static void main(String[] args) {
    boolean a = true,
            b = false;
            
    if (a && b) {
      System.out.println("True");
    } else {
      System.out.println("false");
    }

    if (a || b) {
      System.out.println("True");
    } else {
      System.out.println("false");
    }

    System.out.println("Not(a) = " + !a);
    System.out.println("Not(b) = " + !b);
  }

}