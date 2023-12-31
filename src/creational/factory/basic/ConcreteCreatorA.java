package creational.factory.basic;

public class ConcreteCreatorA implements Creator {

    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
