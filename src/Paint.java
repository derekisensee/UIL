/**
 * Created by let me in to your hearttttt on 11/16/2016.
 */
import java.util.*;
import java.io.*;
public class Paint {
    static String paper[][];
    static void vert(String[][] pap) { // have to complete this
        String[][] temp = new String[pap.length][pap[0].length];
        int it = pap.length;
        for (int i = 0; i < pap.length; i++) {

        }
        for (int i = 0; i < pap.length; i++) {
            for (int j = 0; j < pap[i].length; j++) {
                System.out.print(temp[i][j]);
            }
            System.out.println();
        }
    }
    static void horz(String[][] pap) {
        int midIndex = pap[0].length / 2;
        System.out.println(midIndex);
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
            vert(paper);
            for (int i = 0; i < paper.length; i++) {
                for (int j = 0; j < paper[i].length; j++) {
                    System.out.print(paper[i][j]);
                }
                System.out.println();
            }
            in.nextLine();
        }
    }
}