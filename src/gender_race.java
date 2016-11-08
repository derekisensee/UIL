import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by isenseed on 11/7/2016.
 */
public class gender_race {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("gender_race.dat"));
        int sets = Integer.parseInt(in.nextLine()); //amount of sets
        String[][] racers = new String[sets][3];
        for (int i = 0; i < sets; i++) {
            racers[i] = in.nextLine().split(" ");
        }
        int maleCount = 0;
        int femaleCount = 0;
        for (int i = 0; i < racers.length; i++) {
            if (racers[i][2].equals("F"))
                femaleCount++;
            else
                maleCount++;
        }
        int currBest = Integer.MAX_VALUE;
        String[][] bestRacer = new String[1][3];
        String[][] secondBest = new String[1][3];
        for (int i = 0; i < racers.length; i++) {
            if (Integer.parseInt(racers[i][1]) < currBest) { // overall winner
                currBest = Integer.parseInt(racers[i][1]);
                bestRacer[0] = racers[i];
            }
            if (Integer.parseInt(racers[i][1]) > currBest) { // second winner, this wouldn't work correctly with other data sets
                secondBest[0] = racers[i];
            }
        }
        System.out.println(bestRacer[0][0]);
        System.out.println(secondBest[0][0]);
        //String[][] males = new String[][];
        while (sets-- > 0) {

        }
    }
}