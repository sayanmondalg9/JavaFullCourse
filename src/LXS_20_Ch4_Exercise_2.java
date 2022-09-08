import java.util.*;

public class LXS_20_Ch4_Exercise_2 {
  public static void main(String[] args) {
    // Rock, paper, scissor game -
    Random random = new Random();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter '0' for rock, '1' for paper, '2' for scissor");
    int inpt = sc.nextInt();
    int x = random.nextInt(3);
    switch (x) {
      case 0 -> {
        if (inpt == 0) {
          System.out.println("Computer choose rock");
          System.out.println("You choose rock, The match is draw");
        } else if(inpt == 1){
          System.out.println("Computer choose rock");
          System.out.println("You choose paper, You win the match");
        } else if(inpt == 2){
          System.out.println("Computer choose rock");
          System.out.println("You choose scissor, You lose the match");
        }
      }
      case 1 -> {
        if (inpt == 0) {
          System.out.println("Computer choose paper");
          System.out.println("You choose rock, You lose the match");
        } else if(inpt == 1){
          System.out.println("Computer choose paper");
          System.out.println("You choose paper, The match is draw");
        } else if(inpt == 2){
          System.out.println("Computer choose paper");
          System.out.println("You choose scissor, You win the match");
        }
      }
      case 2 -> {
        if (inpt == 0) {
          System.out.println("Computer choose scissor");
          System.out.println("You choose rock, You win the match");
        } else if(inpt == 1){
          System.out.println("Computer choose scissor");
          System.out.println("You choose paper, You lose the match");
        } else if(inpt == 2){
          System.out.println("Computer choose scissor");
          System.out.println("You choose scissor, The match is draw");
        }
      }
    }
  }
}
