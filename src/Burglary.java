import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
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
                DecimalFormat f = new DecimalFormat("####0.00"); //formats to 2 decimal places
                Double toRound = (1 - (i * .05)) * currMoneyTot;
                expectedVals.add(Double.parseDouble(f.format(toRound)));
            }
            ArrayList<Double> sortedExpectedVals = (ArrayList<Double>)expectedVals.clone();
            /*
            So with the above sortedExpectedVals declaration, you can't do "ArrayList<Double> sortedExpectedVals = expectedVals;"
            because when you try to get the index of the "expectedVals.indexOf(highest)", it gets the index from sortedExpectedVals,
            which will always return the highest index (sometimes).
             */
            Collections.sort(sortedExpectedVals);
            Double highest = sortedExpectedVals.get(sortedExpectedVals.size() - 1);
            int index = expectedVals.indexOf(highest);
            System.out.print(index + " ");
            System.out.printf("%.2f\n", highest);
        }
    }
}