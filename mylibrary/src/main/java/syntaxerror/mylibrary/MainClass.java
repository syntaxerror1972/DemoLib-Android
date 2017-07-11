package syntaxerror.mylibrary;

/**
 * Created by sys5 on 7/11/2017.
 */

public class MainClass {
    public static String getSum(int a, int b) {
        try {
            return String.valueOf(a + b);
        } catch (Exception e) {
            return "";
        }
    }
}
