/**
 * Created by let me in to your hearttttt on 11/16/2016.
 */
import java.util.*;
import java.io.*;
public class Paint {
    static String paper[][];
    static void vert(String[][] pap) {
        for (int i = 0; i < pap.length; i++) {
            for (int j = 0; j < pap[i].length; j++) {
                if (!(pap[i][j].equals("x")))
                    pap[i][j] = pap[pap.length-i - 1][j];
            }
        }
        paper = pap;
    }
    static void horz(String[][] pap) {
        for (int i = 0; i < pap.length; i++) {
            String temp = "";
            for (int j = 0; j < pap[i].length; j++) {
                temp += pap[i][j];
            }
            StringBuilder b = new StringBuilder(temp).reverse();
            String[] a = b.toString().split("");
            for (int j = 0; j < pap[i].length; j++) {
                if (!(pap[i][j].equals("x"))) {
                    pap[i][j] = a[j];
                }
            }
        }
        paper = pap;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("paint.dat"));
        int sets = Integer.parseInt(in.nextLine());
        while (sets-- > 0) {
            int r = in.nextInt();
            int c = in.nextInt();
            in.nextLine();
            paper = new String[r][c];
            for (int i = 0; i < r; i++) {
                String[] temp = in.nextLine().split("");
                for (int j = 0; j < c; j++) {
                    paper[i][j] = temp[j];
                }
            }
            String[] flips = in.nextLine().split("");
            for (int i = 0; i < flips.length; i++) {
                if (flips[i].equals("V")) {
                    vert(paper);
                }
                else
                    horz(paper);
            }
            for (int i = 0; i < paper.length; i++) {
                for (int j = 0; j < paper[i].length; j++) {
                    System.out.print(paper[i][j]);
                }
                System.out.println();
            }
        }
    }
}