import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by Benjamin Ehlers on 12/23/2018.
 */
public class DiceTest {

    public static void main(String[] args) {
        System.out.println(args[0]);
        Scanner scan = new Scanner(args[0]).useDelimiter("d");
        int numDice = scan.nextInt();
        int numSides = scan.nextInt();

        Random rand = new Random();
        Dice dice = new Dice(numSides, rand);

        ArrayList<Integer> rolls = new ArrayList<>();
        for(int i = 0; i < numDice; i++) {
            rolls.add(dice.roll());
        }

        int sum = 0;

        for(int i = 0; i < rolls.size(); i++) {
            sum+= rolls.get(i);
        }

        int sumLength = (sum + "").length();
        System.out.format("%"+sumLength+"d:", sum);
        for(int i = 0; i < rolls.size(); i++) {
            int rollLength = (rolls.get(i) + "").length() + 1;
            System.out.format("%"+rollLength+"d", rolls.get(i));
        }
    }
}
