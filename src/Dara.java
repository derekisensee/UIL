import java.util.Scanner;
import java.io.*;
public class Dara {
    static String derivOf(String[] p) {
        String deriv = "";
        for (int i = 0; i < p.length; i++) {
            if (p[i].length() == 1 && p[i].matches("[X0-9]")) {
                if (p[i].equals("X"))
                    deriv += "1";
                else
                    deriv += "0";
            }
            else if (p[i].matches("[^\\+|\\-]")){
                deriv += "test";
                /*String[] brokenDown = p[i].split("");
                for (String s :
                    brokenDown) {
                    deriv += s;
                }*/
            }
        }
        return deriv;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("dara.dat"));
        while(in.hasNext()) {
            String[] poly = in.nextLine().split(" ");
            for (String a : poly)
                System.out.print(a + " ");
            System.out.println();
            System.out.println(derivOf(poly));
            System.out.println("---------");
        }
    }
}