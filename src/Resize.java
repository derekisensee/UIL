import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Resize
{

	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(new File("resize.dat"));
		int sets = Integer.parseInt(in.nextLine().trim());

		while(sets-- > 0)
		{
			String[] line = in.nextLine().trim().split(" ");
			double startH = Double.parseDouble(line[0]);
			double startW = Double.parseDouble(line[2]);
			double changeH = Double.parseDouble(line[4]);
			double changeW = Double.parseDouble(line[6]);

			double newV = startW * changeH / startH;

			String ans = String.format("%.2f", changeH) + " by " + String.format("%.2f", newV) + " or ";

			newV = startH * changeW / startW;

			ans += String.format("%.2f", newV) + " by " + String.format("%.2f", changeW);

			System.out.println(ans);


		}

	}

}