/**
 * Created by 17isenseed on 10/27/2016.
 */
import java.util.Scanner;
import java.io.*;

public class Puddle {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("puddle.dat"));
        int size = Integer.parseInt(in.nextLine());

        while(size-- > 0) {
            System.out.println();
        }
    }
}
