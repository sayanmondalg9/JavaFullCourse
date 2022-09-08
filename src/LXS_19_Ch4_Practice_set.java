import java.util.Scanner;

public class LXS_19_Ch4_Practice_set {
  public static void main(String[] args) {
    /**
     * 1. What will be the output of this program :
     * int a = 10;
     * if (a=11)
     * System.out.println("I am 11");
     * else
     * System.out.println("I am not 11");
     */
    // int a = 10;
    // if(a=11)
    // System.out.println("I am 11");
    // else
    // System.out.println("I am not 11");

    /**
     * 2. Write a program to find out whether a student is or fail.
     * if it requires total 40% and atleast 33% in each subject to
     * pass. Assume 3 subjects and take marks as an input from the
     * user.
     */

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter Your marks :-");
    // System.out.print("Subject 1 : ");
    // int sub1 = sc.nextInt();
    // System.out.print("Subject 2 : ");
    // int sub2 = sc.nextInt();
    // System.out.print("Subject 3 : ");
    // int sub3 = sc.nextInt();
    // int totalMarks = sub1 + sub2 + sub3;
    // int totalPercentage = totalMarks / 3;
    // if ((totalPercentage >= 40) && (sub1 >= 33) && (sub2 >= 33) && (sub3 >= 33))
    // {
    // System.out.print("Your total marks is " + totalMarks + " and total percentage
    // is " + totalPercentage + "%.");
    // System.out.print("Congratulation, You are pass");
    // } else{
    // System.out.println("Sorry You are fail.");
    // }

    /**
     * 3. Calculate income tax paid by an employee to the government
     * as per the states mentioned below :
     * 
     * INCOME STATE ----- TAX
     * 2.5L - 5.0L ------- 5%
     * 5.0L - 10.0L ------ 20%
     * above 10.0L ------- 30%
     * 
     * Note : That there is no tax below 2.5L take input
     * among as an input from the user.
     */

    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter your salary : ");
    // float salary = sc.nextFloat();
    // float tax = 0;
    // if(salary <= 250000){
    //   tax = tax +0;
    // }
    // else if(salary>250000 && salary <=500000){
    //   tax = tax + 0.05f * (salary - 250000);
    // }
    // else if(salary>500000 && salary <=1000000){
    //   tax = tax + 0.05f * 250000;
    //   tax = tax + 0.20f * (salary - 500000);
    // }
    // else if(salary>500000 && salary <=1000000){
    //   tax = tax + 0.05f * 250000;
    //   tax = tax + 0.20f * 500000;
    //   tax = tax + 0.30f * (salary - 1000000);
    // }
    // System.out.println(tax);


    /**
     * 4. Write a Java program to find out the day of the
     * week given the number [ 1 for Monday .....7 for Sunday ]
     */

    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter week number - ");
    // byte weekNum = sc.nextByte();
    // switch(weekNum){
    // case 1 -> System.out.println("Monday");
    // case 2 -> System.out.println("Tuesday");
    // case 3 -> System.out.println("Wednesday");
    // case 4 -> System.out.println("Thursday");
    // case 5 -> System.out.println("Friday");
    // case 6 -> System.out.println("Saturday");
    // case 7 -> System.out.println("Sunday");
    // default -> System.out.println("Wrong input");
    // }

    /**
     * 5. Write a Java program to find whether a year entered by
     * the user is a leap year or not.
     */

    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter a year - ");
    // short year = sc.nextShort();
    // if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
    // System.out.println(year + " is a leap year");
    // } else{
    // System.out.println(year + " is not a leap year");
    // }

    /**
     * 6. Write a program to find out the type of website
     * from the Url below:
     * .com --> Commercial website
     * .org --> Organisation website
     * .in --> Indian website
     */

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter you website name with domain name -");
    // String webDomain = sc.nextLine();
    // if (webDomain.indexOf(".com") > 0) {
    // System.out.println("This is a commercial website.");
    // } else if (webDomain.indexOf(".org") > 0) {
    // System.out.println("This is an organisation website.");
    // } else if (webDomain.indexOf(".in") > 0) {
    // System.out.println("This is an Indian website.");
    // } else {
    // System.out.println("Not matched");
    // }

    // #Oltarnate Approch -
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter you website name with domain name -");
    // String webDomain = sc.nextLine();
    // if (webDomain.endsWith(".com")) {
    // System.out.println("This is a commercial website.");
    // } else if (webDomain.endsWith(".org")) {
    // System.out.println("This is an organisation website.");
    // } else if (webDomain.endsWith(".in")) {
    // System.out.println("This is an Indian website.");
    // } else {
    // System.out.println("Not matched");
    // }

  }
}
