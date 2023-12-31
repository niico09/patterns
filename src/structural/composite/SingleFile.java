package structural.composite;

public class SingleFile implements File{
    private String name;

    public SingleFile(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("File: " + name);
    }
}
