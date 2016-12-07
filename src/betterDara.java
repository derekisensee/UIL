/**
 * Created by isenseed on 12/6/2016.
 */
import java.util.*;
import java.io.*;
public class betterDara {
    static String termDeriv(String p) {
        System.out.println(p);
        return "";
    }

    static String derivOf(String p) {
        String deriv = "";
        System.out.println("orig: " + p);
        String[] polySplit = p.split("\\s\\+|\\s-");
        String[] signSplit = p.split("[^+|-]+");

        if (polySplit.length > 1) {
            if (signSplit[0].equals("-")) {
                for (int i = 0; i < polySplit.length; i++) {
                    if (i == 0)
                        System.out.print(polySplit[i]);
                    else
                        System.out.print(signSplit[i] + polySplit[i]);
                }
            }
            else
                for (int i = 0; i < polySplit.length; i++) {
                    System.out.print(signSplit[i] + polySplit[i]);
                }
        }
        else {
            for (int i = 0; i < polySplit.length; i++) {
                System.out.print(polySplit[i]);
            }
        }
        System.out.println();
        System.out.println();
        return deriv;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("dara.dat"));
        while(in.hasNext()) {
            String poly = in.nextLine();
            derivOf(poly.trim());
            //System.out.println(derivOf(poly) + " : " + derivOf(derivOf(poly)));
        }
    }
}