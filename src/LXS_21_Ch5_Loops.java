import java.util.Scanner;

import javax.swing.SortOrder;

public class LXS_21_Ch5_Loops {
  public static void main(String[] args) {
    // While Loop Syntax -
    // while (boolean_condition) {
    // statement;
    // increment / decrement;
    // }
    // int i = 1;
    // while(i<=10){
    // System.out.println(i);
    // i++;
    // }

    // Do-while loop Syntax -
    // do {
    // statement;
    // increment / decrement;
    // } while (boolean_condition);
    // int i = 1;
    // do {
    // System.out.println(i);
    // i++;
    // } while (i <= 10);

    // For Loop Syntax -
    // for(int i = 1; i<=10; i++){
    // System.out.println(i);
    // }

    // QQZ:Write a program to print first n odd numbers using a for loop
    Scanner sc = new Scanner(System.in);
    System.out.println("How many odd numbers you want");
    int n = sc.nextInt();
    // for(int i = 0; i < 2*n; i++){
    // if (i % 2 == 0) {
    // continue;
    // } else {
    // System.out.println(i);
    // }
    // }

    // 2n = even number
    // 2n+1 = odd number
    // for (int i = 0; i < n; i++) {
    //   System.out.println(2 * i + 1);
    // }

    for (int i = n; i > 0; i--) {
      System.out.println(i);
    }
  }
}
