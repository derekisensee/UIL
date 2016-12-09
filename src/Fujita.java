/**
 * Created by isenseed on 12/9/2016.
 */
import java.math.BigInteger;
import java.util.Scanner;
import java.io.*;
public class Fujita {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("fujita.dat"));
        while (in.hasNext()) {
            String[] set = in.nextLine().split(" ");
            BigInteger val = new BigInteger(set[0]);
            int base = Integer.parseInt(set[1]);
            System.out.println(Math.log(base));
        }
    }
}
