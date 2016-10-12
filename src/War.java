import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class War {
	int[] arr = new int[11];
	
	public boolean val(String cardOne, String cardTwo) { //figure out what to return
		if (cardOne.equals("J") || cardTwo.equals("J") || cardOne.equals("Q") || cardTwo.equals("Q")|| cardOne.equals("K") || cardTwo.equals("K") || cardOne.equals("A") || cardTwo.equals("A")) {
			
		}
		else {
			if (Integer.parseInt(cardOne) > Integer.parseInt(cardTwo)) {
				
			}
		}
		return false;
	}
	
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("war.dat"));
		int sets = Integer.parseInt(in.nextLine());
		
		while (sets-- > 0) {
			String[] deckOne = in.nextLine().split(" ");
			String[] deckTwo = in.nextLine().split(" ");
			
			
		}
		in.close();
	}

}