package AllLess;
import java.util.Scanner;

public class Zadachi {
    public static void main(String[] args) {
        int firsBase = new Scanner(System.in).nextInt();
        int secondBase = new Scanner(System.in).nextInt();
        int longer = new Scanner(System.in).nextInt();
        String str = new Scanner(System.in).nextLine();
        String one = "";
        String two = "";
        boolean isValid = str.length()<=100;
        if(firsBase<2||firsBase>16 || secondBase <2||secondBase>16 || longer <1 || longer > 20||!isValid) System.exit(1);
        for (int i = 0; i < str.length()-1; i++) {
        char l = str.charAt(i);
        int loc = 0;
            if (l >= '0' && l <= '9') {
                loc = l - '0';
            } else if (l >= 'a' && l <= 'f') {
                loc = l - 'a' + 10;
            }
        if(loc > firsBase) {
            System.out.println("NO");
            System.exit(1);}
        }

        if (str.contains(".")) {
            int index = str.indexOf('.');
            one = str.substring(0, index);
            two = str.substring(index + 1, str.length());
        }
       else { int mainDeck = mainerPart(str, firsBase); //1f3  16
            String newOtvet = mainToNewBase(mainDeck, secondBase);
            System.out.println(newOtvet);
            System.exit(0);
        }

        int mainDec = mainerPart(one, firsBase);
        double doubleDec = doublerPart(two, firsBase);
        String newOtvet = mainToNewBase(mainDec, secondBase);
        String otvetik = doubleToNewBase(doubleDec, secondBase);
        String resultat = newOtvet + otvetik;
        double number = Double.parseDouble(resultat);
        String formattedNumber = formatNumber(number, longer);

        while (formattedNumber.endsWith("0")) {
            formattedNumber = formattedNumber.substring(0, formattedNumber.length() - 1);
        }
        System.out.println(formattedNumber);
    }

    public static String formatNumber(double number, int decimalPlaces) {
    String format = "%." + decimalPlaces + "f";
    return String.format(format, number);
}

    public static String doubleToNewBase (double a, int b) {

            String result = ".";
            String localResult = "";
            double fractionalPart = a - (int) a;

            while (fractionalPart > 0) {
                char s;
                fractionalPart *= b;
                int digit = (int) fractionalPart;
                if (digit < 10) result += String.valueOf(digit);
                if (digit > 10) {
                    s = (char) ('a' + (digit - 10));
                    result += s;
                }
                fractionalPart -= digit;
                if(fractionalPart < 1e-5) break;
            }

            return  result;
        }

    public static String mainToNewBase (int a, int b){
        String localResult = "";
        String result = "";
        while (a>0) {
            char s;
            int locsal = a%b;

            if(locsal <10) localResult += String.valueOf(locsal);
            if(locsal >10) {
                s = (char) ('a' + (locsal - 10));
                localResult += s;
            }
            a /= b;
        }
        for (int i = localResult.length()-1;i>=0; i--) {
            result += localResult.charAt(i);
        }
        return  result;
    }

    public static int mainerPart (String str, int a){
    int summ = 0;
    for (int i = 0; i < str.length(); i++) {
        double count = str.length()-i-1;
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
        return summ;
}

    public static double doublerPart(String str, int a) {
     double summ = 0;

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
        return summ;
    }
}
