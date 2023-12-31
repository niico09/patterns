package structural.composite;

public class Main {
    public static void main(String[] args) {

        var singleFile = new SingleFile("file1");
        var singleFile2 = new SingleFile("file2");
        var singleFile3 = new SingleFile("file3");

        var directory = new Directory("directory1");
        directory.add(singleFile);
        directory.add(singleFile2);
        directory.add(singleFile3);

        var directory2 = new Directory("directory2");
        directory2.add(directory);

        directory2.print();
    }
}
