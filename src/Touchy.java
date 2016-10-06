import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Touchy {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("touchy.dat"));
		int sets = Integer.parseInt(in.nextLine());
		
		while(sets-- > 0) {
			String[] line = in.nextLine().split(" "); //make sure this is working
			
		}

	}

}
