/**
 * Created by 17isenseed on 10/27/2016.
 */
import java.util.Scanner;
import java.io.*;

public class Puddle {
    public static String[][] matrix;

    public static void bop(int[] c) {
        int x = c[0]; int xLen = matrix.length;
        int y = c[1]; int yLen = matrix[0].length;
        if(matrix[x][y].equals("W")) {
            matrix[x][y] = "F";
            if(x!=0 && y!=0) {
                int[] a = new int[]{x - 1, y - 1};
                bop(a);
            }
            if(x!=xLen-1 && y!=yLen-1) {
                int[] a = new int[]{x + 1, y + 1};
                bop(a);
            }
            if(x!=xLen-1) {
                int[] a = new int[]{x + 1, y};
                bop(a);
            }
            if(x!=0) {
                int[] a = new int[]{x - 1, y};
                bop(a);
            }
            if(y!=yLen-1) {
                int[] a = new int[]{x, y + 1};
                bop(a);
            }
            if(y!=0) {
                int[] a = new int[]{x, y - 1};
                bop(a);
            }
            if(x!=0 && y!=yLen-1) {
                int[] a = new int[]{x - 1, y + 1};
                bop(a);
            }
            if(x!=xLen-1 && y!=0) {
                int[] a = new int[]{x + 1, y - 1};
                bop(a);
            }
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
        int sets = Integer.parseInt(in.nextLine());
        while(sets-- > 0) {
            String[] s = in.nextLine().split(" ");
            int[] cord = new int[] {Integer.parseInt(s[0]), Integer.parseInt(s[1])};
            if(matrix[cord[0]][cord[1]].equals("W")) {
                System.out.println("PUDDLE");
            }
            else if(matrix[cord[0]][cord[1]].equals("G")) {
                System.out.println("OK");
            }
            else if(matrix[cord[0]][cord[1]].equals("R") || matrix[cord[0]][cord[1]].equals("S")) {
                System.out.println("OOPS");
            }
            bop(cord);
        }
        System.out.println();
        for(int i = 0; i < r; i++) { //matrix creation
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}