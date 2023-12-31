package creational.factory.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Archer implements Character {

    Logger logger = Logger.getLogger(getClass().getName());

    @Override
    public void displayInfo(int lvl, int hp, int mp) {
        logger.log(Level.INFO,"I'm an archer lvl " + lvl + " hp: " + hp + " mp: " + mp);
    }
}
