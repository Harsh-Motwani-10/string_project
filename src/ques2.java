import java.util.Locale;

public class ques2 {
    static void main(String[] args) {
        String str = "Hello";
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)-'a'+1);
        }
    }
}
