/**
 * Created by isenseed on 12/6/2016.
 */
import java.util.*;
import java.io.*;
public class betterDara {
    static String derivOf(String p) {
        String deriv = "";
        String[] splitUp = p.split("[\\+|\\-]");
        for (int i = 0; i < splitUp.length; i++) {
            System.out.println(splitUp[i]);
        }
        return deriv;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("dara.dat"));
        while(in.hasNext()) {
            String poly = in.nextLine();
            System.out.println(derivOf(poly) + " : " + derivOf(derivOf(poly)));
        }
    }
}
