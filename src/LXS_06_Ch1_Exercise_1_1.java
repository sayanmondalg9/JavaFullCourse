
import java.util.Scanner;

public class LXS_06_Ch1_Exercise_1_1 {
    public static void main(String[] args) {
        // **************************************************************//
        // 1.1 Write a program to calculate percentage of a given student
        // in CBSE bord exam. His marks from 5 subjects must be taken as
        // input from the user. (marks are out of 100).
        // **************************************************************//
        Scanner sc = new Scanner(System.in);
        int allTotalMarks, allTotalPercentage;
        int sub1, sub2, sub3, sub4, sub5;
        System.out.println("Enter your five subject marks -");
        System.out.print("Subject 1 : ");
        sub1 = sc.nextInt();
        System.out.print("Subject 2 : ");
        sub2 = sc.nextInt();
        System.out.print("Subject 3 : ");
        sub3 = sc.nextInt();
        System.out.print("Subject 4 : ");
        sub4 = sc.nextInt();
        System.out.print("Subject 5 : ");
        sub5 = sc.nextInt();
        System.out.println("You get " + sub1 +"% in subject 1 out of 100");
        System.out.println("You get " + sub2 +"% in subject 2 out of 100");
        System.out.println("You get " + sub3 +"% in subject 3 out of 100");
        System.out.println("You get " + sub4 +"% in subject 4 out of 100");
        System.out.println("You get " + sub5 +"% in subject 5 out of 100");
        allTotalMarks = sub1+sub2+sub3+sub4+sub5;
        System.out.println("Your all total marks is " + allTotalMarks);
        allTotalPercentage = allTotalMarks/5;
        System.out.println("And your all total percentage is " + allTotalPercentage + "%");
    }
}
