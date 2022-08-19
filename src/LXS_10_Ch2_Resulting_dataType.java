
public class LXS_10_Ch2_Resulting_dataType {
    
    public static void main(String[] args) {
        // ******************************************* //
        // result of byte + short --> int
        // result of short + int --> int
        // result of long + float --> float
        // result of int + float --> float
        // result of char + int --> int
        // result of char + short --> int
        // result of long + double --> double
        // result of float + double --> double
        // ******************************************* //

        // Increment and Decrement Operators
        // Increment
//        int i = 56;
//        System.out.println(i++);
//        System.out.println(i);
//        System.out.println(++i);
//        System.out.println(i);

        // Decrement
//        int j = 56;
//        System.out.println(j--);
//        System.out.println(j);
//        System.out.println(--j);
//        System.out.println(j);

        /// Quick Quiz - What will be the following expression (x)
        // int y = 7;         |    char a = 'B';
        // int x = ++y * 8;   |    a++;
        // x = ?              |    a = ?

        int y = 7;
        int x = ++y * 8;
        System.out.println(x);

        char a = 'B';
        System.out.println(a++);
    }
}







