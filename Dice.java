import java.util.Random;

/**
 * Created by Benjamin Ehlers on 12/23/2018.
 */
public class Dice {

    private Random rand;
    private int sides;

    public Dice(int sides, Random rand) {
        this.sides = sides;
        this.rand = rand;
    }

    public int roll() {
        return rand.nextInt(sides) + 1;
    }

    public int roll(int num) {
        int sum = 0;
        for(int i = 0; i < num; i++) {
            sum+=roll();
        }
        return sum;
    }

}
