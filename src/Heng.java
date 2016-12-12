/**
 * Created by isenseed on 12/12/2016.
 */
import java.util.*;
import java.io.*;
public class Heng {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("heng.dat"));
        while (in.hasNext()) {
            String[] i = in.nextLine().split(" ");

            String valString = i[0];
            int bigDaddy = Integer.parseInt(valString, 16); // the value from hex > decimal
            valString = Integer.toBinaryString(bigDaddy); // decimal > binary

            String keyString = i[1];
            int key = Integer.parseInt(keyString, 16); // key from hex > decimal
            keyString = Integer.toBinaryString(key); // key from decimal > binary



            System.out.println(valString + " : " + keyString);
        }
    }

    public static void crc(String v, String k) {

        if (v.length() < k.length()) {
            System.out.println(v);
        }
        else {
            String part = v.substring(0, k.length());
            String result = "";
            do {

            } while (result.length() == part.length());
        }

    }
}
