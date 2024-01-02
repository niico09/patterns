package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class MyList <T>
{
    private List<T> elements = new ArrayList<>();

    public void add(T element) {
        elements.add(element);
    }

    public MyIterator<T> iterator() {
        return new ListIterator<>(elements);
    }
}
