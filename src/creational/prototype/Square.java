package creational.prototype;

public class Square implements Shape{

        @Override
        public void draw() {
            System.out.println("Drawing square");
        }

        @Override
        public Shape clone() throws CloneNotSupportedException {
            return (Square) super.clone();
        }
}
