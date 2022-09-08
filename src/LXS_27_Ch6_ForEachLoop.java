public class LXS_27_Ch6_ForEachLoop {
  public static void main(String[] args) {
    // int [] marks = {60, 62, 66, 76, 56};
    float [] marks = {60, 62.5f, 66.5f, 76, 56};
    System.out.println(marks.length);

    // Display an array -
    // for(int i = 0; i<marks.length; i++){
    //   System.out.println(marks[i]);
    // }

    // for(int i = marks.length - 1; i>=0; i--){
    //   System.out.println(marks[i]);
    // }

    // For Each Loop -
    for(float element : marks){
      System.out.println(element);
    }
  }
}
