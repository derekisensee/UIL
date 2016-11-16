import java.util.*;
import java.io.*;

/**
 * Created by isenseed on 11/16/2016.
 */
public class Paint {
    static void vert() {

    }
    static void horz() {

    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("paint.dat"));
        int sets = Integer.parseInt(in.nextLine());
        while (sets-- > 0) {
            int r = in.nextInt();
            int c = in.nextInt();
            in.nextLine();
            String[][] paper = new String[r][c];
            for (int i = 0; i < r; i++) {
                String[] temp = in.nextLine().split("");
                for (int j = 0; j < c; j++) {
                    paper[i][j] = temp[j];
                }
            }
            in.nextLine(); // have every grid in a 2d array now

        }
    }
}