package OOPSinJAVA.Inheritance;

public class BoxPrice  extends BoxWeight{
      double cost;

    public BoxPrice(double cost) {
        this.cost = cost;
    }

    public BoxPrice(int weight, double cost) {
        super(weight);
        this.cost = cost;
    }

    public BoxPrice(Box other, double weight, double cost) {
        super(other, weight);
        this.cost = cost;
    }

    public BoxPrice(double l, double w, double h, int weight, double cost) {
        super(l, w, h, weight);
        this.cost = cost;
    }
}
