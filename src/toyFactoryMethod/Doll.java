package toyFactoryMethod;

public class Doll extends Gift{

    private String name;

    public Doll(double price, String name) {
        super(price);
        this.name = name;
    }

    @Override
    public void prepare() {
        System.out.printf("Doll is created named %s and costs %.2f$.%n", this.name, super.getPrice());
    }
}
