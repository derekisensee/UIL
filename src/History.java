import java.io.*;
public class History {
    public static void main(String[] args) throws FileNotFoundException {
        java.util.Scanner in = new java.util.Scanner(new File("history.dat"));
        int sets = in.nextInt();
        int events = in.nextInt();
        while (sets-- > 0) {
            int[] questions = new int[events];
            for (int i = 0; i < questions.length; i++) { // initial array creation
                questions[i] = in.nextInt();
            }
            int grade = 1;
            for (int i = 0; i < events-1; i++) { // figuring out if in order
                grade = questions[i] < questions[i+1] ? grade+1 : grade;
            }
            System.out.println(grade);
        }
    }
}
