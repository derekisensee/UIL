/**
 * Created by isenseed on 12/12/2016.
 */
import java.util.*;
import java.io.*;
public class Heng {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("heng.dat"));
        while (in.hasNext()) {
            String[] i = in.nextLine().split(" ");

            String valString = i[0];
            int val = Integer.parseInt(valString, 16);
            valString = Integer.toBinaryString(val);

            String keyString = i[1];
            int key = Integer.parseInt(keyString, 16);
            keyString = Integer.toBinaryString(key);
            int d = val ^ key;
            for (int j = 0; j < keyString.length() - 1; j++) {
                d = d ^ key;
            }
            String divided = Integer.toBinaryString((val ^ key));
            System.out.println(valString + " : " + keyString);
            System.out.println(d);
        }
    }
}
