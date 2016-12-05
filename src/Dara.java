import java.util.Scanner;
import java.io.*;
public class Dara {
    static String derivOf(String[] p) {
        String deriv = "";
        for (int i = 0; i < p.length; i++) {
            if (p[i].length() == 1 && p[i].matches("[X0-9]")) {
                if (p[i].equals("X"))
                    deriv += "1";
                else if (p.length == 1)
                    deriv = "0";
            } else if (!(p[i].equals("-")) && !(p[i].equals("+"))) {
                String[] brokenDown = p[i].split("");
                String firstTermString = "";
                for (int j = 0; j < brokenDown.length; j++) {
                    if (brokenDown[j].equals("X")) {
                        break;
                    } else
                        firstTermString += brokenDown[j];
                }
                int firstTerm;
                if (!(firstTermString.equals("")))
                    firstTerm = Integer.parseInt(firstTermString);
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
                    deriv += (firstTerm * power) + "X^" + (power - 1);
                }
            }
            if (p[i].equals("-") || p[i].equals("+") /*&& !(i == p.length - 2)*/) {
                deriv += " " + p[i] + " ";
            }
        }
        return deriv;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("dara.dat"));
        while(in.hasNext()) {
            String[] poly = in.nextLine().split(" ");
            System.out.println(derivOf(poly) + " : " + derivOf(derivOf(poly).split(" ")));
        }
    }
}