public class LXS_15_Ch3_Practice_set {
  public static void main(String[] args) {
    /**
     * 1. Write a Java program to convert a string to lower case
     */

    // String about = "LOREM IS BEST IN THE WORLD";
    // String newAbout = about.toLowerCase();
    // System.out.println(about);
    // System.out.println(newAbout);
     
    /**
     * 2. Replace spaces with underscores.
     */

    // String about = "LOREM IS BEST IN THE WORLD";
    // String newAbout = about.replace(' ', '_');
    // System.out.println(about);
    // System.out.println(newAbout);
        
    /**
     * 3. Fill in a letter template which looks like below :
     * letter = "Dear <|name|>, Thanks a lot"
     * --> Replace <|name|> with a string (some name).
     */

    // String name = "Lorem";
    // String thank = "Dear <|name|>, Thanks a lot";
    // String nwThank = thank.replace("<|name|>", name);
    // System.out.println(thank);
    // System.out.println(nwThank);

    /**
     * 4. Detect double and triple spaces in a string.
     */
    //           "0000000000111111111122222222223333333333444444"
    // index =   "0123456789012345678901234567890123456789012345"
    // String str = "Double  spaces and Triple   spaces are present";
    // System.out.println(str.indexOf("  "));
    // System.out.println(str.indexOf("   "));

    /**
     * 5. Format the following letter using escape sequence characters.
     * letter = "Dear Lorem, This Java course is nice. Thanks"
     */

    // System.out.println("Dear Lorem,\n\tThis Java Course is nice.\n\t\t\t\tThanks");
  }
}
