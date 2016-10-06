import java.io.*;
import java.util.Scanner;

public class Speed {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("speed.dat"));
		int sets = Integer.parseInt(in.nextLine());
		
		while(sets-- > 0) {
			System.out.printf("%.1f\n", Integer.parseInt(in.nextLine())/5.0);
		}

	}

}
