import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class War {
	//int[] set = [2];
	
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
		
		while (sets-- > 0) {
			String[] playerOne = in.nextLine().split(" ");
			String[] playerTwo = in.nextLine().split(" ");
			
			for(int i = 0; i < 14; i++) {
				System.out.println(val(playerOne[i], playerTwo[i]));
			}
			System.out.println();
		}
	}

}
