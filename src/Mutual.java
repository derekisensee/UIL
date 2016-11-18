/**
 * Created by isenseed on 11/18/2016.
 */
import java.util.*;
import java.io.*;
public class Mutual {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("mutual.dat"));
        int sets = Integer.parseInt(in.nextLine());
        for (int i = 0; i < sets; i++) {
            String[] firstFriends;
            String[] secondFriends;
            int numFriends = Integer.parseInt(in.nextLine());
            firstFriends = new String[numFriends];
            for (int j = 0; j < firstFriends.length; j++) {
                firstFriends[j] = in.nextLine();
            }
            numFriends = Integer.parseInt(in.nextLine());
            secondFriends = new String[numFriends];
            for (int j = 0; j < secondFriends.length; j++) {
                secondFriends[j] = in.nextLine();
            }
            System.out.println("Case " + i + ":");
            int len =
            String[] mutual = new String[]
        }
    }
}