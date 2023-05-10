import java.util.Scanner;
public class z23 {
    public static void main(String[] args){
        Scanner val = new Scanner(System.in);
        int n = val.nextInt();
        int num1 = val.nextInt();
        int num2 = val.nextInt();
        int count = 0;
        for(int i = 1; i <= n;i++){
            if(i % num1 == 0||i % num2 == 0){
                count += i;
            }
        }
        System.out.println(count);
    }
}