import java.util.*;
import java.io.*;
/**
 * Created by derek the ill on 11/15/2016.
 */
public class Square {
    static boolean squareCheck(int i) {
        int limit = (int)Math.floor(Math.sqrt(i));
        int sum = 0;
        for (int j = 1; j <= limit; j++) {
            for (int k = j; k <= limit; k++) {
                sum += (int)Math.pow(k, 2);
                if (sum == i)
                    return true;
            }
            if (sum == i)
                return true;
            sum = 0;
        }
        return false;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("square.dat"));
        while (in.hasNext()) {
            int val = in.nextInt();
            StringBuilder s = new StringBuilder(Integer.toString(val)).reverse();
            if (Integer.toString(val).equals(s.toString())) {
                if (squareCheck(val))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            else
                System.out.println("NO");
        }
    }
}