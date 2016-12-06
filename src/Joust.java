/**
 * Created by derek_000 on 11/20/2016.
 */
import java.util.*;
import java.io.*;
public class Joust {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("joust.dat"));
        int sets = Integer.parseInt(in.nextLine());
        while (sets-- > 0) {
            int num = Integer.parseInt(in.nextLine());
            Stack s = new Stack();
            for (int i = 0; i < num; i++) {
                s.add(in.nextLine());
            }
            Stack winners = new Stack();
            Stack losers = new Stack();
            int stackSize = s.size();
            for (int i = 0; i < stackSize/2; i++) {
                String[] knightOne = s.pop().toString().split(" ");
                String[] knightTwo = s.pop().toString().split(" ");
                winners.push(Integer.parseInt(knightOne[1]) > Integer.parseInt(knightTwo[1]) ? knightOne[0] + knightOne[1] : knightTwo[0] + knightTwo[1]);
                losers.push(Integer.parseInt(knightOne[1]) < Integer.parseInt(knightTwo[1]) ? knightOne[0] + knightOne[1] : knightTwo[0] + knightTwo[1]);
            }
            System.out.println("------------");
            System.out.println("winner stack: \n" + winners);
            System.out.println("loser stack: \n" + losers);

            int placeCount = 1;
            if (winners.size() < 3) {
                String knightOne = winners.pop().toString();
                String knightTwo = winners.pop().toString();
                int knightOneSkill = Integer.parseInt(knightOne.replaceAll("[^0-9]", ""));
                int knightTwoSkill = Integer.parseInt(knightTwo.replaceAll("[^0-9]", ""));
                String first = knightOneSkill > knightTwoSkill ? knightOne.replaceAll("[0-9]", "") : knightTwo.replaceAll("[0-9]", "");
                String second = knightOneSkill < knightTwoSkill ? knightOne.replaceAll("[0-9]", "") : knightTwo.replaceAll("[0-9]", "");
                System.out.println(placeCount++ + ": " + first + "\n" + placeCount++ + ": " + second);
            } else {
                System.out.println("implement me!");
            }
        }
    }
}
