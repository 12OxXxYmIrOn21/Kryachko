import java.util.Scanner;

public class z39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(maxNum(number) > number){
            System.out.println(maxNum(number));
        } else {
            System.out.println(-1);
        }
    }
    public static int maxNum(int num){
        int[] arr = new int[10];
        String str = Integer.toString(num);
        for(int i= 0; i < str.length();i++){
            arr[str.charAt(i)-'0']++;
        }
        int M = 0;
        int composition = 1;
        for (int i = 0; i < 10; i++){
            while (arr[i] > 0) {
                M = M + (i * composition);
                arr[i]--;
                composition = composition * 10;
            }
        }
        return M;
    }
}