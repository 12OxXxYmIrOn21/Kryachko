import java.util.Arrays;

public class z26 {
    public static void main(String[] args) {
        String palindr = palindrString("aabbac");
        System.out.println(palindr + "\n" + palindr.length());
    }
    public static String palindr(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return str.substring(left + 1, right);
    }
    public static String palindrString(String str) {
        String longest = str.substring(0, 1);
        for (int i = 0; i < str.length() - 1; i++) {
            if (palindr(str, i, i).length() > longest.length()) {
                longest = palindr(str, i, i);
            }
            if (palindr(str, i, i + 1).length() > longest.length()) {
                longest = palindr(str, i, i + 1);
            }
        }
        return longest;
    }
}