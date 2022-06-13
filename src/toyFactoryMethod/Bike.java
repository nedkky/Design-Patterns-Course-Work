package toyFactoryMethod;

public class Bike extends Gift{

    public Bike(double price) {
        super(price);
    }

    @Override
    public void prepare() {
        System.out.printf("Bike is created and costs %.2f$.%n", super.getPrice());
    }
}
