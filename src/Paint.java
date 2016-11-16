import java.util.*;
import java.io.*;

/**
 * Created by isenseed on 11/16/2016.
 */
public class Paint {

    static void vert(String[][] pap) {

    }
    static void horz(String[][] pap) {
        int midIndex = pap[0].length / 2;
        System.out.println(midIndex);
        for (int i = 0; i < pap[0].length; i++) {
            if (i < midIndex) {
                int distance = midIndex - i;
                int newIndex = distance + i; //can condense this to one line
            }
            else if (i > midIndex) {
                int distance = i - midIndex;
            }
        }
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
            horz(paper);
            in.nextLine(); // have every grid in a 2d array now

        }
    }
}