/**
 * Created by isenseed on 11/4/2016.
 */
public class UILPacket {
    public static void main(String[] args) {
        int cnt = 0;
        for (int i = 100000; i > 0; i = i >> 1) {
            cnt += 1;
            System.out.println(i);
        }
        System.out.println("\n" + cnt);
    }
}
