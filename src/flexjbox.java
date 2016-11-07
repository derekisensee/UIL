import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by isenseed on 11/7/2016.
 */
public class flexjbox {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("flexjbox.dat"));
        int set = Integer.parseInt(in.nextLine());
        while (set-- > 0) {
            int[] vals = new int[4];
            for (int i = 0; i < 4; i++) {
                vals[i] = in.nextInt();
            }
            String[][] box = new String[vals[0]][vals[1]];
            for (int i = 0; i < vals[0]; i++) {
                for (int j = 0; j < vals[1]; j++) {
                    box[i][j] = "*";
                }
            }
            box[vals[2]][vals[3]] = "J";
            for (int i = 0; i < box.length; i++) {
                for (int j = 0; j < box[0].length; j++) {
                    System.out.print(box[i][j]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}