/**
 * Created by 17isenseed on 10/27/2016.
 */
import java.util.Scanner;
import java.io.*;

public class Puddle {
    public static String[][] matrix;

    public static void bop(int[] c) {
        if(matrix[c[0]][c[1]].equals("G"))
            System.out.println("OK");
        else if(matrix[c[0]][c[1]].equals("R") || matrix[c[0]][c[1]].equals("S"))
            System.out.println("OOPS");
        else {
            matrix[c[0]][c[1]] = "F"; //just have to make all surrounding W tile become F
            System.out.println("PUDDLE");
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("puddle.dat"));

        String[] gameBoard = in.nextLine().split(" ");
        int r = Integer.parseInt(gameBoard[1]); int c = Integer.parseInt(gameBoard[0]); //rows and columns
        matrix = new String[r][c];

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
            bop(cord);
        }
        for(int i = 0; i < r; i++) { //matrix creation
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}