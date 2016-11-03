import java.io.*;
import java.util.*;

public class botSavesPrincess {
    static void displayPathtoPrincess(int n, String [] grid) {
        Stack s = new Stack();
        for (int i = 0; i < n; i++) { // initial stack creation
            String[] sp = grid[i].split("");
            for (int j = 0; j < sp.length; j++) {
                s.push(sp[j]);
            }
        }
        int[] prin = new int[2];
        int[] bot = new int[2];

        String[][] divided = new String[n][n]; int inc = 0;
        for (int i = 0; i < s.size()/n; i++) {
            for (int j = 0; j < n; j++) {
                divided[i][j] = (String)s.get(inc);
                inc++;
            }
        }
        for (int i = 0; i < divided.length; i++) {
            for (int j = 0; j < n; j++) {
                if (divided[i][j].equals("p")) {
                    prin[0] = j;
                    prin[1] = i;
                }
                if (divided[i][j].equals("m")) {
                    bot[0] = j;
                    bot[1] = i;
                }
            }
        }
        for (int i = 0; i < bot[1] - prin[1]; i++) {
            System.out.println("UP");
        }
        for (int i = 0; i < prin[1] - bot[1]; i++) {
            System.out.println("DOWN");
        }
        for (int i = 0; i < bot[0] - prin[0]; i++) {
            System.out.println("LEFT");
        }
        for (int i = 0; i < prin[0] - bot[0]; i++) {
            System.out.println("RIGHT");
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("botsavesprincess.dat"));
        int m = Integer.parseInt(in.nextLine());
        String grid[] = new String[m];
        for(int i = 0; i < m; i++) {
            grid[i] = in.next();
        }
        displayPathtoPrincess(m, grid);
    }
}