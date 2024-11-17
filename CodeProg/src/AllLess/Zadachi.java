package AllLess;
import java.util.Scanner;

public class Zadachi {
    public static void main(String[] args) {
        double summ = 0;
    double a = new Scanner(System.in).nextDouble();
    String str = new Scanner(System.in).nextLine().trim();
    int maxLen = 50;
    int len = str.length();

if(a<2||a>16 || !str.startsWith("0.") || len > maxLen) System.exit(1);

str = str.replace("0." , "");
for (int i = 0; i < str.length(); i++) {
    double count = -(i+1);
    char l = str.charAt(i);
    double loc = 0;

    if (l >= '0' && l <= '9') {
        loc = l - '0';
    } else if (l >= 'a' && l <= 'f') {
        loc = l - 'a' + 10;
    }

    double ss = Math.pow(a, count);
    if(ss!=0) {
        double itog = loc * ss;
        summ += itog;
    }
}
        String result = String.format("%.5f", summ);
        System.out.println(result);

    }
}
