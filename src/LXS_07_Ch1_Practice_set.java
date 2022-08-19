
public class LXS_07_Ch1_Practice_set {
    public static void main(String[] args) {
        // ***************************************************************** //
        // 1. Write a program to sum three numbers in Java.
        // ***************************************************************** //
        /*
        int a = 5, b = 6, c = 11;
        int sum = a + b + c;
        System.out.println("The sum of three numbers is : " + sum);
        */

        // ***************************************************************** //
        // 2. Write a program to calculate CGPA using marks of three subjects
        // out of 100.
        // ***************************************************************** //
        /*
        float m1 = 95, m2 = 95, m3 = 93;
        float cgpa = ((m1 + m2 + m3)/ 3)/10;
        System.out.println(cgpa);
        */

        // ***************************************************************** //
        // 3. Write a Java program which asks the user to enter his/her name
        // and greets them with "Hello <name>!, wish you have a good day."
        // ***************************************************************** //
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name please : ");
        String name = sc.nextLine();
        System.out.println("Hello " + name +"!, wish you have a good day");
        */

        // ***************************************************************** //
        // 4. Write a Java program to convert Kilometers to miles
        // ***************************************************************** //
        /*
        float km = 1f;
        float mil = km/1.609f;
        System.out.println(km + " Kilometer = " + mil + " Miles" );
         */

        // ***************************************************************** //
        // 5. Write a Java program to detect whether a number entered by
        // the user is an integer or not.
        // ***************************************************************** //
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        boolean num = sc.hasNextInt();
        System.out.println(num);
         */
    }
}
