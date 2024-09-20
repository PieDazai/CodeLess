package PC.Memory;

public class Memory {
    private TypeMemory typeMemory;
    private double VolMemory;

    public Memory(TypeMemory typeMemory, double volMemory, double weigth) {
        this.typeMemory = typeMemory;
        VolMemory = volMemory;
        this.weigth = weigth;
    }

    public TypeMemory getTypeMemory() {
        return typeMemory;
    }

    public void setTypeMemory(TypeMemory typeMemory) {
        this.typeMemory = typeMemory;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public double getVolMemory() {
        return VolMemory;
    }

    public void setVolMemory(double volMemory) {
        VolMemory = volMemory;
    }

    private double weigth;

    @Override
    public String toString() {
        return "Memory{" +
                "typeMemory=" + typeMemory +
                ", VolMemory=" + VolMemory +
                ", weigth=" + weigth +
                '}';
    }
}
