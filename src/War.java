import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class War {
    int playerOneCards = 0;
    int playerTwoCards = 0;

	public static String val(String card1, String card2) { //returns true if card1 is greater than card2
		if(card1.equals(card2))
			return "both equal.";
		if (card1.equals("A"))
			return card1;
		if (card2.equals("A"))
			return card1;
		if (card1.equals("K"))
			return card1;
		if (card2.equals("K"))
			return card2;
		if (card1.equals("Q"))
			return card1;
		if (card2.equals("Q"))
			return card2;
		if (card1.equals("J"))
			return card1;
		if (card2.equals("J"))
			return card2;
		if (Integer.parseInt(card1) > Integer.parseInt(card2))
			return card1;
		else
			return card2;
	}
	
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("war.dat"));
		int sets = Integer.parseInt(in.nextLine());
        int playerOneCards = 0;
        int playerTwoCards = 0;
		
		while (sets-- > 0) {
			String[] playerOne = in.nextLine().split(" ");
			String[] playerTwo = in.nextLine().split(" ");
            playerOneCards = 15;
            playerTwoCards = 15;
			int i = 0;

			while(i < 14) { //is 14 not being run???
				if(val(playerOne[i], playerTwo[i]).equals(playerOne[i])) { //have to make method that simulates a War
                    playerOneCards++;
                    playerTwoCards--;
                    i++;
				}
				else if(val(playerOne[i], playerTwo[i]).equals("both equal.")) { //if a tie !!! comparing isn't working right
                    i = i + 4;
                    //i = i + 3;
					if(val(playerOne[i], playerTwo[i]).equals(playerOne[i])) {
						//been using += 4
                        playerOneCards += 5;
						playerTwoCards -= 5;
					}
					else {
						playerTwoCards += 5;
						playerOneCards -= 5;
					}
                }
                if(val(playerOne[i], playerTwo[i]).equals(playerTwo[i])){
                    playerTwoCards++;
                    playerOneCards--;
                    i++;
                }
			}
			System.out.println(playerOneCards + " " + playerTwoCards);
		}
		in.close();
	}
}