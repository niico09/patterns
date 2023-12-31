package creational.factory.example;

public class WarriorCreator implements CharacterCreator {

    @Override
    public Character createCharacter() {
        return new Warrior();
    }
}
