import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by isenseed on 11/9/2016.
 */
public class GeneralFib {
    static int fib(int x, int y, int a, int b, int n) {
        if (n == 1)
            return x;
        if (n == 2)
            return y;
        else
            return a * fib(x, y, a, b, n - 1) + b * (fib(x, y, a, b, n -2));
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("generalfib.dat"));
        int sets = Integer.parseInt(in.nextLine());
        while (sets-- > 0) {
            int x = in.nextInt();
            int y = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            System.out.println(fib(x, y, a, b, n));
        }
    }
}