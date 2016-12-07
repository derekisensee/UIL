/**
 * Created by isenseed on 12/6/2016.
 */
import java.util.*;
import java.io.*;
public class betterDara {
    static String termDeriv(String p) {
        String deriv = "";
        String[] brokenDown = p.split("");
        String firstTermString = "";
        for (int j = 0; j < brokenDown.length; j++) {
            if (brokenDown[j].equals("X")) {
                break;
            } else
                firstTermString += brokenDown[j];
        }
        int firstTerm;
        if (!(firstTermString.trim().equals("")))
            firstTerm = Integer.parseInt(firstTermString.split(" ")[0]);
        else
            firstTerm = 1;
        int power = 0;
        for (int j = 0; j < brokenDown.length; j++) {
            if (brokenDown[j].equals("^")) {
                power = Integer.parseInt(brokenDown[j + 1]);
            }
        }
        if (power == 0)
            deriv += firstTerm;
        else {
            if (power - 1 == 1)
                deriv += (firstTerm * power) + "X";
            else
                deriv += (firstTerm * power) + "X^" + (power - 1);
            deriv += (firstTerm * power) + "X^" + (power - 1);
        }
        return deriv;
    }

    static String derivOf(String p) {
        String deriv = "";
        String[] polySplit = p.split("\\s\\+\\s|\\s-\\s");
        //String[] polySplit = p.split("[^\\dX\\^\\d]");
        String[] signSplit = p.split("[^+|-]+");
        System.out.println("NEW CASE");
        //printing stuff
        System.out.println("======================");
        for (int i = 0; i < signSplit.length; i++) {
            String s = signSplit[i];
            System.out.print(s+"|");
        }
        System.out.println();
        for (int i = 0; i < polySplit.length; i++) {
            String s = polySplit[i];
            System.out.print(s+"|");
        }
        System.out.println("\n======================");

        for (int i = 0; i < polySplit.length; i++) {
            if (polySplit[i].length() == 1) { // case for single constants or single termed equations
                if (polySplit[0].equals("X")) {
                    deriv += "1";
                }
                else if (polySplit[0].matches("\\d")) {
                    deriv += "0";
                }
            }
            else {
                if (signSplit.length > 0) {
                    deriv += termDeriv(polySplit[i] + " " + signSplit[i]);
                    System.out.println("ran");
                }
                else
                    deriv += termDeriv(polySplit[i]);
                }
            }
        return deriv;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("dara.dat"));
        while(in.hasNext()) {
            String poly = in.nextLine();
            System.out.println(derivOf(poly.trim()));
            //System.out.println(derivOf(poly) + " : " + derivOf(derivOf(poly)));
        }
    }
}