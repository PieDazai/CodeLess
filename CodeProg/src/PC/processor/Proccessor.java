package PC.processor;

public class Proccessor {
    private Creator creator;
    private double khz ;
    private double weigth;
    private int coreCount;

    public Creator getCreator() {
        return creator;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    public int getCoreCount() {
        return coreCount;
    }

    public void setCoreCount(int coreCount) {
        this.coreCount = coreCount;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public double getKhz() {
        return khz;
    }

    public void setKhz(double khz) {
        this.khz = khz;
    }

    public Proccessor(Creator creator, int coreCount, double weigth, double khz) {
        this.creator = creator;
        this.coreCount = coreCount;
        this.weigth = weigth;
        this.khz = khz;
    }

    @Override
    public String toString() {
        return "Proccessor{" +
                "creator=" + creator +
                ", khz=" + khz +
                ", weigth=" + weigth +
                ", coreCount=" + coreCount +
                '}';
    }
}
