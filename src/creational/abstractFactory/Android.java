package creational.abstractFactory;

public class Android implements Phone{

        @Override
        public void makeCall() {
            System.out.println("Making call from Android phone");
        }
}
