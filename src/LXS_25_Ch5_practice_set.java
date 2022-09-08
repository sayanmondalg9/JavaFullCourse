import java.util.*;

public class LXS_25_Ch5_practice_set {
  public static void main(String[] args) {
    /**
     * 1. Write a program to print the following pattern using for loop
     * and while loop.
     * ****
     * ***
     * **
     * *
     */
    // for (int i = 4; i > 0; i--) {
    //   for (int j = 0; j < i; j++) {
    //     System.out.print("* ");
    //   }
    //   System.out.print("\n");
    // }

    /**
     * 2. Write a program to sum first n even numbers using while loop and
     * for loop.
     */
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter a number : ");
    // int n = sc.nextInt();
    // int sum = 0;
    // int i = 0;

    // while (i <= n) {
    // if (i % 2 == 0) {
    // sum = sum + i;
    // }
    // i++;
    // }
    // System.out.println(sum);

    // for (int i = 0; i <= n; i++) {
    // if(i%2==0){
    // sum = sum + i;
    // }
    // }
    // System.out.println(sum);

    /**
     * 3. Write a program to print multiplication table of a given number.
     */
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter a number : ");
    // int n = sc.nextInt();
    // for(int i = 1; i<=10; i++){
    // System.out.println(n+" x "+i+" = "+ n*i);
    // }

    /**
     * 4. Write a program to print multiplication table of 10 in reverse.
     */
    // for(int i = 10; i>=1; i--){
    // System.out.println("10 x "+i+" = "+ 10*i);
    // }

    /**
     * 5. Write a program to find factorial of a given number using for loop
     * and while loop.
     */
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter a number : ");
    // int n = sc.nextInt();
    // int facto = 1;
    // for (int i = n; i > 0; i--) {
    // facto *= i;
    // }
    // System.out.println(facto);

    /**
     * 6. What can be done using one type of loop can also be done using the
     * other two types of loops - true of false ?
     */
    // Yes, ture

    /**
     * 7. Write a program to calculate the sum of the numbers occuring in the
     * multiplication table of 8.
     */
    // int sum = 0;
    // for (int i = 1; i <= 10; i++) {
    // sum = sum + (8*i);
    // }
    // System.out.println(sum);

    /**
     * 8. A do while loop is excuted :
     * > at least once
     * > at least twice
     * > at most once
     */
    // at least once
  }
}
