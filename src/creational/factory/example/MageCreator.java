package creational.factory.example;

public class MageCreator implements CharacterCreator{

        @Override
        public Character createCharacter() {
            return new Mage();
        }
}
