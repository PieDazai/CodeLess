import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("выберите товар!\n1)шоколад\n2)кофе\n3)чай");
        Scanner ss = new Scanner(System.in);
        int num = ss.nextInt();

        switch (num) {
            case 1:
                System.out.println("шоколад");
                System.out.println("вкусный");
                break;
            case 2:
                System.out.println("кофе");
                break;
            case 3:
                System.out.println("чай");
                break;
        }
    }
}
