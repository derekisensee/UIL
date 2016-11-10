import java.io.*;
import java.util.*;

public class ImageFlip {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("imageflip.dat"));
        int cases = Integer.parseInt(in.nextLine());
        while (cases-- > 0) {
            String[] data = in.nextLine().trim().split(" ");
            int height = Integer.parseInt(data[0]);
            int width = Integer.parseInt(data[1]);
            String flip = data[2];
            String[][] matrix = new String[height][width];
            for (int i = 0; i < height; i++) { //matrix creation
                String[] curr = in.nextLine().split("");
                for (int j = 0; j < width; j++) {
                    matrix[i][j] = curr[j];
                }
            }
            if (data[2].equals("H")) {
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = width - 1; j >= 0; j--) {
                        System.out.print(matrix[i][j]);
                    }
                    System.out.println();
                }
            }
            else {
                for (int i = height - 1; i >= 0; i--) {
                    for (int j = 0; j < matrix[0].length; j++) {
                        System.out.print(matrix[i][j]);
                    }
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
}