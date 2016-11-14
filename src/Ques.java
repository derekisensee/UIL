import java.util.*;

/**
 * Created by isenseed on 11/14/2016.
 */
public class Ques {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        for (int i = 0; i < 8000; i++) {
            q.add(Math.random());
        }
        System.out.println(q);
    }
}
