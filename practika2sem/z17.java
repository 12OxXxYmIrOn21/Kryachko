import java.util.Deque;
import java.util.LinkedList;

public class z17 {
    public static void main(String[] args){
        boolean linee = correctness("(((())()");
        System.out.println(linee);
    }
    public static boolean correctness(String str){
        while (str.contains("()")) {
            str = str.replaceAll("\\(\\)", "");
        }
        return (str.length() == 0);
    }
}