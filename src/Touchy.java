import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Touchy {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("touchy.dat"));
		int sets = Integer.parseInt(in.nextLine().trim());
		
		while (sets-- > 0) {
			String[] line = in.nextLine().split(" ");
			int firstSetting = Integer.parseInt(line[0]);
			int touchTimes = Integer.parseInt(line[1]);
			
			System.out.println((firstSetting + touchTimes) % 4);
		}
		in.close();

	}

}
