import java.io.*;
import java.util.*;

public class Solution {
    static void displayPathtoPrincess(int n, String [] grid) {
        Stack s = new Stack();
        for (int i = 0; i < n; i++) { // initial stack creation
            String[] sp = grid[i].split("");
            for (int j = 0; j < sp.length; j++) {
                s.push(sp[j]);
            }
        }
        System.out.println(s);
        int prinStack = s.search("p"); int[] prin = new int[2];
        int botStack = s.search("m"); int[] bot = new int[2];
        System.out.println("prinStack: " + prinStack);
        System.out.println("botStack: " + botStack);
        if (prinStack % n == 0)
            prin[0] = (prinStack % n);
        else
            prin[0] = (prinStack % n-1);
        if (botStack % n == 0)
            bot[0] = (botStack % n);
        else
            bot[0] = (botStack % n-1);
        prin[1] = s.indexOf("p") - n; // prin coords off by 1
        bot[1] = s.indexOf("m") - n;
        System.out.println("prin coord: " + prin[0] + " " + prin[1]);
        System.out.println("bot coord: " + bot[0] + " " + bot[1]);
        System.out.println("size: " + s.size());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < prinStack; j++) {

            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("hackerrank.dat"));
        int m = Integer.parseInt(in.nextLine());
        String grid[] = new String[m];
        for(int i = 0; i < m; i++) {
            grid[i] = in.next();
        }
        displayPathtoPrincess(m, grid);
    }
}