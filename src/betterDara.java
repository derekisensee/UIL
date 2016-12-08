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
        for (int j = 0; j < brokenDown.length; j++) { // find the power of the term
            if (brokenDown[j].equals("^")) {
                power = Integer.parseInt(brokenDown[j + 1]);
            }
        }
        if (power == 0) // if just an X, i.e. deriv of 5x = 5
            deriv += firstTerm;
        else {
            if (power - 1 == 1) // ex: deriv of 5x^2 = 10x
                deriv += (firstTerm * power) + "X";
            else // ex: deriv of 2x^10 = 20x^9
                deriv += (firstTerm * power) + "X^" + (power - 1);
        }
        return deriv;
    }

    static String derivOf(String p) {
        System.out.println("NEW CASE");
        String deriv = "";
        String[] polySplit = p.split("\\s\\+\\s|\\s-\\s");
        String[] signSplit = p.split("[^+|-]+");
        for (int i = 0; i < polySplit.length; i++) {
            String a = polySplit[i];
            System.out.print(a + "|");
        }
        System.out.println();
        for (int i = 0; i < polySplit.length; i++) {
            if (polySplit[i].length() == 1 || polySplit[i].length() == 2) { // case for single constants or single termed equations
                if (polySplit[0].equals("X")) {
                    deriv += "1";
                }
                else if (polySplit[0].matches("\\d")) {
                    deriv += "0";
                }
            }
            else { // case for everything else
                if (signSplit.length > 0) {
                    if (i == 0) {
                        deriv += termDeriv(polySplit[i]) + " ";
                    }
                    else
                        deriv += signSplit[i] + " " + termDeriv(polySplit[i]) + " ";
                }
                else {
                    deriv += termDeriv(polySplit[i]);
                }
            }
        }
        return deriv;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("dara.dat"));
        while(in.hasNext()) {
            String poly = in.nextLine();
            System.out.println(derivOf(poly.trim()));
            //System.out.println(derivOf(poly.trim()) + " : " + derivOf(derivOf(poly.trim())));
        }
    }
}