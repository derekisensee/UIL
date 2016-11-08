import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by isenseed on 11/8/2016.
 */
public class Burglary {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("burglary.dat"));
        int sets = Integer.parseInt(in.nextLine());
        while (sets-- > 0) {
            int rooms = Integer.parseInt(in.nextLine());
            Double[] money = new Double[rooms];
            String[] raw = in.nextLine().split(" "); //this isn't needed after money is created.
            for (int i = 0; i < rooms; i++) { // money array creation
                money[i] = Double.parseDouble(raw[i]);
            }
            ArrayList<Double> expectedVals = new ArrayList<>();
            Double currMoneyTot = 0.0;
            for (int i = 0; i < rooms; i++) {
                currMoneyTot += money[i];
                expectedVals.add(((1 - (i * .05)) * currMoneyTot));
            }
            Collections.sort(expectedVals);
            System.out.println(expectedVals.get(expectedVals.size()-1)); // have to figure out what room to stop in
        }
    }
}
