import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class euluerl {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){ // loops through cases
            int n = in.nextInt();
            double sum = 0;
            sum += (n/2)*((n-1)*3);
            sum += (n/2)*((n-1)*5);
            System.out.println(sum);
        }
    }
}