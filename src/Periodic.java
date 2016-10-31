/**
 * Created by isenseed on 10/31/2016.
 */
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Periodic {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("periodic.dat"));
        ArrayList<String> table = new ArrayList(100);
        for (int i = 0; i < 100; i++) {
            table.add(in.next());
        }
        Collections.sort(table);
        ArrayList<String> tableSingle = new ArrayList();
        ArrayList<String> tableDouble = new ArrayList();
        for (int i = 0; i < 100; i++) {
            if (table.get(i).length() == 1)
                tableSingle.add(table.get(i));
            else
                tableDouble.add(table.get(i));
        }
        System.out.println(tableSingle);
        System.out.println(tableDouble);
    }
}
