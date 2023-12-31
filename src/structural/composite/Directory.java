package structural.composite;

import java.util.List;

public class Directory implements File{
    private String name;
    private List<File> files;

    public Directory(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Directory: " + name);
        for (File file : files) {
            file.print();
        }
    }

    public void add(File file) {
        files.add(file);
    }
}
