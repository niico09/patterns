package creational.factory.example;

public class ArcherCreator implements CharacterCreator{

            @Override
            public Character createCharacter() {
                return new Archer();
            }
}
