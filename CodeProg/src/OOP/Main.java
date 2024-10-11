package OOP;

public class Main {
    public static void main(String[] args) {

        Animals dog = new Dog(12.6,5,"Тузик");
        Animals duck = new Duck(2.5, 3, "Вера");

        dog.move();
        dog.walk();
        duck.move();
        duck.walk();
        System.out.println("Собаку зовут: "+dog.getName());
        System.out.println("Утку зовут: "+duck.getName());
    }
}
