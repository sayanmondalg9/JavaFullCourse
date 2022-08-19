
import java.util.Scanner;

public class LXS_05_Ch1_userinput {
    public static void main(String[] args){
        System.out.println("Hello Lorem!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("sum = " + sum);

        boolean b1 = sc.hasNextInt();
        System.out.println(b1);

        String str = sc.next();
        System.out.println(str);
        String str2 = sc.nextLine();
        System.out.println(str2);
    }
}
