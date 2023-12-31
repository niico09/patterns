package creational.factory.example;

public class Main {
    public static void main(String[] args) {
        var warriorCreator = new WarriorCreator();
        var mageCreator = new MageCreator();
        var archerCreator = new ArcherCreator();

        var warrior = warriorCreator.createCharacter();
        var mage = mageCreator.createCharacter();
        var archer = archerCreator.createCharacter();

        warrior.displayInfo(5,20,4);
        mage.displayInfo(5,10,30);
        archer.displayInfo(5,15,10);
    }
}
