import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;
/**
 * Created by isenseed on 10/26/2016.
 */
public class Taxing {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("taxing.dat"));
        int sets = Integer.parseInt(in.nextLine());

        while (sets-- > 0) {
            Double p = Double.parseDouble(in.nextLine());
            System.out.print("$");
            System.out.printf("%.2f%n", p+(p*.0825));
        }
    }
}
