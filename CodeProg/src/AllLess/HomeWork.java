package AllLess;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        String p = sc.nextLine();
        int i = 0;
    for(;;){
    i = text(t, p, i);
    if(i == -1) break;
    else{
        System.out.println(i);
        i++;
         }
    }
}

    public static int text (String text, String pattern, int i){
        for(;;) {
            if (i > text.length() - pattern.length()) {
                return -1;
            }
            if (text.substring(i, i + pattern.length()).equals(pattern)) {
                return i;
            }
            i++;
        }
    }
}
