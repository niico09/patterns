package creational.prototype;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }

    @Override
    public Shape clone() throws CloneNotSupportedException {
        return (Circle) super.clone();
    }
}
