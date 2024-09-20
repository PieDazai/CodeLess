package PC.Keyboard;

public class Keyboard {
    private TypeKey typeKey;
    private Ligths ligths;
    private double weigth ;

    public TypeKey getTypeKey() {
        return typeKey;
    }

    public void setTypeKey(TypeKey typeKey) {
        this.typeKey = typeKey;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public Ligths getLigths() {
        return ligths;
    }

    public void setLigths(Ligths ligths) {
        this.ligths = ligths;
    }

    public Keyboard(TypeKey typeKey, Ligths ligths, double weigth) {
        this.typeKey = typeKey;
        this.ligths = ligths;
        this.weigth = weigth;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "typeKey=" + typeKey +
                ", ligths=" + ligths +
                ", weigth=" + weigth +
                '}';
    }
}
