package behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("Hello");
        list.add("World");
        list.add("!");

        MyIterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
