import java.util.*; import java.io.*;
/**
 * Created by derek the ill on 11/15/2016.
 */
public class Square {
    static boolean squareCheck(int i) {
        int limit = (int)Math.floor(Math.sqrt(i));
        int sum = 0;
        for (int j = 1; j <= limit; j++) {
            for (int k = j; k < limit; k++) {
                System.out.println(k + " to the 2 power");
                sum += (int)Math.pow(k, 2);
            }
            System.out.println(sum);
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
            String[] a = Integer.toString(val).split("");
            String[] b = a.clone();
            if (a.length == 1) {
                squareCheck(Integer.parseInt(a[0]));
            }
            else if (a.length == 3) {
                b[0] = a[2];
                b[2] = a[0];
            }
            else {
                b[0] = a[1];
                b[1] = a[0];
            }
            // if arrays are equal
            if (Arrays.equals(a, b)) {
                System.out.println("checking: " + val);
                if (squareCheck(val)) {
                    System.out.println("YES");
                }
                else
                    System.out.println("NO");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}