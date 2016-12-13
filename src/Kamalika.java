import java.io.*;
import java.util.*;

/**
 * Created by isenseed on 12/13/2016.
 */
public class Kamalika {
    public static void main(String[] args) throws FileNotFoundException {
        java.util.Scanner in = new java.util.Scanner(new File("kamalika.dat")); // haha who needs another line
        while (in.hasNext()) {
            String[] currLine = in.nextLine().split(" ");
            double a = Double.parseDouble(currLine[0]);
            double b = Double.parseDouble(currLine[1]);

            double sum = a + b;
            double diff = a - b;
            double prod = a * b;
            double mod = a % b;
            double quot = a / b;
            double pow = Math.pow(a, b);
            double revPow = Math.pow(b, a);
            ArrayList<Double> arr = new ArrayList<Double>();
            arr.add(sum);
            arr.add(diff);
            arr.add(prod);
            arr.add(mod);
            arr.add(quot);
            arr.add(pow);
            arr.add(revPow);
            //System.out.println(arr);
            Collections.sort(arr);
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) == sum) {
                    System.out.printf("|Sum %.2f|", arr.get(i));
                }
                else if (arr.get(i) == diff) {
                    System.out.printf("|Dif %.2f|", arr.get(i));
                }
                else if (arr.get(i) == prod) {
                    System.out.printf("|Prd %.2f|", arr.get(i));
                }
                else if (arr.get(i) == mod) {
                    System.out.printf("|Mod %.2f|", arr.get(i));
                }
                else if (arr.get(i) == quot) {
                    System.out.printf("|Div %.2f|", arr.get(i));
                }
                else if (arr.get(i) == pow) {
                    System.out.printf("|A^B %.2f|", arr.get(i));
                }
                else if (arr.get(i) == revPow) {
                    System.out.printf("|B^A %.2f|", arr.get(i));
                }
            }
            System.out.println();
        }
    }
}
