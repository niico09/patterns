package creational.factory.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Mage implements Character{

    Logger logger = Logger.getLogger(getClass().getName());

    @Override
    public void displayInfo(int lvl, int hp, int mp) {
        logger.log(Level.INFO,"I'm an mage lvl " + lvl + " hp: " + hp + " mp: " + mp);
    }
}
