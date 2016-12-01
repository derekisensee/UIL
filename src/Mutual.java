import java.util.*; // can you beat 27 lines?
import java.io.*;
public class Mutual {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("mutual.dat"));
        int sets = Integer.parseInt(in.nextLine());
        for (int i = 0; i < sets; i++) {
            int numFriends = Integer.parseInt(in.nextLine());
            String[] firstFriends = new String[numFriends];
            for (int j = 0; j < firstFriends.length; j++)
                firstFriends[j] = in.nextLine();
            numFriends = Integer.parseInt(in.nextLine());
            String[] secondFriends = new String[numFriends];
            for (int j = 0; j < secondFriends.length; j++)
                secondFriends[j] = in.nextLine();
            ArrayList<String> mutual = new ArrayList<>();
            System.out.println("Case " + (i + 1) + ":");
            for (int j = 0; j < firstFriends.length; j++)
                for (int k = 0; k < secondFriends.length; k++)
                    if (firstFriends[j].equals(secondFriends[k]))
                        mutual.add(firstFriends[j]);
            Collections.sort(mutual);
            for (int j = 0; j < mutual.size(); j++)
                System.out.println(mutual.get(j));
        }
    }
}