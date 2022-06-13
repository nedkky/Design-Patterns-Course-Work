package toyFactoryMethod;

public abstract class GiftFactory {

    public abstract Gift createProduct(String productName);

    public Gift createGift(String productName) {
        Gift product = createProduct(productName);
        product.prepare();
        return product;
    }
}
