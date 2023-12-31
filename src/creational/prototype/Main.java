package creational.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        var circle = new Circle();
        var square = new Square();

        circle.draw();
        square.draw();

        var circleClone = circle.clone();
        var squareClone = square.clone();

        circleClone.draw();
        squareClone.draw();
    }
}
