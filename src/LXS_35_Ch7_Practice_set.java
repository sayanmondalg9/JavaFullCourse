import java.util.*;

public class LXS_35_Ch7_Practice_set {
  // Q1 -
  // static void multable(int n) {
  // for (int i = 1; i <= 10; i++) {
  // System.out.println(n + " x " + i + " = " + (n*i));
  // }
  // }

  // Q2 -
  // static void starPtrn(int n){
  // for(int i = 1; i <= n; i++){
  // for(int j = 1; j <= i; j++){
  // System.out.print("* ");
  // }
  // System.out.println("");
  // }
  // }

  // Q3 -
  // static int sum(int n){
  // if(n==1){
  // return n;
  // }
  // n = n + sum(n-1);
  // return n;
  // }

  // Q4 -
  // static void starPtrnRev(int n){
  // for (int i = n; i > 0; i--) {
  // for (int j = n; j >= i; j--) {
  // System.out.print("* ");
  // }
  // System.out.println("");
  // }
  // }

  // Q5 -
  // static int fibbo(int n){
  // if(n == 0 || n == 1){
  // return n;
  // }
  // return fibbo(n-1) + fibbo(n-2);
  // }

  // Q6 -
  // static int avg(int... arr){
  // int n = 0;
  // for (int i : arr) {
  // n = n + i;
  // }
  // return (n/3);
  // }

  // Q7 -
  static void starPtrnRecRev(int n) {
    if (n > 0) {
      for (int i = n; i > 0; i--) {
        System.out.print("* ");
      }
      System.out.println("");
      starPtrnRecRev(n - 1);
    }
  }

  // Q8-
  // static void starPtrnRec(int n){
  // if(n>0){
  // starPtrnRec(n-1);
  // for(int i=0; i<n; i++){
  // System.out.print("* ");
  // }
  // System.out.println("");
  // }
  // }

  // Q9 -
  // static float tempCnvrt(float n){
  // float far = (n*(9.0f/5.0f)) + 32.0f;
  // return far;
  // }

  // Q10 -
  // static int nSum(int n){
  // int sum = 0;
  // for (int i=1; i <= n; i++){
  // sum = sum + i;
  // }
  // return sum;
  // }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    /**
     * Q1. Write java method to print multiplication table of a number n.
     */

    // System.out.print("Which number of multiplication you want : ");
    // int n = sc.nextInt();
    // multable(n);

    /**
     * Q2. WAP using methods to print the following pattern nth time:
     * - *
     * - * *
     * - * * *
     * - * * * *
     */

    // System.out.print("Enter the number of lines you want : ");
    // int n = sc.nextInt();
    // starPtrn(n);

    /**
     * Q3. Write a recursive function to calculate sum of first n natural
     * numbers.
     */
    // System.out.print("Enter the number : ");
    // int n = sc.nextInt();
    // System.out.println(sum(n));

    /**
     * Q4. Write a method to print the following pattern nth time:
     * - * * * *
     * - * * *
     * - * *
     * - *
     */
    // System.out.print("Enter the number of lines you want : ");
    // int n = sc.nextInt();
    // starPtrnRev(n);

    /**
     * Q5. Write a method to print nth term of fibbonacci series using
     * recursion.
     */
    // System.out.print("Enter the number : ");
    // int n = sc.nextInt();
    // System.out.println(fibbo(n));

    /**
     * Q6. Write a method to find average of a set of numbers passed
     * as arguments using varArgs.
     */
    // System.out.println("The average of three numbers is : "+avg(3,3,3));

    /**
     * Q7. Write a method to print the following pattern nth time
     * using recursion :
     * - * * * *
     * - * * *
     * - * *
     * - *
     */
    starPtrnRecRev(4);

    /**
     * Q8. WAP using methods to print the following pattern nth time
     * using recursion :
     * - *
     * - * *
     * - * * *
     * - * * * *
     */
    // starPtrnRec(4);

    /**
     * Q9. Write a method to convert celcius temperature into fahrenheit.
     */
    // System.out.print("Enter the temperature in celcius : ");
    // float cel = sc.nextInt();
    // System.out.println("Fahrenheit = "+ tempCnvrt(cel));

    /**
     * Q10. Write a method to calculate sum of first n natural numbers.
     */
    // System.out.print("Enter a number : ");
    // int n = sc.nextInt();
    // System.out.println("Sum of "+n +" number is : "+ nSum(n));
  }
}
