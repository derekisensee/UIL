/**
 * Created by 17isenseed on 11/4/2016.
 */
import java.util.*;
import java.io.*;
public class conversions {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("conversions.dat"));
        int sets = Integer.parseInt(in.nextLine());
        while (sets-- > 0) {
            double a = (double)in.nextInt();
            double b = (double)in.nextInt();
            double c = (double)in.nextInt();
            double d = (double)in.nextInt();
            System.out.printf("%.2f%n", ((a / 4) + 7 * b));
            System.out.printf("%.2f%n", (((a + (Math.pow(b, 2))) / (a + (1 / b))) + (a / b)));
            System.out.printf("%.2f%n", (1 / ((1 / a) - (1 / b))));
            System.out.printf("%.2f%n", ((4 / (a / b)) * (Math.sqrt(((1 + (5 / (c + d))) / a)))) - (a / (c + d)));
            System.out.println();
        }
    }
}
