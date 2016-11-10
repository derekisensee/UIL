import java.io.*;
import java.util.*;

public class ImageFlip {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("imageflip.dat"));
        int cases = in.nextInt();
        while (cases-- > 0) {
            String[] data = in.nextLine().split(" ");
            int height = Integer.parseInt(data[0]);
            int width = Integer.parseInt(data[1]);
            String flip = data[2];
            String[][] matrix = new String[height][width];
            if (flip.equals("H")) {
                for (int i = 0; i < height; i++) {
                    String[] curr = in.nextLine().split("");
                    for (int j = 0; j < width; j++) {
                        matrix[i][j] = curr[j];
                    }
                }
            }
            for (int i = 0; i < height; i++) {
                String[] curr = in.nextLine().split("");
                for (int j = 0; j < width; j++) {
                    System.out.println(matrix[i][j]);
                }
            }
        }
    }
}