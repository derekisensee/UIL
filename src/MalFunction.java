import java.io.*;
import java.util.*;

/**
 * Created by isenseed on 10/26/2016.
 */
public class MalFunction {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("malfunction.dat"));
        int sets = Integer.parseInt(in.nextLine());

        while (sets-- > 0) {
            String[] set = in.nextLine().split(" ");
            int a = Integer.parseInt(set[0]);
            int b = Integer.parseInt(set[1]);
            int c = Integer.parseInt(set[2]);
            double x = Double.parseDouble(set[3]);
            double xSq = Math.pow(x, 2);
            double ans = ((xSq*a)+(b*x)+c);
            System.out.printf("%.3f%n", ans);
        }
    }
}