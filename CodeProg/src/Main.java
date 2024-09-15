import java.util.Scanner;

public class Main {
    static double a = 0;
    static double b = 0;
    public static void main(String[] args) {
                do{ a = inputDouble();
                    b = inputDouble();
                    switch (number()) {
                        case 1:
                            sum();
                            break;
                        case 2:
                            multiply();
                            break;
                        case 3:
                            diff();
                            break;
                        case 4:
                            divide();
                            break;
                        default:
                            System.out.println("ошибка");
                    }
                } while (isFlag());
            }
            private static boolean isFlag(){
                System.out.println("продолжить считать?\n0)нет\n1)да");
                if(new Scanner(System.in).nextInt()==0) return false;
                return  true;
            }
            private static void divide() {
                System.out.println("Ответ: "+(a/b));

            }
            private static void diff() {
                System.out.println("Ответ: "+(a-b));
            }
            private static void multiply() {
                System.out.println("Ответ: "+(a*b));
            }
            private static void sum() {
                System.out.println("Ответ: "+(a+b));
            }
            private static double inputDouble() {
                System.out.println("Введите число: ");
                return new Scanner(System.in).nextDouble();
            }
            private static int number(){
                System.out.println("Выберите операцию:\n1)сложение\n" +
                        "2)умножение\n3)вычитание\n4)деление");
                return new Scanner(System.in).nextInt();
            }
}
