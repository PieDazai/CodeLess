package PC.display;

public class Display {
    private double Diagonal;
    private TypeDisplay typeDisplay;
    private double weigth;

    public double getDiagonal() {
        return Diagonal;
    }

    public void setDiagonal(double diagonal) {
        Diagonal = diagonal;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public TypeDisplay getTypeDisplay() {
        return typeDisplay;
    }

    public void setTypeDisplay(TypeDisplay typeDisplay) {
        this.typeDisplay = typeDisplay;
    }

    public Display(double diagonal, double weigth, TypeDisplay typeDisplay) {
        Diagonal = diagonal;
        this.weigth = weigth;
        this.typeDisplay = typeDisplay;
    }

    @Override
    public String toString() {
        return "Display{" +
                "Diagonal=" + Diagonal +
                ", typeDisplay=" + typeDisplay +
                ", weigth=" + weigth +
                '}';
    }
}
