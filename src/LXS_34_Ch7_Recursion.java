import javax.sound.midi.Soundbank;

public class LXS_34_Ch7_Recursion {
  // Factorial
  // static int factorial(int x){
  // if(x==0 || x==1){
  // return 1;
  // } else{
  // return x * factorial(x-1);
  // }
  // }

  // Fibbonacci series | 0,1,1,2,3,5,8,13,21,34.....
  static int fibbonacci(int n) {
    if (n == 0 || n == 1) {
      return n;
    }
    return (fibbonacci(n - 1)) + (fibbonacci(n - 2));
  }

  public static void main(String[] args) {
    // System.out.println(factorial(5));
    for (int i = 10; i >= 0; i--) {
      System.out.println(fibbonacci(i));
    }
  }
}
