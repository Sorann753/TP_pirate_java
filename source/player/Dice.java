package source.player;

import java.security.SecureRandom;
import java.util.Random;

public class Dice {
    private int maxValue = 6;
    private Random generator;

    public Dice(){
        try {
            generator = SecureRandom.getInstanceStrong();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int roll(){
        return generator.nextInt(maxValue);
    }
}
