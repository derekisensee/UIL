/**
 * Created by 17isenseed on 10/27/2016.
 */
import java.util.Scanner;
import java.io.*;

public class Puddle {
    public static void bop(String[][] m, int[] c) {
        if(m[c[0]][c[1]].equals("G"))
            System.out.println("OK");
        else if(m[c[0]][c[1]].equals("R") || m[c[0]][c[1]].equals("S"))
            System.out.println("OOPS");
        else
            bop()
            //recursion
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("puddle.dat"));

        String[] gameBoard = in.nextLine().split(" ");
        int r = Integer.parseInt(gameBoard[1]); int c = Integer.parseInt(gameBoard[0]); //rows and columns
        String[][] matrix = new String[r][c];

        for(int i = 0; i < r; i++) { //matrix creation
            String[] row = in.nextLine().split("");
            for (int j = 0; j < row.length; j++) {
                matrix[i][j] = row[j];
            }
        }
        //////////////////
        int sets = Integer.parseInt(in.nextLine());
        while(sets-- > 0) {
            String[] s = in.nextLine().split(" ");
            int[] cord = new int[] {Integer.parseInt(s[0]), Integer.parseInt(s[1])};
            bop(matrix, cord);
        }
    }
}