package OOP;

public abstract class Animals { //абстрактный класс. нельяз создавать объекты класса,
    // есть контракты
    private double weigth;
    private int age;
    private String name;

    public void walk(){
        System.out.println("Животное идет по земле");
    }

    public Animals() {
    }

    public Animals(double weigth, int age, String name) {
        this.weigth = weigth;
        this.age = age;
        this.name = name;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void move();
}


