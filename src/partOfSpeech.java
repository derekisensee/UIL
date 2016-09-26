import java.io.*;
import java.util.Scanner;

public class partOfSpeech {	
	public static void main(String[] args) throws IOException {
		File inFile = new File ("src/partOfSpeech.dat");
		Scanner scan = new Scanner(inFile); //the partOfSpeech text
		String nounWords = scan.nextLine();
		String verbWords = scan.nextLine() + scan.nextLine();
		int dataSets = Integer.parseInt(scan.nextLine());
		String toSearch = scan.next(); //make this an array of toSearch things?
		
		for (int i = 0; i < dataSets; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(toSearch);
			}
		}
		
		System.out.println(dataSets);
		
		/*while (scan.hasNextLine()) {
			String line= scan.nextLine();
			System.out.println(line);
		} */
		scan.close();
		//String[] helpingVerbs = new String[0];
	}
}