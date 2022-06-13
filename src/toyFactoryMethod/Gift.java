package toyFactoryMethod;

public abstract class Gift{
    private double price;

    public Gift(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void prepare();
}
