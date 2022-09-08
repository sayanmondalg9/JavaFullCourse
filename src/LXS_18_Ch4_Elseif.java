import java.util.Scanner;

public class LXS_18_Ch4_Elseif {
  public static void main(String[] args) {

    // If, else-if ladder -

    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter your age : ");
    // int age = sc.nextInt();
    // if(age>19){
    // System.out.println("You are a responsible man now.");
    // } else if (age>12){
    // System.out.println("You are a teenager.");
    // } else if (age>5) {
    // System.out.println("You are a little boy or girl.");
    // } else {
    // System.out.println("You are a little baby.");
    // }

    // Switch case Statement -
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age : ");
    int age = sc.nextInt();

    // Normal Switch case -
    switch (age) {
      case 20:
        System.out.println("You are a responsible man now.");
        break;
      case 13:
        System.out.println("You are a teenager.");
        break;
      case 6:
        System.out.println("You are a little boy or girl.");
        break;
      default:
        System.out.println("You are a little baby.");

    }

    // Inhanced version of switch of Java
    switch (age) {
      // No need of break; statements here.
      
      case 20 -> {
        // for multiple lines we need curly bracets {}
        System.out.println("You are a responsible man now.");
        System.out.println("You are a responsible man now.");
        System.out.println("You are a responsible man now.");
      }

      // but for single line no need curly bracets
      case 13 -> System.out.println("You are a teenager.");

      case 6 -> System.out.println("You are a little boy or girl.");

      default -> System.out.println("You are a little baby.");

    }

  }
}
