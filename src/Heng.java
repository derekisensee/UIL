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

            crc("10011000", "101", "");
            //System.out.println(crc(valString, keyString));
           // System.out.println(valString + " : " + keyString);
        }
    }

    public static void crc(String v, String k, String result) {
        if (v.length() == 0) {
            System.out.println(v); // have to pad with significant zeroes
        }
        else {
           int dif = k.length() - result.length();
           String part  = result + v.substring(0, dif);
           System.out.println("Part: " + part);
           v = v.substring(dif);
           String answer = "";
            do {
                for (int i = 0; i < part.length(); i++) {
                    if (part.charAt(i) != k.charAt(i)) {
                        answer += "1";
                    }
                    else
                        answer += "0";
                }
                int pos = answer.indexOf("1");
                StringBuilder temp = new StringBuilder(answer);
                for (int i = 0; i < pos; i++) {
                   temp.setCharAt(i, '9');
                }
                answer = temp.toString();
                answer = answer.replaceAll("9", "");
            } while (answer.length() == part.length());
            System.out.println(v + " " + answer);
            crc(v, k, answer);

        }
        /*String result = "";

        int[] vArray = new int[v.length()];
        for (int i = 0; i < v.length() - 1; i++) { // creates the array of binary numbers
            vArray[i] = Integer.parseInt(v.substring(i, i + 1));
        }
        int[] kArray = new int[k.length()];
        for (int i = 0; i < k.length() - 1; i++) { // creates the array of binary numbers of the key
            kArray[i] = Integer.parseInt(k.substring(i, i + 1));
        }

        boolean completed = false;
        int iterVal = 0;
        int iterKey = 0;
        int[] currentDivisor = new int[v.length()];
        while (completed == false) {
            for (int i = 0; i < k.length(); i++) {
                currentDivisor[iterVal] = vArray[iterVal];
                iterVal++;
            }
            for (int i = 0; i < k.length(); i++) {
                System.out.println(currentDivisor[i] ^ kArray[i]); // i would have to store this somewhere else
            }
            for (int i = 0; i < currentDivisor.length; i++) {
                int i1 = currentDivisor[i];
                System.out.println(i1);
            }
            completed = true;
        }*/
    }
}
