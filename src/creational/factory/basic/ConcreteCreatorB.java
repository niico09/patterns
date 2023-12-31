package creational.factory.basic;

public class ConcreteCreatorB implements Creator {

    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
