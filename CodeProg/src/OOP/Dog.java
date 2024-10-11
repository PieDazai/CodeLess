package OOP;

public class Dog extends Animals {

    public Dog() {}

    public Dog(double weigth, int age, String name) {
        super(weigth, age, name);
    }

    @Override
    public void move() {
        System.out.println("Собака по кличке " + super.getName() + " бежит по земле");
    }
}
