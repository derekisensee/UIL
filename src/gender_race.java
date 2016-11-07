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
        String[][] females = new String[femaleCount][3];
        for (int i = 0; i < femaleCount; i++) {
            if (racers[i][2].equals("F"))
                females[i] = racers[i];
        }
        for (int i = 0; i < females[0].length; i++) {
            System.out.println(females[i][0]);
        }
        //String[][] males = new String[][];
        while (sets-- > 0) {

        }
    }
}