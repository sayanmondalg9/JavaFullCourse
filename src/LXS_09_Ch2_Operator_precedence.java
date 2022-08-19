
public class LXS_09_Ch2_Operator_precedence {
    public static void main(String[] args) {
        /// Quick Quiz -
        float x = 5, y = 6, z = 2;
//        float a = x * y / 2;
//        System.out.println(a);

        float a = (y * y) - (4 * x * z) / (2 * x);
        System.out.println(a);
    }
}
