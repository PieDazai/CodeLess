package PC.HardDisk;

public class HardDisk {
    private double weigth;
    private double volume;
    private HardType hardType;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public HardType getHardType() {
        return hardType;
    }

    public void setHardType(HardType hardType) {
        this.hardType = hardType;
    }

    public HardDisk(double weigth, HardType hardType, double volume) {
        this.weigth = weigth;
        this.hardType = hardType;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "HardDisk{" +
                "weigth=" + weigth +
                ", volume=" + volume +
                ", hardType=" + hardType +
                '}';
    }
}
