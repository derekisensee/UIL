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
        for (int i = 0; i < 100; i++) { //separates table into a single-lettered table and a double-lettered table
            if (table.get(i).length() == 1)
                tableSingle.add(table.get(i));
            else
                tableDouble.add(table.get(i));
        }
        in.nextLine();
        int sets = Integer.parseInt(in.nextLine());
        while (sets-- > 0) {
            String[] word = in.nextLine().split("");
            for (int i = 0; i < word.length; i++) {
                for (int j = 0; j < tableSingle.size(); j++) {
                    if (tableSingle.get(j).equalsIgnoreCase(word[i])) {
                        System.out.println(tableSingle.get(j) + " " + word[i]);
                        break;
                    }
                    else {
                        for (int k = 0; k < tableDouble.size(); k++) {
                            //if (i != word.length-1)
                            String comp = word[i] + word[i + 1]; //because i isn't being incremented, the same stuff is being constantly compared
                            System.out.println(comp);
                            if (i != word.length - 1 && tableDouble.get(k).equalsIgnoreCase(word[i] + word[i + 1])) {
                                System.out.println("------------\nCOMPARED WORDS:\n" + tableDouble.get(k) + " AND " + word[i]+word[i+1] + " " + k + "\n---------------");
                                System.out.println(tableDouble.get(k) + " " + word[i] + word[i + 1]);
                                break; //this doensn't seem to be working
                            }
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}